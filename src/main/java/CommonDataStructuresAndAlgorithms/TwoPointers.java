package CommonDataStructuresAndAlgorithms;

public class TwoPointers {
    /*Two pointers means user two points at different index on an array
        One pointer at the zero index and another to the last

     */
    public static void main(String[] args) {
        int[] nums ={1,2,4,5,6,7,11,13,14};
        int target=9;

        int[] result = findTwoNumbers(nums,target);

        if(result.length==2){
            System.out.println("Two numbers found "+result[0]+","+result[1]);
        } else{
            System.out.println("No par of numbers found");
        }
    }

    public static int[] findTwoNumbers(int[] nums, int target){
        int left = 0; //pointer at the start of the array
        int right = nums.length -1;//pointer at the end of the array

        while(left<right){
            int sum= nums[left]+ nums[right];
            if(sum ==target){
            //return the two numbers that add up to the target
            return new int[] { nums[left], nums[right]};
        } else if(sum < target){
                left++; //move the left pointer to increase the sum
            } else {
                right--; //move the right pointer to decrese the sum
            }
        }
        return new int[0];
    }
}
