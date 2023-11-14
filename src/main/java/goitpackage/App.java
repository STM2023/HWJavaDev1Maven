package goitpackage;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class App
{
    public static void main( String[] args )     {


        System.out.println( "test Maven :" );

        Human student = new Human();
        student.name = "Tetiana";
        student.lastname="Stadnik";

        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();
        System.out.println( " "+new Gson().toJson(student));

    }
}