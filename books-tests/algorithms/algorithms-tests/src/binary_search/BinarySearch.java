package binary_search;

import java.util.List;

public class BinarySearch {
    public static Integer binarySearch (List<Integer> list, Integer item) {

        if (list == null || list.isEmpty() || item == null) {
            throw new IllegalArgumentException("Invalid Value(s)");
        }

        int low = 0;
        int high = list.size() - 1;
        int mid;

        Integer guess;

        while (low <= high) {
            mid = (low + high) / 2;
            guess = list.get(mid);
            if (guess.equals(item)) {
                return mid;
            } else if (guess > item) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return null;
    }
}
