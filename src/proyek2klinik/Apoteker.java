package proyek2klinik;

public class Apoteker {

//1. Method JenisObat
    public String jenisObatt(String jenisObat){
        String jenisObats[] = {"ObatDiare","Paracetamol","Tramadol","Crestor","Lipitor"};
        return jenisObat;
    }
    
    //2. Method IjinObat
    public boolean ijinObatt(boolean ijinObat, boolean absen){
        Dokter obj = new Dokter();
        if(ijinObat != obj.absenn(absen)){
            System.out.println("Obat Boleh Diambil");
        }else{
            System.out.println("Obat Belum Boleh Diambil");
        }return ijinObat;
    }
}