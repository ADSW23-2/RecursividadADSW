package com.calata;

public class Divisor{

    public static int dividirRecursivo(int dividendo, int divisor){
        int resto = dividendo-divisor;
        if(resto < 0){
            return 0;
        }else{
            return 1 + dividirRecursivo(resto,divisor);
        }
    }

    public static int dividirIterativo(int dividendo,int divisor){
        int resto = 0;
        int cocciente = 0;
        while(dividendo-divisor >= 0){
            cocciente++;
            resto = dividendo - divisor;
            dividendo = resto;
        }
        return cocciente;
    }
}
