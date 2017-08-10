package com.ucbcba.contar;

/**
 * Created by amolina on 15/02/17.
 */
public class Tuple {


    final int CONSTANTE=1;
    private char key;
    private int value;


    Tuple(char key, int value){
        this.key = key;
        this.value = value;
    }


    public char getKey() {
        return key;
    }

    public void setKey(char key) {
        this.key = key;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
