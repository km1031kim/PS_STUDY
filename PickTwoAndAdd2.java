package util;

import java.util.*;

public class PickTwoAndAdd2 {

    public static void main(String[] args) {
        int[] answer = {2,1,3,4,1};
        Solution.solution(answer);
    }
    static class Solution{

        public static int[] solution(int[] numbers) {
            HashSet<Integer> set = new HashSet<>();

            for (int i = 0; i < numbers.length; i++) {
                for (int j = i+1; j < numbers.length; j++) {
                    set.add(numbers[i] + numbers[j]);
                }
            }

          //  System.out.println(set);

            List<Integer> tempSet = new ArrayList<>(set);
            Collections.sort(tempSet);

            int[] result = new int[tempSet.size()];
            for (int i = 0; i < result.length; i++) {
                result[i] = tempSet.get(i);
            }
            System.out.println(Arrays.toString(result));
            return result;
        }
    }
}
