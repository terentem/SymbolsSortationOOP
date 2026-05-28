package org.example.symbolssortationoopv;

import org.example.symbolssortationoopv.model.FrequencyList;
import org.example.symbolssortationoopv.model.Symbol;
import org.example.symbolssortationoopv.utils.FrequencyListFiller;

public class SymbolSorter {
 public int numberOfUniqueSymbols;
    public FrequencyList<Symbol> createSortedListOfUniqueSymbols(char[] listOfSYmbols) {

        FrequencyList<Symbol> frequencyList = new FrequencyList();
        FrequencyListFiller frequencyListFiller = new FrequencyListFiller(listOfSYmbols, frequencyList);
        frequencyListFiller.fillFrequenceList();

        numberOfUniqueSymbols= frequencyListFiller.getCountUniqueSymbols();

        return frequencyList;
    }
}





