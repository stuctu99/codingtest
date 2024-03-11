import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        Arrays.sort(array);
        
        int result = (int)(array.length/2);
        
        return array[result];
    }
}