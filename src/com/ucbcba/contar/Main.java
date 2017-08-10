package com.ucbcba.contar;

public class Main {

    public static void main(String[] args) {

        String cadena = args[0];
        contar(cadena,   new HashMap(1000));


	// write your code here
    }


    static void  contar(String cadena, Map map){


        for (int i=0;i < cadena.length();i++){
            char key = cadena.charAt(i);
            if(map.hasKey(cadena.charAt(i))){
                map.put(key, map.get(key)+1);
            }else{
                map.put(key, 1);
            }

        }
        for (int i=0; i < map.size(); i++){
            Tuple tuple = map.getByIndex(i);
            if(tuple.getValue() > 1){
                System.out.println(tuple.getKey()+":"+tuple.getValue());

            }
        }
    }
}
