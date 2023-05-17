class Solution {
    
    public boolean isMatch(String s, String p) {
        if (p.isEmpty()) {
            return s.isEmpty();
        }
        
        boolean firstMatch = (!s.isEmpty() && (s.charAt(0) == p.charAt(0) || p.charAt(0) == '.'));
        
        if (p.length() >= 2 && p.charAt(1) == '*') {
            return (isMatch(s, p.substring(2)) || (firstMatch && isMatch(s.substring(1), p)));
        } else {
            return firstMatch && isMatch(s.substring(1), p.substring(1));
        }
    }
}

// import java.util.regex.Matcher;
// import java.util.regex.Pattern;

// public class RegexMatching {

//     public static boolean matches(String s, String p) {
//         Pattern pattern = Pattern.compile(p);
//         Matcher matcher = pattern.matcher(s);
//         return matcher.matches();
//     }

//     public static void main(String[] args) {
//         String s = "aa";
//         String p = "a";

//         System.out.println(matches(s, p)); // false

//         s = "aaa";
//         p = "a*";

//         System.out.println(matches(s, p)); // true
//     }
// }