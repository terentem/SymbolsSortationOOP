package org.example.symbolssortationoopv;

import org.example.symbolssortationoopv.model.Symbol;
import org.example.symbolssortationoopv.model.SymbolsCollection;
import org.example.symbolssortationoopv.utils.LinkedObjectsCreator;
import org.example.symbolssortationoopv.utils.Printer;
import org.example.symbolssortationoopv.utils.StringConvertor;

public class SortApplication {// TODO : rename into SymbolSorter


    public static void startSortation(String strOfSymbols) {//TODO: rename metod into execute, remove static

        //1. Convert text(String) into array of char symbols
        char[] charOfSymbols = StringConvertor.convertStringToCharArr(strOfSymbols);//TODO: move to Main as SymbolSortRequest

        //2. Create linked set of objects of Symbol type in heap for every unique symbol from array of char symbols
        LinkedObjectsCreator.createLinkedObjects(charOfSymbols);
        Symbol lastRefOfLinkedObjects = LinkedObjectsCreator.getLastRefOfLinkedObjects();//TODO: make it not static class field

        //3.Create collection of unique Symbol objects
        SymbolsCollection sb=new SymbolsCollection(lastRefOfLinkedObjects);//TODO: rename sb->symbolCollection
        Symbol[] sortedCollection=sb.sortCollection();
       
        
       //4.Print this value
String text="Unsorted unique symbols:"; //TODO: move to Main
Printer.printObjectsByLinks(text, lastRefOfLinkedObjects);
text="Sorted symbols by frequency:";
Printer.printSortedSymbolFrequency(text, sortedCollection);

    }
}




