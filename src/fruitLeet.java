import java.util.*;
public class fruitLeet {
    class Solution {
        public int totalFruit(int[] fruits) {
            int n = fruits.length;
            HashMap<Integer, Integer> map = new HashMap<>();
            int[] temp = {-1, -1};
            int maxTree = 0;

            for(int i = 0; i < n; i++) {
                int currFruit = fruits[i];
                if(map.size() < 2) {
                    map.put(currFruit, map.getOrDefault(currFruit, 0) + 1);
                    if(!contains(temp, currFruit)) {
                        if(temp[0] == -1) {
                            temp[0] = currFruit;
                        } else if(temp[1] == -1) {
                            temp[1] = currFruit;
                        }
                    } else {
                        // do nothing
                    }
                } else {
                    if(contains(temp, currFruit)) {
                        map.put(currFruit, map.getOrDefault(currFruit, 0) + 1);
                    } else {
                        int fruitToRemove = temp[0];
                        map.remove(fruitToRemove);
                        temp[0] = temp[1];
                        temp[1] = currFruit;
                        map.put(currFruit, 1);
                    }
                }
                int numTree1 = map.getOrDefault(temp[0], 0);
                int numTree2 = map.getOrDefault(temp[1], 0);
                maxTree = Math.max(maxTree, numTree1+numTree2);
            }
            return maxTree;
        }

        private boolean contains(int[] arr, int value)  {
            for(int i : arr) {
                if(i == value) {
                    return true;
                }
            }
            return false;
        }
    }
}
