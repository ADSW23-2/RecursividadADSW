package com.calata;


public class Busqueda {

    public static int busquedaBinaria(int[] list,int first, int last, int value){
        int medio = (last+first)/2;
        if(first > last || medio >= list.length || medio < 0){
            return -1;
        }
        if(list[medio] == value){
            return medio;
        }
        if (list[medio] > value) {
            return busquedaBinaria(list,first,medio-1,value);
        }
        return busquedaBinaria(list,medio+1,last,value);

    }
}
