package com.test;

import com.clss.WordWrap;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class WordWrapTest {
    WordWrap wordWrap;
    String cadena;
    int width;

    @Before
    public void setUp() throws Exception {
         wordWrap = new WordWrap();
        cadena="";
        width=1;

    }

    @Test
    public void  StringVacio_resultadoStringVacio()throws Exception {

        Assert.assertEquals("",wordWrap.wrapper("",1));
    }

    @Test
    public void  StringMenor_Prueba_width_10_resultadoPrueba()throws Exception {

        Assert.assertEquals("Prueba",wordWrap.wrapper("Prueba",10));
    }

}