package com.tbezdetnaya.app.homework.lesson9;
import org.junit.Assert;
import org.junit.Test;

public class BubbleSortTest {
    BubbleSort bubbleSort = new BubbleSort();

    @Test
    public void testArraySortAscend() throws Exception {
         int [] arr = {2, 10, 72, 2, 9, 40, 48, 5, 5, 49 };
        int [] expected ={2, 2, 5, 5, 9, 10, 40, 48, 49, 72};
        int [] result = bubbleSort.arraySortAscend(arr);
        Assert.assertArrayEquals(expected,result);

    }

    @Test
    public void testArraySortDecrease() throws Exception {
        int [] arr = {2, 10, 72, 2, 9, 40, 48, 5, 5, 49 };
        int [] expected ={72, 49, 48, 40, 10, 9, 5, 5, 2, 2};
        int [] result = bubbleSort.arraySortDecrease(arr);
        Assert.assertArrayEquals(expected,result);


    }

    @Test
    public void testSortArrayAscend() throws Exception {
        int [] arr = {62, 92, 43, 3, 75, 45, 43, 40, 76, 3 };
        int [] expected ={3, 3, 40, 43, 43, 45, 62, 75, 76, 92};
        int [] result = bubbleSort.sortArrayAscend(arr);
        Assert.assertArrayEquals(expected,result);

    }

    @Test
    public void testSortArrayDecrease()throws Exception {
        Integer arr [] = {11, 96, 7, 10, 71, 19, 48, 75, 69, 37 };
        Integer expected [] = {96, 75, 71, 69, 48, 37, 19, 11, 10, 7};
        Integer result[] = bubbleSort.sortArrayDecrease(arr);
        Assert.assertArrayEquals(expected,result);

    }


    @Test
    public void testSelectionSortArray()throws Exception{
        int [] arr = {18, 53, 5, 6, 22, 14, 60, 11, 42, 27 };
        int [] expected = {5, 6, 11, 14, 18, 22, 27, 42, 53, 60 };
        int [] result = bubbleSort.selectionSortArray(arr);
        Assert.assertArrayEquals(expected,result);

    }



}