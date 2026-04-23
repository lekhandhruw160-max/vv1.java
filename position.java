public class position{
    public static void main(String arags[]){

        
        //  int[] nums = {2,3,8,8,8,8,8,9,12,15,24,4};
        //  int target = 8;
        // int[] nums = {1};
        // int target = 1;

        // int[] result =  search(nums, target);

        // for(int i = 0; i<result.length; i++){
        //     System.out.print(" " + result[i]);
        // }

    


    // }

    // public static int[] search(int[] nums, int target ){

        


         int[] nums = {5,7,7,8,8,10};
        // int[] nums = {1};
        int target = 6;
        int[] she = new int[2];

        int i = 0;
        int j = nums.length -1;
        int index = -1;

        while(i<=j){

            int mid = (i+j)/2;

            if(nums[mid] > target){
                j = mid - 1;
            }
            else if(nums[mid] < target){
                i = mid + 1;
            }
            else{
                // nums[mid] == target
                index = mid;
                j = mid - 1;

            }
        }
        she[0] = index ;

        
      

        i = 0;
        j = nums.length - 1;

        while(i<=j){
            int mid = (i+j)/2;

            if(nums[mid] > target){
                j = mid - 1;

            }
            else if (nums[mid] < target){
                i = mid + 1;

            }
            
            else {
                // nums[mid] == target
                index = mid;
                i = mid + 1;
            }
            
        }
        she[1] = index ;


        for(int g = 0; g<she.length; g++){
            System.out.print(she[g]);
        }
    
        // if(she[0] == 0 && she[1] == 0){
        //     she[0] = -1;
        //     she[1] = -1;

        //     return she;
        // }
        // else if(nums.length - 1 == 0){
        //     she[0] = 0;
        //     she[1] = 0;

        //     return she ;
        // }
        // else{
        //     return she;
        // }
    
    }
        
    
}