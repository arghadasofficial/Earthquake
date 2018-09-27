/*
 * Copyright (C) 2018 shadestreak
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
package argha;

/**
 *
 * @author shadestreak
 */
public class InfoModel {

    private String place;
    private String magnitutde;
    //private String;

    public InfoModel(String place, String magnitutde) {
        this.place = place;
        this.magnitutde = magnitutde;
    }

    public String getPlace() {
        return place;
    }

    public String getMagnitutde() {
        return magnitutde;
    }
}
