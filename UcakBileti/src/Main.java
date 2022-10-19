import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int yas,km,tip;
        double biletFiyat,yasİndirimi =0,normalTutar,toplamTutar,tipİndirimi=0,indirimliTutar;

        Scanner input = new Scanner(System.in);
        System.out.println("Mesafeyi km türünden giriniz :");
        km = input.nextInt();
        System.out.println("Yaşınızı giriniz :");
        yas = input.nextInt();
        System.out.println("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ):");
        tip = input.nextInt();
        biletFiyat = km*0.10;

        normalTutar = km*0.10;

        if(yas>0 && km>0){
            if(tip>0 && tip<3){
                if(tip==1){
                    if(yas<12){
                        yasİndirimi =biletFiyat*0.50;
                    }

                    else if(yas>=12&&yas<24){
                        yasİndirimi =biletFiyat*0.10;
                    }

                    else if(yas>65){
                        yasİndirimi =biletFiyat*0.30;
                    }
                    toplamTutar=biletFiyat-yasİndirimi;
                    System.out.println("Toplam Tutar:"+toplamTutar);
                }
                else{
                    if(yas<12){
                        yasİndirimi =biletFiyat*0.50;
                    }

                    else if(yas>=12&&yas<24){
                        yasİndirimi =biletFiyat*0.10;
                    }

                    else if(yas>65){
                        yasİndirimi =biletFiyat*0.30;
                    }
                    indirimliTutar =biletFiyat-yasİndirimi;
                    tipİndirimi =indirimliTutar*0.20;
                    toplamTutar=2*(indirimliTutar-tipİndirimi);
                    System.out.println("Toplam Tutar:"+toplamTutar);
                }

            }
            else
                System.out.println("Hatalı Veri Girdiniz !");
        }
        else
            System.out.println("Hatalı Veri Girdiniz !");
    }
}