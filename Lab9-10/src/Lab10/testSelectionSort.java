package Lab10;

import static org.junit.Assert.*;
//import org.junit.Assert;
import org.junit.Test;

public class testSelectionSort {
//
@Test
	public void test() {
		testPositive();
		testNegative();
		testDuplicates();
		testMixed();
	}
public testSelectionSort() {
}
//
    public void testPositive(){
        int[] arr = new int[5];
        arr[0] = 8;
        arr[1] = 9;
        arr[2] = 7;
        arr[3] = 10;
        arr[4] = 2;

        int[] Sortedarr = new int[5];
        Sortedarr[0] = 2;
        Sortedarr[1] = 7;
        Sortedarr[2] = 8;
        Sortedarr[3] = 9;
        Sortedarr[4] = 10;

        SelectionSort temp = new SelectionSort();
        arr = temp.basicSelectionSort(arr);
        assertArrayEquals("Positive Test Fails", Sortedarr, arr);

        /** add tests to check for this unit test **/
    }

    public void testNegative(){
    	int[] arr = new int[5];
        arr[0] = -2;
        arr[1] = -5;
        arr[2] = -7;
        arr[3] = -3;
        arr[4] = -9;

        int[] Sortedarr = new int[5];
        Sortedarr[0] = -9;
        Sortedarr[1] = -7;
        Sortedarr[2] = -5;
        Sortedarr[3] = -3;
        Sortedarr[4] = -2;

        SelectionSort temp = new SelectionSort();
        arr = temp.basicSelectionSort(arr);
        assertArrayEquals("Negative Test Fails", Sortedarr, arr);

        /** Test data contains negative values only **/
    }

    public void testMixed(){
    	int[] arr = new int[5];
        arr[0] = -8;
        arr[1] = 9;
        arr[2] = 7;
        arr[3] = -10;
        arr[4] = 0;

        int[] Sortedarr = new int[5];
        Sortedarr[0] = -10;
        Sortedarr[1] = -8;
        Sortedarr[2] = 0;
        Sortedarr[3] = 7;
        Sortedarr[4] = 9;
        SelectionSort temp = new SelectionSort();
        arr = temp.basicSelectionSort(arr);
        assertArrayEquals("Mixed Test Fails", Sortedarr, arr);

        /** Test data contains with both positive, negative and zeros **/
    }


    public void testDuplicates(){
    	int[] arr = new int[5];
        arr[0] = -8;
        arr[1] = 9;
        arr[2] = -8;
        arr[3] = 9;
        arr[4] = -5;

        int[] Sortedarr = new int[5];
        Sortedarr[0] = -8;
        Sortedarr[1] = -8;
        Sortedarr[2] = -5;
        Sortedarr[3] = 9;
        Sortedarr[4] = 9;
        SelectionSort temp = new SelectionSort();
        arr = temp.basicSelectionSort(arr);
        assertArrayEquals("Duplicate Test Fails", Sortedarr, arr);

        /** Test data contains duplicates **/
    }
}
