
class Solution {
    public int[] solution(int n, int[] numlist) {
      
        int index = 0;
        
         for(int i=0; i<numlist.length; i++){
            if(numlist[i] % n == 0)
                index++;
        }
        
        int[] result = new int[index];
        
        index = 0;
        
        for(int i=0; i<numlist.length; i++){
            
            if(numlist[i] % n == 0) {
                
                result[index] = numlist[i];

                if(index < result.length) index++;
                else return result;
            
            }
           
        }
        
        return result;
    }
}