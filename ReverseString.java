class Solution {
    public String reverseString(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }
        return reverseString(s.substring(1))+s.charAt(0);
        /*char[] cs = s.toCharArray();
        int start = 0;
        int end = s.length() - 1;
         
        while (start < end) {
            swap(cs, start, end);
            start++;
            end--;
        }
         
        return new String(cs);
    }
     
    public void swap(char[] cs, int i, int j) {
        char temp = cs[i];
        cs[i] = cs[j];
        cs[j] = temp;*/
        
    }
}