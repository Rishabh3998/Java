package JavaCollectionsInOneVideo;

import java.util.Arrays;

public class ArrayClass {
    public static void arrayClass () {
        // Helper methods present in primitive array class

        int[] a = {1,2,3,4,5,6,7,8,9,10};
        int index = Arrays.binarySearch(a, 4);

        System.out.println(index);

        int[] nonSorted = {2,6,1,8,10,33,5,9};
        Arrays.sort(nonSorted);

        for (int i : nonSorted) {
            System.out.println(i);
        }

        Arrays.fill(a, 12); // every value will be replaced with 12
        System.out.println(Arrays.toString(a));

    }
}
