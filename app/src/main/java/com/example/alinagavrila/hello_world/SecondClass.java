package com.example.alinagavrila.hello_world;

public class SecondClass {

 //   public String message = "Aladin";

    private static void DisplayMessage(String message){
        System.out.println ("This is an important message: " + message);
    }

    public static String MakeADream (String dream)
    {
        return dream;
    }

    public static void main (String[] args){
        DisplayMessage("Aladin");
    }

}
