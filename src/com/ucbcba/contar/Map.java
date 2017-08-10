package com.ucbcba.contar;

/**
 * Created by amolina on 15/02/17.
 */
public interface Map {


    boolean hasKey(char c);

    void put(char key, int value);
    int get(char key);
    int size();
    Tuple getByIndex(int i);

}
