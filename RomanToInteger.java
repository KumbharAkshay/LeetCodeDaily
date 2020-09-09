class Solution {
    public int romanToInt(String s) {
        
        if(s == null || s.length() == 0) return 0;
        
        int result = 0;
        for(int i = 0; i<s.length();i++){
            int s1 = value(s.charAt(i));
            if(i+1 < s.length()){
                int s2 = value(s.charAt(i+1));
                if(s1 >= s2){
                    result = result + s1;
                }
                else{
                    result = result - s1 + s2;
                    i++;
                }
            }else{
                result = result + s1;
                i++;
            }
        }
        
        return result;
    }
    
    public int value(char c){
        
        switch (c){
                
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;    
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return -1;
        }
    }
}