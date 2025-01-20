import java.util.ArrayList;
import java.util.List;

class PowerSet {
    public static void main(String[] args) {
        int[] set = {1, 2, 3, 4}; 
        List<List<Integer>> powerSet = generatePowerSet(set);

        System.out.println("Power Set:");
        for (List<Integer> subset : powerSet) {
            System.out.println(subset);
        }
    }

    public static List<List<Integer>> generatePowerSet(int[] set) {
        List<List<Integer>> powerSet = new ArrayList<>();
        int n = set.length;

        
        int totalSubsets = 1 << n;

        
        for (int i = 0; i < totalSubsets; i++) {
            List<Integer> subset = new ArrayList<>();

            
            for (int j = 0; j < n; j++) {
                
                if ((i & (1 << j)) != 0) {
                    subset.add(set[j]);
                }
            }

            
            powerSet.add(subset);
        }

        return powerSet;
    }
}
