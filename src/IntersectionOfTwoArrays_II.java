import java.util.Arrays;
import java.util.HashMap;

public class IntersectionOfTwoArrays_II {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<nums1.length;i++ ){
            map.put(nums1[i],map.getOrDefault(nums1[i],0)+1);
        }
        int[] result=new int[nums1.length];


        int in=0;
        for(int i=0;i<nums2.length;i++){
            if(map.containsKey(nums2[i])){
                int n=map.get(nums2[i]);
                result[in++]=nums2[i];
                if(n==1) map.remove(nums2[i]);
                else{map.put(nums2[i],n-1);}
            }

        }

        return  Arrays.copyOf(result,in);


    }
}
