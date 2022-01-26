import java.util.Arrays;

public class Robber {
  
    
        private int[] memo;

        public static void main(String[] args) {
            int[] nums={1,2,3,2};
            Robber ra=new Robber();
            System.out.println(ra.rob(nums));
            System.out.println(Arrays.toString(ra.memo));
        }
        
        public int rob(int[] nums) {
            
            this.memo = new int[100];
            
            // Fill with sentinel value representing not-calculated recursions.
            Arrays.fill(this.memo, -1); 
            
            return this.robFrom(0, nums);
        }
        
        private int robFrom(int i, int[] nums) {
            
            // No more houses left to examine.
            if (i >= nums.length) {
                return 0;
            }
            
            // Return cached value.
            if (this.memo[i] > -1) {
                return this.memo[i];
            }
            
            // Recursive relation evaluation to get the optimal answer.
            int ans = Math.max(this.robFrom(i + 1, nums), this.robFrom(i + 2, nums) + nums[i]);
            
            // Cache for future use.
            this.memo[i] = ans;
            
            return ans;
        }
    
}
