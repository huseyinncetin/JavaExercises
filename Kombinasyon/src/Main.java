import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,r,nfaktöriyel=1,rfaktöriyel=1,n_rfaktöriyel=1,kombinasyon;
        System.out.print("Eleman sayısını giriniz:");
        n =input.nextInt();
        System.out.print("Kaçlı kombinasyonu bulmak istediğinizi giriniz:");
        r =input.nextInt();

        for(int i =1;i<=n;i++){
            nfaktöriyel *=i;
        }
        for(int i =1;i<=r;i++){
            rfaktöriyel *=i;
        }
        for(int i =1;i<=n-r;i++){
            n_rfaktöriyel *=i;
        }
        kombinasyon =nfaktöriyel/(rfaktöriyel*n_rfaktöriyel);
        System.out.println("C("+n+","+r+")="+kombinasyon);


    }
}