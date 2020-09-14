class Solution {
    public boolean isHappy(int n) {
     
       int sum = 0;
        HashSet<Integer> h = new HashSet<Integer>();
        while(sum!=1){
            sum = 0;
            while(n!=0){
                int j = n%10;
                n=n/10;
                sum+=j*j;
            }
            n = sum;
            if(h.contains(sum)){
                return false;
            }else{
                h.add(sum);
            }
            
        }
        return true;
        
    }
}