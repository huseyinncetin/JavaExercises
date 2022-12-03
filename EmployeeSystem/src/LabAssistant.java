public class LabAssistant extends Assistant{
    public LabAssistant(String adSoyad, String telefon, String eposta, String bolum, String unvan, String ofisSaati) {
        super(adSoyad, telefon, eposta, bolum, unvan, ofisSaati);
    }
    public void labaGir(){
        System.out.println(this.getAdSoyad()+ "laba girdi.");
    }
}
