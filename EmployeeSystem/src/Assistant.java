public class Assistant extends Academician{
    private String ofisSaati;
    public Assistant(String adSoyad, String telefon, String eposta, String bolum, String unvan,String ofisSaati) {
        super(adSoyad, telefon, eposta, bolum, unvan);
        this.ofisSaati = ofisSaati;
    }
    public void quizYap(){
        System.out.println(this.getAdSoyad()+ "quiz yapıyor.");
    }
}
