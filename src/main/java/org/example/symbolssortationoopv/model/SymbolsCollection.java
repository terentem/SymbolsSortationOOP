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
            int index = currS.getFrequencyValue();
            if (sortedCollection[index] == null) {
                sortedCollection[index] = currS;
            } else {
                placedSymbol = sortedCollection[index];
                while(placedSymbol.getRefferenceToNextSymbol()!=null){
                    placedSymbol=placedSymbol.getRefferenceToNextSymbol();
                }
                placedSymbol.setNextFef(currS);
            }

            currS = currS.getRefferenceToPrevSymbol();
        }

        return sortedCollection;
    }

    private Symbol[] createFrameForCollection() {
        int collectionLength = Symbol.getMaxFrequency();
        Symbol[] frameForCollection = new Symbol[collectionLength + 1];
        return frameForCollection;
    }

    public int getCollectionLength() {
        return collectionLength;
    }

}



