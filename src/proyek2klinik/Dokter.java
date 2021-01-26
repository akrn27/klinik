package proyek2klinik;

public class Dokter {
    //VARIABLE
    
    //1. Method Doctor
    public int doctorr(int doctor){
        switch(doctor){
            case 1:
                System.out.println("dr. Andika");
                break;
            case 2:
                System.out.println("dr. Tarish");
                break;
            case 3:
                System.out.println("dr. Maulana");
                break;
            default:
                System.out.println("dr. Ahmad");
                break;
        }return doctor;
    }
    
    //2. Method AbsenDoctor
    public boolean absenn(boolean absen){
        if(absen == true){
            System.out.println("Doctor Ada Di Ruangan");
        }else{
            System.out.println("Doctor Sedang Melayani Pasien, Harap Tunggu");
            System.exit(0);
        }return absen;
    }
    
    
}