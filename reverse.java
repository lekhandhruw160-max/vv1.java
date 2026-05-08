public class reverse {

    public static void main(String arags[]){

        int s = 123;

        int result = naam(s);
        System.out.println(result);

      
    }
    public static int naam(int x){
        int newValue = 0;
        
        while(x > 0){

            int lastDigit = x % 10;
            newValue = (newValue * 10) + lastDigit;
            x = x / 10;

        }
        return newValue;

    }
}
