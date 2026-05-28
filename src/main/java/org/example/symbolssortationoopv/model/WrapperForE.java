package org.example.symbolssortationoopv.model;

public class WrapperForE<E> {

    E element;
    WrapperForE<E> nextElement;


    public WrapperForE(E element) {
        this.element=element;
            }

    public E getElement() {
        return  element;
    }

    public void setNextElement(WrapperForE<E> nextElement) {
        this.nextElement = nextElement;
    }

    public WrapperForE<E> getNextElement() {
        return nextElement;
    }
}
