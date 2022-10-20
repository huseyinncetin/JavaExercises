import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String username,password;
        int right = 3;
        int balance =2000;
        int select,price;

        while(right>0){
            System.out.println("Kullanıcı adınızı giriniz:");
            username =input.nextLine();
            System.out.println("Şifrenizi giriniz:");
            password =input.nextLine();

            if(username.equals("chatoo")&&password.equals("1234")){
                System.out.println("Bankamıza hoşgeldiniz!");
                do{
                    System.out.println("1-Para Çekme\n"+"2-Para Yatırma\n"+"3-Bakiye Sorgula|a\n"+"4-Çıkış");
                    System.out.println("Lütfen işleminizi seçiniz:");
                    select = input.nextInt();

                    switch (select){

                        case 1:{
                            System.out.println("Çekmek istediğiniz miktarı giriniz:");
                            price =input.nextInt();
                            if(price>balance){
                                System.out.println("Bakiye yetersiz");
                                System.out.println("Mevcut bakiyeniz:"+balance);
                            }
                            else
                                balance -=price;
                            break;
                        }
                        case 2:{
                            System.out.println("Yatırmak istediğiniz tutarı giriniz:");
                            price =input.nextInt();

                            balance +=price;
                            break;
                        }
                        case 3:{
                            System.out.println("Mevcut bakiyeniz:"+balance);
                            break;
                        }
                    }
                }while (select!=4);
                System.out.println("Görüşmek üzere!!!");
                break;
            }
            else{
                right--;
                System.out.println("Hatalı kullanıcı adı veya parola girdiniz!!!");
                if(right ==0){
                    System.out.println("Hesabınız bloke olmuştur!!!");
                }
                else
                    System.out.println("Kalan hakkınız :"+right);
            }
        }
    }
}