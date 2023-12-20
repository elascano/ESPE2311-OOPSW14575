package ec.edu.espe.parent.view;

import com.google.gson.Gson;
import ec.edu.espe.parent.model.Parent;

//@author Rony Cedeño, INTERBYTE, DCCOESPE-14575
public class Main {

    public static void main(String[] args) {

        String jsonString = "{ \"id\" : 1, \"name\" : \"Edison\", \"parents\" : [{ \"id\" : 1, \"name\" : \"\" }, { \"id\" : 2, \"name\" : \"Isabel\" }], \"isStudying\": false }";
        Gson gson = new Gson();

        Parent parent = gson.fromJson(jsonString, Parent.class);
        System.out.println("Parent : " + parent.toString());
    }
}
