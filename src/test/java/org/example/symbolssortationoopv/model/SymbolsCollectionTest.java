package org.example.symbolssortationoopv.model;

import org.example.symbolssortationoopv.utils.LinkedObjectsCreator;
import org.example.symbolssortationoopv.utils.Printer;
import org.example.symbolssortationoopv.utils.StringConvertor;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SymbolsCollectionTest {
    public static char[] dataForTest;
    public static String lotOfSymbols;


    @Test
    void putSymbol() {
        char expected='\u266c';
        String lotOfSymbols = "ckufnbdycjjgozbvrgnjiyvpccdazhjrhodnhdpgpqpnjkohbspjrexolyporksobdwilroqlpllaft";
        char[] charOfSymbols = StringConvertor.convertStringToCharArr(lotOfSymbols);
        LinkedObjectsCreator.createLinkedObjects(charOfSymbols);
        Symbol lastRefOfLinkedObjects = LinkedObjectsCreator.getLastRefOfLinkedObjects();
        SymbolsCollection sb=new SymbolsCollection(lastRefOfLinkedObjects);
        Symbol[] sortedCollection=sb.sortCollection();
        Symbol newS=new Symbol('\u266c');
        for(int i=0;i<5;i++){
            newS.countFrequency();
        }
         sb.putSymbol(newS);

        Symbol s=sb.getSymbolByFrequency(6);
        char result=s.getRefferenceToNextSymbol().getSymbolValue();
        System.out.println("Нотка="+result);
        assertEquals(expected, result);
    }
}