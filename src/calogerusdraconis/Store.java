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

import java.util.ArrayList; 

// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.E6BDD020-1BE0-47FA-DEC1-23321E47E085]
// </editor-fold> 
public final class Store {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.F02D507C-955C-E473-70F5-66CF2BE0A57E]
    // </editor-fold> 
    private ArrayList<Consumable> fdInventory;
	
	private Store s = new Store();
	
    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.0162CBAA-064B-21DC-586A-5086BCF89195]
    // </editor-fold> 
    private Store () {
		fdInventory.add(new Consumable("first-aid","",200,0,0,300));
		fdInventory.add(new Consumable("potion","",250,0,0,400));
		fdInventory.add(new Consumable("hi-potion","",500,0,0,600));
		fdInventory.add(new Consumable("x-potion","",1000,0,0,1000));
		fdInventory.add(new Consumable("ether","",200,0,0,300));
		fdInventory.add(new Consumable("hi-ether","",500,0,0,600));
	}
	
	private Store getInstance() {
		return s;
	}

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.5BA2A08B-741C-A0B6-B5B5-84388C3CA7EC]
    // </editor-fold> 
    public ArrayList<Consumable> getFdInventory () {
        return fdInventory;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.4AC594BD-9B48-8604-6DC2-329B93CE310C]
    // </editor-fold> 
    public void setFdInventory (ArrayList<Consumable> val) {
        this.fdInventory = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.51BC2E63-3236-4A18-2895-B470C93E454E]
    // </editor-fold> 
    public Consumable buy (int arrLoc) {
        return null;
    }

}

