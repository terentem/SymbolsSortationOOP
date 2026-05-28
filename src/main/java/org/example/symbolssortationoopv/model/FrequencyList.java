package org.example.symbolssortationoopv.model;

public class FrequencyList<E> {

    int size;
    WrapperForE[] frequencyList;

    public FrequencyList() {
        this.frequencyList = new WrapperForE[1];
    }

    public E putElement(E element, int frequency) {
        WrapperForE<E> wrapperForE = new WrapperForE<E>(element);//create wrapper for element E
        if (frequency > size) {
            createFrameForFrequencyList(frequency + 1);
        }
        WrapperForE<E> currentElement = frequencyList[frequency];
        if (currentElement == null) {
            frequencyList[frequency] = wrapperForE;

        } else {
            if (currentElement != null && currentElement.getNextElement() == null) {
                currentElement.setNextElement(wrapperForE);
            } else {
                while (currentElement.getNextElement() != null) {
                    currentElement = currentElement.getNextElement();
                }
                currentElement.setNextElement(wrapperForE);
            }
        }
        return getElement(frequency);
    }

    private int createFrameForFrequencyList(int newSize) {
        WrapperForE<E>[] tempFrequencyList = new WrapperForE[newSize];
        System.arraycopy(frequencyList, 0, tempFrequencyList, 0, frequencyList.length);
        frequencyList = tempFrequencyList;
        size = frequencyList.length;
        tempFrequencyList = null;
        return size;
    }

    public int getSize() {
        return size;
    }

    public E getElement(int index) {
        WrapperForE<E> tempElement = frequencyList[index];
        if (tempElement == null) {
            return null;
        }
        E element = tempElement.getElement();
        return element;
    }

    public WrapperForE getWrapperElement(int index) {
        WrapperForE<E> tempElement = frequencyList[index];
        return tempElement;
    }

    public String printFrequencyList(String text, FrequencyList<Symbol> frequencyList) {
        System.out.println("****************************************************");
        System.out.println(text);
        System.out.println("FrequencyList size=" + frequencyList.getSize());
        String listToString="";
        ;
        for (int i = 0; i < frequencyList.getSize(); i++) {
            if (frequencyList.getElement(i) == null) {
                continue;
            }
            if (frequencyList.getWrapperElement(i).getNextElement() == null) {
                Symbol symbol = frequencyList.getElement(i);
                System.out.println(symbol.getSymbolValue() + ":" + symbol.getFrequencyValue() + ";");
                listToString=listToString+symbol.getSymbolValue() + ":" + symbol.getFrequencyValue() + ";";
            } else {
                WrapperForE<Symbol> currentElement = frequencyList.getWrapperElement(i);
                while (currentElement != null) {
                    Symbol symbol = currentElement.getElement();
                    System.out.print(symbol.getSymbolValue() + ":" + symbol.getFrequencyValue() + "->");
                    currentElement = currentElement.getNextElement();
                    listToString=listToString+symbol.getSymbolValue() + ":" + symbol.getFrequencyValue() + ";";
                }
                System.out.println(";");
            }
        }
        System.out.println();
        return listToString;
    }

}

