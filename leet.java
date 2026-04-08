public class leet {
    public static void main(String arags[]){
        int[] a = { 1,43,3,3,23,3,4,3,4,4,4,4};

        // bubble sort 
        for(int i = 0; i<a.length-1; i++){
            if(a[i+1]>a[i]){
                int temp = a[i];
                a[i] = a[i+1];
                a[i+1] = temp;
            }
        }
        for(int i = 0; i<a.length; i++){
            System.out.println(a[i]);
        }
        
      
    }
}
