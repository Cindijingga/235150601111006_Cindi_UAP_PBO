import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Data extends Tanaman implements Perawatan{
    public static ArrayList <Tanaman> tanamans = new ArrayList<>();
    public static ArrayList <Integer> lokasi = new ArrayList<>();
    public static Scanner in = new Scanner (System.in);
       
    public Data(int masaHidup, int berbuah, double perkembangan) {
        super(masaHidup, berbuah, perkembangan);
    }
    static void mulai() {
        System.out.print("Lama waktu masa tanam (bulan) : ");
        int nilaiInput = in.nextInt();
        int hasil = nilaiInput*30;
           
        for (int i=0; i<3;i++){
            menanam();
        }
            
        System.out.println("Proses Perkembangan Tanaman");
            
        for (int i=0; i<3; i++){
            if (Data.tanamans.get(i).getStatus().equalsIgnoreCase("Hidup")){
                Data.tanamans.get(i).berkembang();
        } else if (Data.lokasi.contains(i)){
            continue;
            } else{
                Class tanamanMati = Data.tanamans.get(i).getClass();
                String nama = tanamanMati.getSimpleName();
                System.out.println("Tanaman " + nama + " sudah mati");
                Data.lokasi.add(i);
                menanam();
            } 
        }
    } 
           
    static void menanam(){
        Scanner sc = new Scanner(System.in);
        System.out.println("\nPilih tanaman yang ingin ditanam:");
        System.out.println("1. Tomat");
        System.out.println("2. Stroberi");
        System.out.println("3. Persik");
        System.out.print("Pilihan Anda: ");
        int tanam = in.nextInt();
        switch (tanam){
            case 1:
                tanamans.add(new Tomat(100,100,0.25));
                System.out.println("Berhasil menanam Tomat");
                break;
            case 2:
                tanamans.add(new Stroberi(60,150,0.35));
                System.out.println("Berhasil menanam Stroberi");
                break;
            case 3 :
                tanamans.add(new Persik(180,250,0.15));
                System.out.println("Berhasil menanam Persik");
                break;   
            }
        }
    @Override
    public void berkembang() {
        berkembang();
    }
    static void info(){
        for(int i =0; i<Data.tanamans.size();i++){
            System.out.println("Tanaman " + i+1 + " ");
            System.out.println(Data.tanamans.get(i).toString());
        }
    }
   
    @Override
    public void treatment() {
        treatment();
    }
}
