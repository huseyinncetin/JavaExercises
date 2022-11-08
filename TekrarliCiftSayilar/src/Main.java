public class Main {
    static boolean tekrarOnleme(int [] arr,int deger){
        for(int i : arr){
            if(i==deger){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] dizi ={5,7,3,6,8,6,8,15};
        int[] tekrar = new int [dizi.length];
        int count =0;
        for(int i=0;i< dizi.length;i++){
            for(int j=0;j<dizi.length;j++){
                if(dizi[i]==dizi[j] && i!=j){
                    if(dizi[i]%2==0 && tekrarOnleme(tekrar,dizi[i])){
                        tekrar[count++]=dizi[i];
                    }
                }
            }
        }
        for(int row : tekrar){
            if(row != 0)
            System.out.print(row+" ");
        }
    }
}