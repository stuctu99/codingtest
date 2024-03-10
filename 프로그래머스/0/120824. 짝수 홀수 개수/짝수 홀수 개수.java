class Solution {
    public int[] solution(int[] num_list) {
        int count = 0;
        
        for(int i=0; i<num_list.length; i++){
            if(num_list[i]%2 == 0) count++;
        }
        
        int[] result = new int[2];
        result[0] = count;
        result[1] = num_list.length - count;
        
        return result;
    }
}