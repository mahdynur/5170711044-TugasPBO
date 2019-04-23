package tugasp8;


public class TugasP8 {
    public static void main(String[] args) {
        Manusia m = new Manusia();
        Kaya ky = new Kaya();
        Atlet at = new Atlet();   
        Anonymous an = new Anonymous(); 
        
        ky.makan = "Mewah";
        ky.aktif = "Bisnis";
        ky.inputData("Orang Kaya");
        ky.getMakan();
        ky.Activity();
        
        System.out.println("");
        at.makan = "Protein Tinggi";
        at.aktif = "Latihan";
        at.inputData("Atlet");
        at.getMakan();
        at.Activity();
        
        System.out.println("");
        an.makan = "????";
        an.aktif = "????";
        an.inputData("????");
        an.getMakan();
        an.Activity();
    }
    
}
