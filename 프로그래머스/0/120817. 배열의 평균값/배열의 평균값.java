class Solution {
    public double solution(int[] numbers) {
       
        int sum = 0;
        double avg = 0;
        
        if(1<= numbers.length && numbers.length <= 100){
            
            for(int i=0; i<numbers.length; i++){
                if(0<=numbers[i] && numbers[i] <= 1000){
                    sum += numbers[i];
                }

            }
            avg = (double)sum / numbers.length;

        }
        
        return avg;
    }
} 