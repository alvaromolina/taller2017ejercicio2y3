package com.ucbcba.contar;

/**
 * Created by amolina on 09/08/17.
 */
public class Problem003b
{
    public static void main(String[] args)
    {
        long begin = System.currentTimeMillis();
        long n=600851475143L;
        for (long i = 2; i <= n; i++)
        {
            if (n % i==0)
            {
                System.out.println(i);
                n = n / i;
                i = 2;
            }
        }
        long end = System.currentTimeMillis();
        System.out.println(end-begin + "ms");
    }
}