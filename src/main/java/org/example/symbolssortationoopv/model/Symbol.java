package org.example.symbolssortationoopv.model;

public class Symbol {
    private char symbolValue;
    private int frequencyValue = 0;
    //private static int countOfAlluniqueSymbols;
    //private Symbol refferenceToPrevSymbol;
    //private static int maxFrequency=0;
    //private Symbol refferenceToNextSymbol;

    public Symbol(char symbol) {
        this.symbolValue = symbol;
        //this.countOfAlluniqueSymbols++;
        this.frequencyValue++;
    }

    /*public Symbol(char symbol, Symbol prevRef) {
        this.symbolValue = symbol;
        //this.refferenceToPrevSymbol = prevRef;
        this.frequencyValue++;
       // this.countOfAlluniqueSymbols++;

    }*/

    public void countFrequency() {
        this.frequencyValue++;
        //if(frequencyValue>maxFrequency){maxFrequency=frequencyValue;}
    }

    //public void setNextFef(Symbol nextRef){
        //this.refferenceToNextSymbol=nextRef;
    //}

    public char getSymbolValue() {
        return symbolValue;
    }

    //public Symbol getRefferenceToPrevSymbol() {
       // return refferenceToPrevSymbol;
    //}

    public int getFrequencyValue() {
        return frequencyValue;
    }

    //public static int getCountOfAlluniqueSymbols() {
     //   return countOfAlluniqueSymbols;
    //}

   // public static int getMaxFrequency() {
     //   return maxFrequency;
   // }

    //public Symbol getRefferenceToNextSymbol() {
      //  return refferenceToNextSymbol;
   // }
}
