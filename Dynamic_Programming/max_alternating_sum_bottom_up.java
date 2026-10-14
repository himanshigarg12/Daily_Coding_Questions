package Dynamic_Programming;

public class max_alternating_sum_bottom_up {
    public long maxAlternatingSum(int[] nums) {
        long plus = 0;
        long minus = 0;

        for (int x : nums) {
            long newPlus = Math.max(plus, minus + x);
            long newMinus = Math.max(minus, plus - x);

            plus = newPlus;
            minus = newMinus;
        }

        return plus;
    }
}
