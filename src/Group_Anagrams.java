import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Group_Anagrams {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String,List<String>> map=new HashMap<>();
        for(String s :strs ){
            char[] sorted=s.toCharArray();
            Arrays.sort(sorted);
            String keys=new String(sorted);

            map.computeIfAbsent(keys,k->new ArrayList<>()).add(s);

        }
        return new ArrayList<>(map.values());
    }
}
