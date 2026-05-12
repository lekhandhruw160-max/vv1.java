public class water {
    public static void main(String arags[]){
        //int[] height = {1,8,6,2,5,4,8,3,7};
        int[] height = {1,1};

        System.out.print(naam(height));

    }
    public static int naam(int[] nums){

        int left  = 0;
        int rigth  = nums.length-1;
        int Area2 = Integer.MIN_VALUE;


        while(left <= rigth){
            int Area1 = (rigth - left) * Math.min(nums[rigth] , nums[left]);
            if(Area2 < Area1){
                Area2 = Area1;
            }
            if(nums[left] > nums[rigth]){
                rigth--;
            }
            else {
                left++;
            }

        }
        return Area2;
    }
}