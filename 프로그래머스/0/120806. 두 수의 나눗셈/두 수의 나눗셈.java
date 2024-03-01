class Solution {
    public int solution(int num1, int num2) {
        if(0<num1 && num1<=100 && 0<num2 && num2<=100){
            
           double answer = (double)num1/num2*1000;
           
           return (int)answer;
        }else{
           return 0;
        }
    }
}