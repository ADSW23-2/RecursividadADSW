package com.calata;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;


public class BinarySearchTest {


    private List<Integer> dividendosPrueba = new ArrayList<>();
    private List<Integer> divisoresPrueba = new ArrayList<>();
    private int[] numeros = {1,2,3,4,5,6,9,10,48};
    private int[] numerosEncontrar = {-4,5,50};

    @Before
    public void setUp(){

        //Llenamos las listas
        for(Integer i = 1; i < 10000; i++){
            dividendosPrueba.add(i);
            if(i <= 1000){
                divisoresPrueba.add(i);
            }
        }

    }

    @Test
    public void busquedaBinaria() throws Exception {
        assertEquals(-1,Busqueda.busquedaBinaria(numeros,0,numeros.length-1,numerosEncontrar[0])); //No Está
        assertEquals(-1,Busqueda.busquedaBinaria(numeros,4,numeros.length-3,numerosEncontrar[0])); //No está
        assertEquals(4,Busqueda.busquedaBinaria(numeros,0,numeros.length-1,numerosEncontrar[1])); //Está
        assertEquals(4,Busqueda.busquedaBinaria(numeros,0,numeros.length/2,numerosEncontrar[1])); //Está
        assertEquals(-1,Busqueda.busquedaBinaria(numeros,0,(numeros.length-2)/2,numerosEncontrar[1])); //No está
        assertEquals(-1,Busqueda.busquedaBinaria(numeros,numeros.length-2,numeros.length-1,numerosEncontrar[2])); //Está
    }

    @Test
    public void dividirRecursivo() throws Exception {
        for(Integer dividendos : dividendosPrueba){
            for(Integer divisores : divisoresPrueba){
                assertEquals(dividendos/divisores, Division.dividirRecursivo(dividendos,divisores));
            }
        }

    }

    @org.junit.Test
    public void dividirIterativo() throws Exception {
        for(Integer dividendos : dividendosPrueba){
            for(Integer divisores : divisoresPrueba){
                assertEquals(dividendos/divisores, Division.dividirIterativo(dividendos,divisores));
            }
        }
    }

}