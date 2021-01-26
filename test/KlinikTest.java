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
import proyek2klinik.Klinik;

/**
 *
 * @author Dika
 */
public class KlinikTest {
    
    public KlinikTest() {
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
    public void testKlinik(){
        System.out.println("-------------KLINIK-------------");
        //1. METHOD BUKA
        System.out.print("Klinik      : ");
        Klinik obj = new Klinik();
        boolean buka = true;
        assertEquals(buka, true);
        boolean resultBuka = obj.bukaa(buka);
        
        //2. METHOD JADWAL
        System.out.print("Jadwal      : ");
        //Deklarasi Variable
        String jadwal = "senin";
        String jadwal1 = "selasa";
        String jadwal2 = "rabu";
        String jadwal3 = "kamis";
        String jadwal4 = "jumat";
        String jadwal5 = "sabtu";
        String jadwal6 = "minggu";
        //Pengujian Method
        assertEquals(jadwal, "senin");
        assertEquals(jadwal1, "selasa");
        assertEquals(jadwal2, "rabu");
        assertEquals(jadwal3, "kamis");
        assertEquals(jadwal4, "jumat");
        assertEquals(jadwal5, "sabtu");
        assertEquals(jadwal6, "minggu");
        //Pengambilan Objek dari class klinik
        String resultJadwal = obj.jadwall(jadwal);
        String resultJadwal1 = obj.jadwall(jadwal1);
        String resultJadwal2 = obj.jadwall(jadwal2);
        String resultJadwal3 = obj.jadwall(jadwal3);
        String resultJadwal4 = obj.jadwall(jadwal4);
        String resultJadwal5 = obj.jadwall(jadwal5);
        String resultJadwal6 = obj.jadwall(jadwal6);
        
        
        //3. METHOD ANTRIAN
        System.out.print("Antrian     : ");
        boolean antrian = true;
        
        //buka = false;
        assertEquals(antrian, true);
        boolean resultAntrian = obj.antriann(antrian,buka);
    }
}