package tugasp8;

public class Kaya extends Manusia{
    @Override
    protected void getMakan(){
        System.out.println("Makan : "+makan);
    }
    
    @Override
    protected void Activity(){
        System.out.println("Aktifitas : "+aktif);
    }
}
