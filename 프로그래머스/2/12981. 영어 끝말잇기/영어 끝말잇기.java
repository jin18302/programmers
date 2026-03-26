import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
      //앞에 단어와 뒤에 단어를 비교해야함
        
        Set wordSet = new HashSet();
        char lastChar = ' ';
        
        for(int i = 0 ; i < words.length ; i++){
            
            String currentWord = words[i];
            boolean isExist = wordSet.add(currentWord);
            
            //마지막 문자열이 공백이 아니고, 서로 다르다면 if문 안으로 들어가야함
            
            if((lastChar != ' ' && lastChar != currentWord.charAt(0)) || !isExist){
                int number = (i + 1) % n == 0 ? n : (i + 1) % n;
               int turn = i / n + 1;
                return new int[]{number, turn};
            }
            
            lastChar = currentWord.charAt(currentWord.length() - 1);
        }
        return new int[]{0,0};
    }
}