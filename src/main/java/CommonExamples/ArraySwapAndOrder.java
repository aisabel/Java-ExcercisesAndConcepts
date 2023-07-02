package CommonExamples;

public class ArraySwapAndOrder {
    public static void main(String[] args) {

        // Order the numbers in the array and swap it until is ordered from min to max
        int a[] = {2, 6, 1, 4, 9};
        int temp;

// 1,2,3,4,6, 9

        for (int i = 0; i < 5; i++) {
            for (int j = i + 1; j < 5; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;

                }
            }
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(a[i]);
        }
    }
}

