package com.turntabl.OCPExample2;

public class AsscendingOrder implements ValueComparator {

    @Override
    public int compare(int value1, int value2) {
        return value1 - value2;
    }
}
