package com.ucbcba.contar;

/**
 * Created by amolina on 09/08/17.
 */
public class Problem3 {


    public static boolean isPrime(long n)
    {
        if ( n % 2 == 0 )
            return false;

        long half = n/2;
        for ( int i = 3; i < half; i += 2 )
        {
            if ( n % i == 0 )
                return false;
        }

        return true;
    }

    public  static void main(String args[]){
        long t = 600851475143L;
        long d = 2;
        while (1==1)
        {
            long tmp = 600851475143L / d;
            if ( t % tmp == 0 &&  isPrime(tmp) )
            {
                System.out.println("= " + tmp);
                break;
            }
            d++;
        }
    }
}
