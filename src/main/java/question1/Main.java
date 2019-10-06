package question1;

public class Main {

    /**
     * Given an array of integers, return indices of the two numbers
     * such that they add up to a specific target.
     * <p>
     * You may assume that each input would have exactly one solution,
     * and you may not use the same element twice.
     *
     * @param args [0,1]
     */
    public static void main(final String[] args) {
        // launch(args);

    }

    private int[] twoSum(final int[] nums, final int target) {
        int[] results = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i == j) {
                    continue;
                }

                if ((nums[i] + nums[j]) == target) {
                    results[0] = i;
                    results[1] = j;
                    return results;
                }
            }
        }

        return results;
    }
}
