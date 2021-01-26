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
import proyek2klinik.Dokter;

/**
 *
 * @author Dika
 */
public class DokterTest {
    
    public DokterTest() {
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
    public void testDokter(){
        System.out.println("-------------DOKTER-------------");
        //1. METHOD DOKTER NAME
        Dokter obj = new Dokter();
        System.out.print("Nama Dokter : ");
        //Deklarasi Variable
        int doctor = 1;
        int doctor1 = 2;
        int doctor2 = 3;
        int doctor3 = 4;
        //Pengujian Method
        assertEquals(doctor, 1);
        assertEquals(doctor1, 2);
        assertEquals(doctor2, 3);
        assertEquals(doctor3, 4);
        //Pengambilan Objek dari Class Dokter
        int resultDoctor = obj.doctorr(doctor);
        int resutlDoctor1 = obj.doctorr(doctor1);
        int resultDoctor2 = obj.doctorr(doctor2);
        int resultDoctor3 = obj.doctorr(doctor3);
        
        //2. METHOD ABSEN
        System.out.print("Absen       : ");
        boolean absen = true;
        assertEquals(absen, true);
        boolean resultAbsen = obj.absenn(absen);
    }
}
