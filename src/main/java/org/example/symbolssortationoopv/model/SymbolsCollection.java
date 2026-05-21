package org.example.symbolssortationoopv.model;

public class SymbolsCollection {
    private Symbol lastRef;
    private int collectionLength;
    private Symbol[] sortedCollection;

    public SymbolsCollection(Symbol lastRef) {
        this.lastRef = lastRef;
    }

    public Symbol[] sortCollection() {
        sortedCollection = createFrameForCollection();
        Symbol currS = lastRef;
        Symbol placedSymbol;
        while (currS != null) {
            putSymbol(currS);
            currS = currS.getRefferenceToPrevSymbol();
        }

        return sortedCollection;
    }

    private Symbol[] createFrameForCollection() {
        int collectionLength = Symbol.getMaxFrequency();
        Symbol[] frameForCollection = new Symbol[collectionLength + 1];
        return frameForCollection;
    }

    public void putSymbol(Symbol symbol) {
        int index = symbol.getFrequencyValue();
        Symbol placedS;
        if (sortedCollection[index] == null) {
            sortedCollection[index] = symbol;
        } else {
            placedS = sortedCollection[index];
            while (placedS.getRefferenceToNextSymbol() != null) {
                placedS = placedS.getRefferenceToNextSymbol();
            }
            placedS.setNextFef(symbol);
        }
    }

public Symbol getSymbolByFrequency(int frequency) {
    return sortedCollection[frequency];
}

    public int getCollectionLength() {
        return collectionLength;
    }

}



