import java.util.HashMap;
import java.util.Map;

public class LongestSubstring {
    public static void main(String[] args) {
        String s ="abccbacbd";
        Map<Character,Integer> map=new HashMap<>();
        for(char c:s.toCharArray()){
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }else{
                map.put(c,1);
            }
        }
        StringBuilder sb=new StringBuilder();
        for(Map.Entry<Character,Integer> entry: map.entrySet()){
            sb.append(entry.getKey());
        }

        System.out.println(sb);
    }
}
