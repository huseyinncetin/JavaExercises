public class IT_Officer extends Official{
    private String gorev;
    public IT_Officer(String adSoyad, String telefon, String eposta, String department, String mesai,String gorev) {
        super(adSoyad, telefon, eposta, department, mesai);
        this.gorev = gorev;
    }
    public String getGorev(){
        return this.gorev;
    }
    public void setGorev(String gorev){
        this.gorev=gorev;
    }
    public void networkKurulum(){
        System.out.println(this.getAdSoyad()+ "kurulumu tamamladı.");
    }
}
