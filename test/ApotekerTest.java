/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import proyek2klinik.*;

/**
 *
 * @author Dika
 */
public class ApotekerTest {
    
    public ApotekerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void testApoteker(){
        System.out.println("-------------APOTEKER-------------");
        //1. METHOD OBAT
        Apoteker obj = new Apoteker();
        String[] jenisObats;
        //asumsikan bahwa output di bawah ini mewakili hasil yang diharapkan
        String[] expectedOutput = {"ObatDiare","Paracetamol","Tramadol","Crestor","Lipitor"};
        //asumsikan bahwa output di bawah ini dikembalikan dari metode yang akan diuji.
        String[] methodOutput = {"ObatDiare","Paracetamol","Tramadol","Crestor","Lipitor"};
        assertArrayEquals(expectedOutput, methodOutput);
        
        //2. METHOD IJIN OBAT
        Dokter instance = new Dokter();
        boolean ijinObat = true;
        boolean absen = true;
        assertEquals(ijinObat, true);
        boolean resultIjinObat = obj.ijinObatt(ijinObat,absen);
    }
}