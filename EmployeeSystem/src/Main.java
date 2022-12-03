public class Main {
    public static void main(String[] args){
        Employee e1 = new Employee("Hüseyin ÇETİN","055555555","AlphaNyra@gmail.com");
        SecurityGuard s1 = new SecurityGuard("İsmail KİLİK","05566998896","kingSlayer@gmail.com","Security","00.00-08.00","Silahlı güvenlik görevlisi");
        Lecturer l1 = new Lecturer("Şevval ÇETİN","05555556699","menna@gmail.com","History","Doçent","45");
        System.out.println(l1.getUnvan());
        System.out.println(s1.getBelge());
        l1.setUnvan("Profesör");
        System.out.println(l1.getUnvan());
    }
}