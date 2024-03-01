class Solution {
    public String solution(String my_string) {
        char[] arr = my_string.toCharArray();
        char[] reversed = new char[my_string.length()];
         String result = "";
        
        if(1<=my_string.length() && my_string.length()<=1000){
            for(int i=0; i<my_string.length(); i++){
               reversed[my_string.length()-1-i] = arr[i];
              
            }
            
           result = new String(reversed);
          
        }
        
        
        return result;
    }
}