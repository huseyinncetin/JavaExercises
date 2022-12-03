public class Official extends Employee{
    private String department;
    private String mesai;

    public Official(String adSoyad, String telefon, String eposta,String department, String mesai) {
        super(adSoyad, telefon, eposta);
        this.department = department;
        this.mesai = mesai;
    }
    public String getDepartment(){
        return this.department;
    }
    public void setDepartment(String department){
        this.department = department;
    }
    public String getMesai(){
        return this.mesai;
    }
    public void setMesai(String mesai){
        this.mesai = mesai;
    }

    public void calis(){
        System.out.println(this.getAdSoyad() + " çalışıyor.");
    }
}
