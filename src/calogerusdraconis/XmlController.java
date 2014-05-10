/*
 * Copyright (C) 2014 Calogerus Draconis Team
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package calogerusdraconis;

import java.io.File;
import java.io.IOException;
import java.util.List;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

/**
 *
 * @author Dariel Valdano
 */
public class XmlController {

	public UserDragon LoadDragon(String name) throws Exception{
		UserDragon retval = null;
		try {
			
			// Load XML and get root Node
			SAXBuilder builder = new SAXBuilder();
			File xmlFile = new File("calogerusSave.xml");
			Document document = (Document) builder.build(xmlFile);
			Element rootNode = document.getRootElement();
			
			//get list of root/save nodes
			List saves = rootNode.getChildren("save");
			
			//iterate each root/save inside XML
			for (Object aSave : saves) {
				Element save = (Element) aSave;
				
				//get root/save/userDragon
				Element userDragon = (Element) save.getChildren("userDragon").get(0);
				
				//check if name is equal
				if (userDragon.getChildText("name").equals(name)) {
					System.out.println("Dragon Name : " + userDragon.getChildText("name"));
					retval = new UserDragon(
							userDragon.getChildText("name"), 
							Float.parseFloat(userDragon.getChildText("health")),
							Float.parseFloat(userDragon.getChildText("maxHealth")),
							Float.parseFloat(userDragon.getChildText("stamina")),
							Float.parseFloat(userDragon.getChildText("maxStamina")),
							Float.parseFloat(userDragon.getChildText("thirst")),
							Float.parseFloat(userDragon.getChildText("bladder")),
							Float.parseFloat(userDragon.getChildText("hunger")),
							Integer.parseInt(userDragon.getChildText("level")),
							Integer.parseInt(userDragon.getChildText("experience")),
							userDragon.getChildText("password"),
							Integer.parseInt(userDragon.getChildText("money")),
							Float.parseFloat(userDragon.getChildText("happiness"))
					);
					System.out.println("Dragon Name : " + userDragon.getChildText("name"));
					List invList = userDragon.getChildren("inventory").get(0).getChildren("item");
					for (Object anObj : invList) {
						Element node = (Element) anObj;
						System.out.println("Inventory Name : " + node.getText());
					}
				}
			}
		} catch (IOException | JDOMException io) {
			System.out.println(io.getMessage());
		}
		
		if (retval == null) {
			throw new Exception("Cannot Find UserDragon");
		} else {
			return retval;
		}
	}
}