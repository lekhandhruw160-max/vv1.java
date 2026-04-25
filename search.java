public class search{

    public static void main(String arags[]){ 
        
        int[] num = {1,2,3,4,}; 
        for(int i = 0; i<num.length; i++){
            System.out.println(num[i]);
        }
        System.out.println("index");

        //int[]  nums = {1,3,5,6};
        //int target = 2;
        int[] nums = {1,3,5,6,8,9,10,23,43,54};
        int target = 2;

        int i = 0;
        int j = nums.length -1 ; 
        int index = 0;

        while(i<=j){

            int mid = (i+j)/2;

            if(nums[mid] > target){
                j = mid - 1;

            }
            else if(nums[mid] < target ){
                i = mid + 1;
                index = mid +1;
            }
           

            else{
                index = mid ;
                break ;
 
            }
        }
        System.out.println(index);
        System.out.println("dhd");
    
    } 
    

    
}
