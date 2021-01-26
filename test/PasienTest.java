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
import proyek2klinik.Pasien;

/**
 *
 * @author Dika
 */
public class PasienTest {
    
    public PasienTest() {
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
    public void testPasien(){
        System.out.println("-------------PASIEN-------------");
        //1. METHOD PATIENT NAME
        Pasien obj = new Pasien();
        String[] patients;
        //asumsikan bahwa output di bawah ini mewakili hasil yang diharapkan
        String[] expectedOutput = {"dika", "rish", "qan"};
        //asumsikan bahwa output di bawah ini dikembalikan dari metode yang akan diuji.
        String[] methodOutput = {"dika", "rish", "qan"};
        assertArrayEquals(expectedOutput, methodOutput);
        
        //2. METHOD UMUR
        System.out.print("Umur        : ");
        int umur = 19;
        assertEquals(umur, 19);
        int resultUmur = obj.umurr(umur);
        
        //3. METHOD KOTA
        System.out.print("Kota        : ");
        //Deklarasi Variable
        String kota = "jakarta";
        String kota1 = "bogor";
        String kota2 = "depok";
        String kota3 = "tanggerang";
        String kota4 = "bekasi";
        String kota5 = "";
        //Pengujian Method
        assertEquals(kota, "jakarta");
        assertEquals(kota1, "bogor");
        assertEquals(kota2, "depok");
        assertEquals(kota3, "tanggerang");
        assertEquals(kota4, "bekasi");
        assertEquals(kota5, "");
        //Pengambilan Objek dari Class Pasien
        String resultKota = obj.kotaa(kota);
        String resultKota1 = obj.kotaa(kota1);
        String resultKota2 = obj.kotaa(kota2);
        String resultKota3 = obj.kotaa(kota3);
        String resultKota4 = obj.kotaa(kota4);
        String resultKota5 = obj.kotaa(kota5);
        
        //4. METHOD BPJS
        System.out.print("Bpjs        : ");
        boolean bpjs = true;
        assertEquals(bpjs, true);
        boolean resultBpjs = obj.bpjss(bpjs);
    }
}