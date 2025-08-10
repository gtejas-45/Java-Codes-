//1
package Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1, 4, -88, 34, 26};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr) {
        boolean swapped;
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }
            //if value is not swapped for particular value of i-- means when array is sorted it breaks the loop
            if (!swapped) {
                break;
            }
        }
    }
}

/*
Let's **debug and trace** your **Bubble Sort** code step-by-step using this input:

```java
int[] arr = {1, 4, -88, 34, 26};
```

---

### ✅ Code Recap

```java
for (int i = 0; i < arr.length; i++) {
    swapped = false;
    for (int j = 1; j < arr.length - i; j++) {
        if (arr[j] < arr[j - 1]) {
            // swap
        }
    }
    if (!swapped) break;
}
```

---

### 📊 Initial Array:

```
[1, 4, -88, 34, 26]
```

---

### 🔁 Pass 1 (i = 0):

Loop: `j = 1` to `4` (since `arr.length - i = 5`)

| j | Compare `arr[j-1]` & `arr[j]` | Action  | Array after swap     |
| - | ----------------------------- | ------- | -------------------- |
| 1 | 1 vs 4                        | No swap | \[1, 4, -88, 34, 26] |
| 2 | 4 vs -88                      | Swap    | \[1, -88, 4, 34, 26] |
| 3 | 4 vs 34                       | No swap | \[1, -88, 4, 34, 26] |
| 4 | 34 vs 26                      | Swap    | \[1, -88, 4, 26, 34] |

✅ Swapped = true, continue to next pass

---

### 🔁 Pass 2 (i = 1):

Loop: `j = 1` to `3`

| j | Compare `arr[j-1]` & `arr[j]` | Action  | Array after swap     |
| - | ----------------------------- | ------- | -------------------- |
| 1 | 1 vs -88                      | Swap    | \[-88, 1, 4, 26, 34] |
| 2 | 1 vs 4                        | No swap | \[-88, 1, 4, 26, 34] |
| 3 | 4 vs 26                       | No swap | \[-88, 1, 4, 26, 34] |

✅ Swapped = true, continue to next pass

---

### 🔁 Pass 3 (i = 2):

Loop: `j = 1` to `2`

| j | Compare `arr[j-1]` & `arr[j]` | Action  | Array after swap     |
| - | ----------------------------- | ------- | -------------------- |
| 1 | -88 vs 1                      | No swap | \[-88, 1, 4, 26, 34] |
| 2 | 1 vs 4                        | No swap | \[-88, 1, 4, 26, 34] |

❌ No swaps — array is already sorted.

➡️ `swapped = false`, so **loop breaks early** (optimization works)

---

### ✅ Final Output:

```java
[-88, 1, 4, 26, 34]
```

*/
