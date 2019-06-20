import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class stack {
    public static void main(String[] args){
        Stack<Integer> num = new Stack<>();
        num.push(3);
        num.push(5);
        System.out.print(numIsInStones("aA","aAAbbbb"));
    }

    public static int numIsInStones(String J, String S){
        int answer = 0;
        Set j_split = new HashSet();
        //Set<Character> j_split = new HashSet<>();
        for (char j : J.toCharArray())
            j_split.add(j);
        for (char s: S.toCharArray())
            if (j_split.contains(s))
                answer++;


        return answer;
    }
}
