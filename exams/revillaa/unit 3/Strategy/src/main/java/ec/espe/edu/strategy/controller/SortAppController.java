package ec.espe.edu.strategy.controller;

import com.google.gson.Gson;
import ec.espe.edu.strategy.model.SortApp;
import java.util.ArrayList;

/**
 *
 * @author Antonio Revilla
 */

public class SortAppController {

    public static ArrayList loadSortApp(ArrayList<String> jsons) {
        ArrayList<SortApp> sorts;
        sorts = new ArrayList<>();

        for (String json : jsons) {
            sorts.add(jsonToSortApp(json));
        }

        return sorts;
    }

    public static SortApp jsonToSortApp(String json) {
        SortApp sortApp;
        Gson gson;
        gson = new Gson();

        int[] unordered = new int[7];
        int[] ordered = new int[7];
        
        sortApp = new SortApp(unordered,ordered);

        sortApp = gson.fromJson(json, sortApp.getClass());

        return sortApp;
    }
}
