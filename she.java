public class she {
     public static void main(String[] args) {
        // i try to solve leetcode problem 
        
        
        int[] pro = {0,1,2,2,3,0,4,2,};
        
        int val = 2;
    
        name(pro, val);
       

       
       
    }
    public static void name(int[] nums , int val){
         for(int g = 0; g<nums.length; g++){
            System.out.print(nums[g]);
        }
        System.out.println();
        int k = 0;

        int i = 0;
        int j = nums.length -1;
        
        while(i <= j){
            if(nums[i] == val && nums[j] != val){

                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                k++;
                i++;
                j--;

            }
            else if(nums[i] != val && nums[j] != val){
                i++;
                k++;
            }
            else if(nums[i] == val && nums[j] == val){
                j--;

            }
            else {
                i++;
                j--;
                k++;
            }
            
        }
        for(int g = 0; g<nums.length; g++){
            System.out.print(nums[g]);
        }
        System.out.println();
        System.out.println(k);
     
    }
}
