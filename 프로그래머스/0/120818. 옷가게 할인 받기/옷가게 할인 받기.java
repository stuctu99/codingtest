class Solution {
    public int solution(int price) {
        int result = price;
        
        if(price>=500000){
             result = (int)(price - price*0.2);
        }else if(price>=300000){
             result = (int)(price - price*0.1);
        }else if(price>=100000){
            result = (int)(price - price*0.05);
        }
        
        return result;
            }
}