public class sortedSquares {
    public int[] sortedSquares(int[] nums) {
        // or make squares and then sort - but would take nlogn time.
        int i=0;
        int n=nums.length;
        int j=n-1;
        int k=n-1;
        int[] res=new int[n];
        while(i<=j){
            int left=nums[i]*nums[i];
            int right=nums[j]*nums[j];
            if(left>right){
                res[k]=left;
                k--;
                i++;
            }
            else{
                res[k]=right;
                k--;
                j--;
            }
        }
        return res;
    }
}
