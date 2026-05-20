package org.example.symbolssortationoopv.model;
@Deprecated
public class CollectionForSymbolObjects {

    private Symbol[] arreyOfReffsForSymbolObject;
    private Symbol ref;
    private  int lengthOfCollection = 0;
    private Symbol[] sortedCollection;

    public CollectionForSymbolObjects(Symbol ref) {
        arreyOfReffsForSymbolObject = new Symbol[1];
        arreyOfReffsForSymbolObject[0] = ref;
        lengthOfCollection = 1;
    }

    public void putNewRefOfSymbol(Symbol ref) {
        lengthOfCollection++;
        Symbol[] tempArrey = new Symbol[lengthOfCollection];
        System.arraycopy(arreyOfReffsForSymbolObject, 0, tempArrey, 0, lengthOfCollection - 1);
        arreyOfReffsForSymbolObject = tempArrey;
        tempArrey = null;
        arreyOfReffsForSymbolObject[lengthOfCollection - 1] = ref;
    }


    public int getLengthOfCollection() {
        return lengthOfCollection;
    }

    public Symbol[] getArreyOfReffsForSymbolObject() {
        return arreyOfReffsForSymbolObject;
    }

}
