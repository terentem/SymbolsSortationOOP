package org.example.symbolssortationoopv.utils;

import org.example.symbolssortationoopv.model.Symbol;

public class Printer {


    public static void printPlainText(String text) {
        System.out.println(text);
    }

    public static void printSortedSymbolFrequency(String text, Symbol[] sortedCollectionOfRefs) {
        System.out.println(text);
        Symbol placedS;
        for (Symbol c : sortedCollectionOfRefs) {
            if (c == null) {
                continue;
            }
            if (c != null) {
                if (c.getRefferenceToNextSymbol() == null) {
                    System.out.print(c.getSymbolValue() + ":" + c.getFrequencyValue() + "; ");
                } else {
                    placedS = c;
                    while (placedS != null) {
                        System.out.print(placedS.getSymbolValue() + ":" + placedS.getFrequencyValue() + ", ");
                        placedS = placedS.getRefferenceToNextSymbol();
                    }
                    ;System.out.print(";");
                }
            }
        }
        System.out.println();
    }

    public static void printObjectsByLinks(String text, Symbol lastLink) {
        System.out.println(text);
        Symbol currS = lastLink;
        Symbol prevS;

        while (currS != null) {
            prevS = currS.getRefferenceToPrevSymbol();
            System.out.print(currS.getSymbolValue() + ":" + currS.getFrequencyValue() + ", ");
            currS = prevS;
        }
        System.out.println();

    }
}
