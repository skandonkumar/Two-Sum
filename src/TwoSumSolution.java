import java.util.ArrayList;
import java.util.List;

public class TwoSumSolution {
	public int[] twoSum(int[] nums, int target) {
        int[] array = new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    array[0] = i;
                    array[1] = j;
                    return array;
                }
            }
        }
        return array;
    }
	
	public static void main(String args[]) {
		int[] nums = {2,7,11,15};
		int target = 9;
		TwoSumSolution obj = new TwoSumSolution();
		int[] solution = obj.twoSum(nums, target);
		List<Integer> sol = new ArrayList<Integer>();
		for(int i:solution) {
			sol.add(i);
		}
		System.out.println(sol);
	}
}
