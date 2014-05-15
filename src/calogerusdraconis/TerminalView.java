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

/**
 *
 * @author Willy
 */
public class TerminalView implements View {
 
    public TerminalView () {
        super();
    }

	@Override
    public void UpdateScreen (UserDragon drg) {
		ArrayList<Consumable> ac = drg.getFdInventory();
		for (Consumable c : ac) {
			System.out.println(c.getName());
		}
	}

	@Override
    public void UpdateScreen (Store str) {
    }

	@Override
    public void UpdateScreen (UserDragon drg, Dragon enemy) {
    }

	@Override
    public void UpdateScreen (UserDragon drg, Event evnt) {
		System.out.println(evnt.getMessage());
    }

}

