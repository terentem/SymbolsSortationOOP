package org.example.symbolssortationoopv.utils;

public class StringConvertor {
    private String text;
    private char[] charOfSymbols;

    public StringConvertor(String text){
        this.text=text;
    }

    public char[] convertStringToCharArr(){
        charOfSymbols = new char[text.length()];
        text.getChars(0, text.length(), charOfSymbols, 0);
        return charOfSymbols;
    }
}
