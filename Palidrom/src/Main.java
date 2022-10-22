public class Main {
    static boolean palidrom(int number){
        int temp = number,reverseNum=0,lastNumber;
        while(temp!=0){
            lastNumber =temp%10;
            reverseNum =(reverseNum*10)+lastNumber;
            temp /=10;
        }
        if(number==reverseNum){
            return true;
        }
        else
            return false;
    }
    public static void main(String[] args) {
        System.out.println(palidrom(1111));
    }
}