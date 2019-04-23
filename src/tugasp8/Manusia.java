package tugasp8;

import java.util.Scanner;

public class Manusia {

    String nama;
    String makan;
    String aktif;
    protected String inputData(String text){
        Scanner baca = new Scanner(System.in);
        System.out.print("Nama "+text+" : ");
        nama = baca.next();
        return nama;
    }
    
    protected void getMakan(){
        System.out.println("Makanan sehari-hari : "+makan);
    }
    
    protected void Activity(){
        System.out.println("Aktifitas Sehari-hari : "+aktif);
    }
}
