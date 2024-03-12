class Solution {
    public int solution(String my_string) {
        String str = my_string.replaceAll("[a-zA-Z]", "");
     
        int result = 0;
        
        for(int i=0; i<str.length(); i++){
            result += Character.getNumericValue(str.charAt(i));
            
        }
        
        return result;
    }
}