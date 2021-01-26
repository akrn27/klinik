package proyek2klinik;

public class Pasien {
    //VARIABLE
    
    //1. Method Patient
    public String patientt(String patient){
        String patients[] = {"dika","rish","qan"};
        return patient;
    }
    
    //2. Method Umur
    public int umurr(int umur){
        if(umur <= 5){
            System.out.println("Pasien Balita");
        }else if(umur <= 13){
            System.out.println("Pasien Anak-Anak");
        }else if(umur <= 20){
            System.out.println("Pasien Remaja");
        }else if(umur <= 55){
            System.out.println("Pasien Dewasa");
        }else if(umur <= 130){
            System.out.println("Pasien Lansia");
        }else{
            System.out.println("Umur Pasien Terlalu Tua Untuk Disebut Sebagai Manusia");
        }return umur;
    }
    
    //3. Method Kota
    public String kotaa(String kota){
        switch(kota){
            case "jakarta":
                System.out.println("Pasien Tinggal Di Jakarta");
                break;
            case "bogor":
                System.out.println("Pasien Tinggal Di Bogor");
                break;
            case "depok":
                System.out.println("Pasien Tinggal Di Depok");
                break;
            case "tanggerang":
                System.out.println("Pasien Tinggal Di Tanggerang");
                break;
            case "bekasi":
                System.out.println("Pasien Tinggal Di Bekasi");
                break;
            default :
                System.out.println("Pasien Tinggal Di Luar Jabodetabek");
                break;
        }return kota;
    }
    
    //4. Method Bpjs
    public boolean bpjss(boolean bpjs){
        if(bpjs == true){
            System.out.println("Pasien Menggunakan BPJS");
        }else{
            System.out.println("Pasien Tidak Menggunakan BPJS");
        }return bpjs;
    }
    
    
}