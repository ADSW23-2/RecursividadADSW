package com.calata;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;


public class DivisorTest {


    private List<Integer> dividendosPrueba = new ArrayList<>();
    private List<Integer> divisoresPrueba = new ArrayList<>();

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
    public void dividirRecursivo() throws Exception {
        for(Integer dividendos : dividendosPrueba){
            for(Integer divisores : divisoresPrueba){
                assertEquals(dividendos/divisores,Divisor.dividirRecursivo(dividendos,divisores));
            }
        }

    }

    @Test
    public void dividirIterativo() throws Exception {
        for(Integer dividendos : dividendosPrueba){
            for(Integer divisores : divisoresPrueba){
                assertEquals(dividendos/divisores,Divisor.dividirIterativo(dividendos,divisores));
            }
        }
    }

}