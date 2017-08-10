package com.ucbcba.contar;

/**
 * Created by amolina on 15/02/17.
 */
public class HashMap implements Map {

    Tuple[] tuples;
    int index;



    HashMap(int max){
        tuples = new Tuple[max];
        index = 0;

    }


    public boolean hasKey(char c) {
        return getIndex(c) >= 0;
    }

    public int getIndex(char c){
        for (int i=0; i < index; i++){
            if(tuples[i].getKey() == c)
                return i;
        }
        return -1;
    }

    public void put(char key, int value) {

        int tmpIndex = getIndex(key);
        Tuple tuple = new Tuple(key, value);
        if(tmpIndex >=0 ){
            tuples[tmpIndex] = tuple;
        }else{
            tuples[index] = tuple;
            index++;
        }

    }

    public int get(char key) {
        return tuples[getIndex(key)].getValue();
    }

    public int size(){
        return index;
    }
    public Tuple getByIndex(int index){
        return tuples[index];

    }
}
