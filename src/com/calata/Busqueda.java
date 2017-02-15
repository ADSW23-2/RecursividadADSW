package com.calata;

import java.util.ArrayList;
import java.util.List;

public class Busqueda {


    //Metodo Alfonso
    //Quiero reducir carga en memoria, creando nuevos arrays, en luagar de acotar indices
    public static int busquedaBinariaAlfonso(int[] list,int first, int last, int value){
        if(list.length == 0){
            return -1;
        }
        int medio = (last+first)/2;
        if(list[medio] == value){
            return medio;
        }
        int newlast = last;
        int newfirst = first;
        if ( list[first] > list[medio] && value < list[medio]) {
            newlast = medio;
            return busquedaBinariaAlfonso(list,first,newlast,value);
        }
        if (list[first] < list[medio] && value > list[medio]){
            newfirst = medio;
            return busquedaBinariaAlfonso(list,newfirst,newlast,value);
        }
        return -1;
    }
    public static int busquedaBinariaCalata(int[] list,int first, int last, int value){
        int medio = (last+first)/2;
        if(first > last || medio >= list.length || medio < 0){
            return -1;
        }
        if(list[medio] == value){
            return medio;
        }
        if (list[medio] > value) {
            return busquedaBinariaCalata(list,first,medio-1,value);
        }else{
            return busquedaBinariaCalata(list,medio+1,last,value);
        }

    }

    /*public static boolean busquedaBinariaLista(List<Integer> list, int first, int last, int value){
        if(list.size() == 0){
            return false;
        }
        int medio = (last-first)/2 + first;
        if(list.get(medio) == value){
            return true;
        }
        List<Integer> izquierda = new ArrayList<>(list.subList(first,medio-1));
        List<Integer> derecha = new ArrayList<>(list.subList(medio+1,last));
        if (list.get(medio) > value) {
            return busquedaBinariaLista(izquierda,0,izquierda.size(),value);
        }else{
            return busquedaBinariaLista(derecha,0,derecha.size(),value);
        }
    }*/


    /*public static boolean busquedaBinaria(int[] list,int first, int last, int value){
        if(list.length == 0){
            return false;
        }
        int medio = (last+1 - first)/2 + first;
        if(list[medio] == value){
            return true;
        }
        int[] derecha = new int[last-medio+1];
        int[] izquierda = new int[medio-first];
        System.arraycopy(list,first,izquierda,0,medio-first);
        System.arraycopy(list,medio,derecha,0,last+1-medio);

        return busquedaBinariaT(izquierda,value) || busquedaBinariaT(derecha,value);
    }

    private static boolean busquedaBinariaT(int[] list, int value) {
        if (list.length == 0) { return false; }
        int medio = list.length / 2;
        if (list[medio] == value) { return true; }
        int[] izquierda;
        int[] derecha;
        if(medio == 0){
            izquierda = new int[medio+1];
            derecha = new int[list.length - medio - 1];
            System.arraycopy(list,0,izquierda,0,medio+1);
            System.arraycopy(list,medio,derecha,0,list.length-medio-1);
        }else{
            izquierda = new int[medio];
            derecha = new int[list.length - medio];
            System.arraycopy(list,0,izquierda,0,medio);
            System.arraycopy(list,medio,derecha,0,list.length-medio);
        }

        if (list[medio] > value) {
            return busquedaBinariaT(izquierda, value);
        }
        if(list[medio] < value){
            return busquedaBinariaT(derecha, value);
        }
        return false;
    }

    public static boolean busquedaBinariaV2(int[] list,int first, int last, int value){
        if(list.length == 0){
            return false;
        }
        int medio = (last+1 - first)/2 + first;
        if(list[medio] == value){
            return true;
        }
        int[] derecha = new int[last-medio+1];
        int[] izquierda = new int[medio-first];
        System.arraycopy(list,first,izquierda,0,medio-first);
        System.arraycopy(list,medio,derecha,0,last+1-medio);
        if (list[medio] > value) {
            return busquedaBinariaT(izquierda, value);
        }
        if (list[medio] > value){
            return busquedaBinariaT(derecha, value);
        }
        return false;
    }*/
}
