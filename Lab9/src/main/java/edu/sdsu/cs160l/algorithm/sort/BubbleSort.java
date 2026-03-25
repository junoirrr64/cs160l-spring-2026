package edu.sdsu.cs160l.algorithm.sort;

import java.util.Comparator;

/**
 * In class explanation + demonstration
 * encompasses use of generics and bubble-sort algorithm
 */
public class BubbleSort implements Sorter {
    @Override
    @SuppressWarnings("unchecked")
    public <T> void sort(T[] c) {
        Comparable[] comparable = (Comparable[]) c;
        sort(comparable, Comparator.naturalOrder());
    }

    @Override
    public <T> void sort(T[] c, Comparator<? super T> comparisonStrategy) {

        for (int i = c.length - 1; i > 0; i--) {
            // Inner loop: swap the largest element in the unsorted range [0, i] to the rightmost end of that range
            for (int j = 0; j < i; j++) {
                if (comparisonStrategy.compare(c[j+1], c[j]) < 0) {
                    // Swap nums[j] and nums[j + 1]
                    swap(c, j, j+1);

                }
            }
        }

    }

    private <T> void swap(T[] arr, int i, int j) {
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
