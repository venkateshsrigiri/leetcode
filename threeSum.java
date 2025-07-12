import java.util.*;

public class threeSum {
    public List<List<Integer>> threeSum(int[] nums){
        List<List<Integer>> res = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);
        for(int i = 0;i<n-2;i++){
            if(i>0&&nums[i] == nums[i-1])continue;
            int left = i+1;
            int right = n-1;
            while(left<right){
                int sum = nums[i]+nums[left]+nums[right];
                if(sum == 0){
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[left]);
                    temp.add(nums[right]);
                    res.add(temp);
                    
                    while(left<right && nums[left] == nums[left+1])left++;
                    while(left<right && nums[right] == nums[right-1])right--;
                    left++;
                    right--;
                }
                else if(sum < 0){
                    left++;
                }
                else{
                    right--;
                }
            }

            
        }
        return res;
    }
    public static void main(String[] args) {
        
        int[] nums = {-1,0,1,2,-1,-4};
        threeSum s = new threeSum();
        System.out.println(s.threeSum(nums));
    }
    
}
