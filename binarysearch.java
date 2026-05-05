public class binarysearch {
    public static void main(String arags[]){
        int[] nums = {-1,0,3,5,9,12};
        int target = 2;

        int result = valueReturn(nums , target );
        System.out.println(result);

    }

    public static int valueReturn(int[] nums , int target){

       int i = 0;
       int j = nums.length - 1;

       while (i <= j) {

        int mid = i + (j-i)/2;
        if(nums[mid] == target ) return mid;
        if(nums[i] == target ) return i;
        if(nums[j] == target ) return j;
        
        if(nums[mid] > target){
            j = mid - 1;
        }
        else if(nums[mid] < target){
            i = mid + 1;
        }
        
       }
       return - 1;
        

    }


}

           
     

    
