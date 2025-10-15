import java.util.Arrays;
import java.util.HashSet;

public class Intersection_of_TwoArrays {

        public int[] intersection(int[] nums1, int[] nums2) {
            int[] result = new int[nums1.length];
            HashSet<Integer> set=new HashSet<>();
            for(int i : nums1){
                set.add(i);
            }
            int integer=0;
            for(int i :nums2){
                if(set.contains(i))
                {result[integer]=i;
                    integer++;}
                set.remove(i);
            }

            return Arrays.copyOf(result, integer);
        }
    }

