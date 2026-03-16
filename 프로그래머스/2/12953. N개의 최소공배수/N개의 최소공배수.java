import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

class Solution {
    public int solution(int[] arr) {
        ArrayList<Integer> list =
                Arrays.stream(arr)
                        .boxed()
                        .collect(Collectors.toCollection(ArrayList::new));

        Integer max = Collections.max(list);
        list.remove(max);
        
        int count = 1;
        
        while(true){
        int value = max * count; 
        int temp = value;
            
        boolean isMin = list.stream().allMatch(e -> temp % e == 0);
           
           if(isMin){return value;}
            count++;
    }
}
}