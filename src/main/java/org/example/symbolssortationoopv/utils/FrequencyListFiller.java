package org.example.symbolssortationoopv.utils;

import org.example.symbolssortationoopv.model.FrequencyList;
import org.example.symbolssortationoopv.model.Symbol;


public class FrequencyListFiller {
    char[] charOfSymbols;
    int countUniqueSymbols = 0;
    FrequencyList<Symbol> frequencyList;

    public FrequencyListFiller(char[] listOfCharSymbols, FrequencyList<Symbol> frequencyList) {
        this.charOfSymbols = listOfCharSymbols;
        this.frequencyList = frequencyList;
    }

    public int fillFrequenceList() {
        Symbol uniqueSymbol = new Symbol(charOfSymbols[0]);//first symbol is unique by definition
        countUniqueSymbols = 1;
        for (int i = 0; i < charOfSymbols.length; i++) {
            if (charOfSymbols[i] == '\u2600') {
                continue;
            }
            if (charOfSymbols[i] != uniqueSymbol.getSymbolValue()) {
                uniqueSymbol = new Symbol(charOfSymbols[i]);
                countUniqueSymbols++;
            }
            for (int j = i + 1; j < charOfSymbols.length; j++) {
                if (charOfSymbols[j] == charOfSymbols[i]) {
                    uniqueSymbol.countFrequency();
                    charOfSymbols[j] = '\u2600';
                }
            }
            frequencyList.putElement(uniqueSymbol, uniqueSymbol.getFrequencyValue());

        }
        return countUniqueSymbols;
    }

    public int getCountUniqueSymbols() {
        return countUniqueSymbols;
    }
}
