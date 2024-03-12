import java.util.Arrays;

class Solution {
    public int[] solution(int n) {
        
        int[] result = new int[n%2==0? n/2 : n/2+1];
        int index = 0;
        
        for(int i=1; i<=n; i+=2){
            if(i%2 != 0) result[index] = i;
            
            index++;
        }
        
        
        return result;
    }
}