package org.example.symbolssortationoopv.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FrequencyListTest {

    @Test
    void shouldReturnElement() {

        Symbol symbolA = new Symbol('a');//Data for test
        for (int i = 0; i < 2; i++) {
            symbolA.countFrequency();
        }
        Symbol symbolB = new Symbol('b');
        for (int i = 0; i < 2; i++) {
            symbolB.countFrequency();
        }
        Symbol expectedResult = symbolB;

        FrequencyList<Symbol> frequencyList = new FrequencyList<>();
        frequencyList.putElement(symbolA, symbolA.getFrequencyValue());
        frequencyList.putElement(symbolB, symbolB.getFrequencyValue());
        Symbol result = (Symbol) frequencyList.getWrapperElement(3).getNextElement().element;

        assertEquals(expectedResult, result);
    }
}