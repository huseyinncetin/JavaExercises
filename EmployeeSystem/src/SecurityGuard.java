public class SecurityGuard extends Official{
    private String belge;
    public SecurityGuard(String adSoyad, String telefon, String eposta, String department, String mesai,String belge) {
        super(adSoyad, telefon, eposta, department, mesai);
        this.belge = belge;
    }
    public String getBelge(){
        return this.belge;
    }
    public void setBelge(String belge){
        this.belge = belge;
    }
    public void nobet(){
        System.out.println(this.getAdSoyad()+ "şuan nöbettedir.");
    }
}
