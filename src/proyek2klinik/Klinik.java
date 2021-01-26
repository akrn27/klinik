package proyek2klinik;

public class Klinik {
    //1. Method Buka
    public boolean bukaa(boolean buka){
        if(buka == true){
            System.out.println("Buka");
        }else{
            System.out.println("Tutup");
            System.exit(0);
        }return buka;
    }
    
    //2. Method Jadwal
    public String jadwall(String jadwal){
        switch(jadwal){
            case "senin":
                System.out.println("Senin : 07.00 - 15.00");
                break;
            case "selasa":
                System.out.println("Selasa : 07.00 - 15.00");
                break;
            case "rabu":
                System.out.println("Rabu : 07.00 - 15.00");
                break;
            case "kamis":
                System.out.println("Kamis : 07.00 - 15.00");
                break;
            case "jumat":
                System.out.println("Jumat : 07.00 - 15.00");
                break;
            case "sabtu":
                System.out.println("Sabtu : 09.00 - 14.00");
                break;
            case "minggu":
                System.out.println("Minggu : 09.00 - 13.00");
                break;
            default:
                System.out.println("Terjadi Kesalahan pada input");
                break;
        }return jadwal;
    }
    
    //3. Method Antrian
    public boolean antriann(boolean antrian, boolean buka){
        if(antrian == buka){
            System.out.println("Silahkan Mengambil Nomor Antrian");
        }else{
            System.out.println("Tidak Bisa Mengambil Nomor Antrian");
        }
        return antrian;
    }
}