public class kth {
    public static void main(String arags[]){
        //int[] arr = {2,3,4,7,11};
        int k = 2;
        int[] arr = {1,2,3,4};
        int result = positiveNumber(arr, k);

        System.out.println(result);


    }

    public static int positiveNumber(int[] nums, int k){

        int i = 0;
        int j = nums.length - 1;

        while(i <= j){
            
            int mid = i + (j - i)/2;
            int missing = nums[mid] - (mid + 1);
            if(missing < k) i = mid + 1;
            else j = mid - 1;

        }
        return i + k ;
    }
}