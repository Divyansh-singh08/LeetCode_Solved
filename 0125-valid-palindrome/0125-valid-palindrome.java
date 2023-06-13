class Solution {
    public boolean isPalindrome(String s) {
//         if (s.isEmpty()) {
//         	return true;
//         }
//         int head = 0, tail = s.length() - 1;
//         char cHead, cTail;
//         while(head <= tail) {
//         	cHead = s.charAt(head);
//         	cTail = s.charAt(tail);
//         	if (!Character.isLetterOrDigit(cHead)) {
//         		head++;
//         	} else if(!Character.isLetterOrDigit(cTail)) {
//         		tail--;
//         	} else {
//         		if (Character.toLowerCase(cHead) != Character.toLowerCase(cTail)) {
//         			return false;
//         		}
//         		head++;
//         		tail--;
//         	}
//         }
        
//         return true;
        
        
        //first check the base case
        if(s.isEmpty()){
            return true;
        }
        
//         you need to use Two pointer Approch and compair it
        int head = 0;
        int tail = s.length() - 1;
        char cHead;
        char cTail;
        while(head <= tail){
            //now point it to the original
            cHead = s.charAt(head);//point to first value
            cTail = s.charAt(tail);//point to the last value
            if(!Character.isLetterOrDigit(cHead)){
                //false mean that it's character or letter only
                //true mean that not char nor number
                head++;
            }
            else if(!Character.isLetterOrDigit(cTail)){
                tail--;
            }else{
                //now also need to maintane the locase too
                if(Character.toLowerCase(cHead) != Character.toLowerCase(cTail)){
                    //if there are not matching return false
                    return false;
                }
                head++;
                tail--;
            }
        }
    return true;
        
        
        
    }
}