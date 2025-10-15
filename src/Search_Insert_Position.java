public class Search_Insert_Position {
    public int searchInsert(int[] nums, int target) {
        int l=0;
        int r=nums.length-1;

        int m=0;
        while(l<=r)
        {
            m = l + (r - l) / 2;

            if (target == nums[m]) {
                return m;
            } else if (target > nums[m]) {
                l = m + 1;
            } else {
                r = m - 1;
            }

        }
        return l;
    }
}
