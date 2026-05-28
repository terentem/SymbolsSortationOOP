package org.example.symbolssortationoopv;

import org.example.symbolssortationoopv.model.FrequencyList;
import org.example.symbolssortationoopv.model.Symbol;
import org.example.symbolssortationoopv.utils.Printer;
import org.example.symbolssortationoopv.utils.StringConvertor;

public class Main {

    public static void main(String[] args) {

        //Data for task
        String strOfSymbols = args[0];

        //Convert String strOfSymbols into array of chars
        StringConvertor stringConvertor = new StringConvertor(strOfSymbols);
        char[] arrayOfChars = stringConvertor.convertStringToCharArr();

        //Sort symbols by frequency
        SymbolSorter symbolSorter = new SymbolSorter();
        FrequencyList<Symbol> sortedListOfSymbols = symbolSorter.createSortedListOfUniqueSymbols(arrayOfChars);

        //Print result
        String text = "Number of unique sumbols is: "+symbolSorter.numberOfUniqueSymbols;
        Printer.printPlainText(text);
        text = "List of symbols sorted by frequency:";
        String returnetStringOfSortedElements=sortedListOfSymbols.printFrequencyList(text, sortedListOfSymbols);
        Printer.printPlainText(returnetStringOfSortedElements);
    }
}