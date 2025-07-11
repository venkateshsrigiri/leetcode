
import java.util.*;
public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        for(String s:strs){
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String sortedS = new String(arr);
            if(!map.containsKey(arr)){
                map.put(sortedS,new ArrayList<>());
            }
            map.get(sortedS).add(s);

        }
        return new ArrayList<>(map.values());

            
        

        

    } 
    public static void main(String[] args){
        Solution s = new Solution();
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(s.groupAnagrams(strs));
        
    }
    
}
