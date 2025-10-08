import java.util.HashMap;

public class containsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        // hashSet is better
        // if(!set.add(nums[i])-- false if it already contains
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){return true;}
            else map.put(nums[i],1);
        }
        return false;

    }
}

