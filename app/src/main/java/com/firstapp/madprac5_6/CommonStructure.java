package com.firstapp.madprac5_6;

public class CommonStructure {

    private static Structure passedStructure = null;

    public static Structure getpassedStructure() {return passedStructure;}

    public static void setPassedStructure(Structure newStructure){passedStructure = newStructure;}

    public static void clearPassedStructure(){passedStructure = null;}
}
