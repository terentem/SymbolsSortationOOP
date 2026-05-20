package org.example.symbolssortationoopv.utils;

import org.example.symbolssortationoopv.model.Symbol;

public class LinkedObjectsCreator {
    private static Symbol lastRefOfLinkedObjects;
    private static Symbol[] unSortedUniqueSymbols;

    public static Symbol getLastRefOfLinkedObjects() {
        return lastRefOfLinkedObjects;
    }

    public static Symbol[] getUnsortedUniqueSymbols() {
        return unSortedUniqueSymbols;
    }

    public static void createLinkedObjects(char[] charOfSymbols) {
        Symbol[] unsortedUniqueSymbols;
        Symbol uniqueSymbol = new Symbol(charOfSymbols[0]);//first symbol is unique by definition
        //CollectionForSymbolObjects reffs = new CollectionForSymbolObjects(uniqueSymbol);
        Symbol prevRef;
        for (int i = 0; i < charOfSymbols.length; i++) {
            if (charOfSymbols[i] == '\u2600') {
                continue;
            }
            if (charOfSymbols[i] != uniqueSymbol.getSymbolValue()) {
                prevRef = uniqueSymbol;
                uniqueSymbol = new Symbol(charOfSymbols[i], prevRef);
                //reffs.putNewRefOfSymbol(uniqueSymbol);
            }
            for (int j = i + 1; j < charOfSymbols.length; j++) {
                if (charOfSymbols[j] == charOfSymbols[i]) {
                    uniqueSymbol.countFrequency();
                    charOfSymbols[j] = '\u2600';
                }
            }
        }
        lastRefOfLinkedObjects = uniqueSymbol;
        //unSortedUniqueSymbols = reffs.getArreyOfReffsForSymbolObject();

    }
}
