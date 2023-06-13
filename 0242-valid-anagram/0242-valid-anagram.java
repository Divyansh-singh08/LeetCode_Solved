class Solution {
    public boolean isAnagram(String s, String t) {
//         // if(s.length() != t.length()) {
// 		// 	return false;
// 		// }
//         HashMap<Character,Integer> map = new HashMap<>();

//         for(int i = 0; i < s.length(); i++){
//             map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
//         }

//         for(int i = 0; i < t.length(); i++){
//             // char ch = t.charAt(i);
//             if(map.get(t.charAt(i))!= null){
//                 if(map.get(t.charAt(i)) == 1){
//                     map.remove(t.charAt(i));
//                 }else{
//                     //update the value of string by decreasing
//                     map.put(t.charAt(i), map.get(t.charAt(i)) - 1);
//                 }
//             }else{
//                 return false;
//             }

//         // for(int i = 0; i < t.length(); i++) {
// 		// 	if(map.containsKey(t.charAt(i))) {
// 		// 		continue;
// 		// 	}else {
// 		// 		return false;
// 		// 	}
// 		// }
// 		// return true;
            
//         }

//         return map.isEmpty();//O(N)
        
        
        //  int[] alphabet = new int[26];
        // for (int i = 0; i < s.length(); i++) alphabet[s.charAt(i) - 'a']++;
        // for (int i = 0; i < t.length(); i++) alphabet[t.charAt(i) - 'a']--;
        // for (int i : alphabet) if (i != 0) return false;
        // return true; 
        
        int arr[] = new int[26];
        for(int i = 0; i < s.length(); i++){
            arr[s.charAt(i) - 'a']++;
        }
        
        //now do it for t 
        for(int j = 0; j < t.length(); j++){
            arr[t.charAt(j) - 'a']--;
            if(arr[t.charAt(j) - 'a'] < 0) return false;
        }
        
        for(int i : arr){
           if(i != 0){
               return false;
           } 
        }
        
        return true;
       
        
        
        
        

    }
}