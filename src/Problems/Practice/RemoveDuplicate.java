package Problems.Practice;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] arr = {11,22,33,11,22};
        // Using LinkedHashSet to maintain order
        Set<Integer> set = new LinkedHashSet<>();
        for (int num : arr) {
            set.add(num);
        }

        System.out.print("Array after removing duplicates: ");
        for (int num : set) {
            System.out.print(num + " ");
        }

    }
}

/*
public class RemoveDuplicatesBrute {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 5};
        int n = arr.length;

        System.out.print("Unique elements: ");
        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}

 */