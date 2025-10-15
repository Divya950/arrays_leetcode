import java.util.HashMap;

public class isAnagram {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())return false;

        HashMap<Character,Integer> map=new HashMap<>();

        for(int i=0; i<s.length();i++){
            char c=s.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
        }

        for(int i=0;i<t.length();i++){
            char c=t.charAt(i);

            if(!map.containsKey(c))return false;
            int v=map.get(c);
            if(v<0)return false;
            map.put(c,v-1);

        }
        boolean isA=map.values().stream().allMatch(v->v==0);
        if(isA!=true)return false;
        return true;


    }
}
