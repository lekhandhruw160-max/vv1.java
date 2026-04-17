public class twopointer{
    public static void main(String arags[]){
        int[] nums = {0,1,0,3,12};
        for(int g = 0; g<nums.length; g++){
            System.out.print(nums[g]);

        }
        System.out.println();

        int i = 0;
        int j = 1;

        while(j < nums.length){
            if(nums[i] == 0 && nums[j] != 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j++;

            }
            else if(nums[i] == 0 && nums[j] == 0){
                j++;
            }
            else if(nums[i] != 0 && nums[j] == 0){
                i++;
                j++;
            }
            else{
                i++;
                j++;
            }
        }
         for(int k = 0; k<nums.length; k++){
            System.out.print(nums[k]);

        }
    }
}
    