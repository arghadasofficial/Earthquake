/*
 * Copyright (C) 2018 Argha Das
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
package argha.Utils;

import argha.InfoModel;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author Argha Das
 */
public class ParseUtil {

    public ArrayList<InfoModel> parseJson(String data) {
        ArrayList<InfoModel> infoModels = new ArrayList<>();
        try {
            JSONObject root = new JSONObject(data);
            JSONArray featureArray = root.getJSONArray("features");
            
            for(int i = 0; i < featureArray.length(); i++){
                JSONObject currentData = featureArray.getJSONObject(i);
                JSONObject properties = currentData.getJSONObject("properties");
                
                String mag = properties.getString("mag");
                String place = properties.getString("place");
                
                infoModels.add(new InfoModel(place, mag));
            }

        } catch (JSONException ex) {
            Logger.getLogger(ParseUtil.class.getName()).log(Level.SEVERE, null, ex);
        }
        return infoModels;

    }
}
