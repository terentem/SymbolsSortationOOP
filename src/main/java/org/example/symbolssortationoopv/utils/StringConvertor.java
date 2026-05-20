package org.example.symbolssortationoopv.utils;

public class StringConvertor {
    String text;

    public StringConvertor(String text){
        this.text=text;
    }

    public static char[] convertStringToCharArr(String text){
        char[] charOfSymbols = new char[text.length()];
        text.getChars(0, text.length(), charOfSymbols, 0);
        return charOfSymbols;
    }
}
