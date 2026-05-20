package org.example.symbolssortationoopv;

import org.example.symbolssortationoopv.model.Symbol;
import org.example.symbolssortationoopv.model.SymbolsCollection;
import org.example.symbolssortationoopv.utils.LinkedObjectsCreator;
import org.example.symbolssortationoopv.utils.Printer;
import org.example.symbolssortationoopv.utils.StringConvertor;

public class SortApplication {


    public static void startSortation(String strOfSymbols) {

        //1. Convert text(String) into array of char symbols
        char[] charOfSymbols = StringConvertor.convertStringToCharArr(strOfSymbols);

        //2. Create linked set of objects of Symbol type in heap for every unique symbol from array of char symbols
        LinkedObjectsCreator.createLinkedObjects(charOfSymbols);
        Symbol lastRefOfLinkedObjects = LinkedObjectsCreator.getLastRefOfLinkedObjects();

        //3.Create collection of unique Symbol objects
        SymbolsCollection sb=new SymbolsCollection(lastRefOfLinkedObjects);
        Symbol[] sortedCollection=sb.sortCollection();

        //4.Print this value
        String text="Unsorted unique symbols:";
        Printer.printObjectsByLinks(text, lastRefOfLinkedObjects);
        text="Sorted symbols by frequency:";
        Printer.printSortedSymbolFrequency(text, sortedCollection);

    }
}




