public class Maximum_Average_Subarray_I {
    public double findMaxAverage(int[] nums, int k) {

        int curr=0;
        int sum=0;

        for(int i=0;i<k;i++){

            sum=sum+nums[i];

        }
        double max=sum;
        for(int i=k;i<nums.length;i++){

            sum=sum-nums[i-k]+nums[i];
            max=Math.max(max,sum);
        }
        return max/k;
    }
}
