import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int ay,gün;
        Scanner input =new Scanner(System.in);
        System.out.println("Doğduğunuz ayı giriniz:");
        ay =input.nextInt();
        System.out.println("Doğduğunuz günü giriniz:");
        gün =input.nextInt();

        if(ay==1){
            if(gün>=22)
                System.out.println("Burcunuz:KOVA");
            else
                System.out.println("Burcunuz:OĞLAK");
        }

        if(ay==2){
            if(gün>=20)
                System.out.println("Burcunuz:BALIK");
            else
                System.out.println("Burcunuz:KOVA");
        }

        if(ay==3){
            if(gün>=21)
                System.out.println("Burcunuz:KOÇ");
            else
                System.out.println("Burcunuz:BALIK");
        }

        if(ay==4){
            if(gün>=21)
                System.out.println("Burcunuz:BOĞA");
            else
                System.out.println("Burcunuz:KOÇ");
        }

        if(ay==5){
            if(gün>=22)
                System.out.println("Burcunuz:İKİZLER");
            else
                System.out.println("Burcunuz:BOĞA");
        }

        if(ay==6){
            if(gün>=23)
                System.out.println("Burcunuz:YENGEÇ");
            else
                System.out.println("Burcunuz:İKİZLER");
        }

        if(ay==7){
            if(gün>=23)
                System.out.println("Burcunuz:ASLAN");
            else
                System.out.println("Burcunuz:YENGEÇ");
        }
        if(ay==8){
            if(gün>=23)
                System.out.println("Burcunuz:BAŞAK");
            else
                System.out.println("Burcunuz:ASLAN");
        }

        if(ay==9){
            if(gün>=23)
                System.out.println("Burcunuz:TERAZİ");
            else
                System.out.println("Burcunuz:BAŞAK");
        }

        if(ay==10){
            if(gün>=23)
                System.out.println("Burcunuz:AKREP");
            else
                System.out.println("Burcunuz:TERAZİ");
        }

        if(ay==11){
            if(gün>=22)
                System.out.println("Burcunuz:YAY");
            else
                System.out.println("Burcunuz:AKREP");
        }

        if(ay==12){
            if(gün>=22)
                System.out.println("Burcunuz:OĞLAK");
            else
                System.out.println("Burcunuz:YAY");
        }




















    }
}