package org.example.symbolssortationoopv.model;

public class Symbol {
    private char symbolValue;
    private int frequencyValue = 0;

    public Symbol(char symbol) {
        this.symbolValue = symbol;

        this.frequencyValue++;
    }

    public void countFrequency() {
        this.frequencyValue++;
    }

    public char getSymbolValue() {
        return symbolValue;
    }

    public int getFrequencyValue() {
        return frequencyValue;
    }

}
