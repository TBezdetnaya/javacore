package com.tbezdetnaya.app.homework.lesson9;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by tanya on 06.12.2016.
 */
public class ArrayUtilsTest {
    ArrayUtils arrayUtils = new ArrayUtils();
    double[] arr = {2, 10, 72, 2, 9, 40, 48, 5, 5, 49 };
    double[] expectedAscending = {2, 2, 5, 5, 9, 10, 40, 48, 49, 72};
    double[] expectedDecrease = {72, 49, 48, 40, 10, 9, 5, 5, 2, 2};
    Integer[] expectedAscendingInt = {2, 2, 5, 5, 9, 10, 40, 48, 49, 72};
    Integer[] expectedDecreaseInt = {72, 49, 48, 40, 10, 9, 5, 5, 2, 2};
    Integer[] arrInt = {2, 10, 72, 2, 9, 40, 48, 5, 5, 49 };
    int array [][]=  {{-9,1,0},
                     {4,1,1},
                     {-2,2,-1}};
    int expected = 4;


    @Test
    public void testArrayBubbleSortAscending() throws Exception {
        double[] result = arrayUtils.arrayBubbleSortAscending(arr);
        Assert.assertArrayEquals(expectedAscending,result,0);
    }

    @Test
    public void testArrayBubbleSortDecrease() throws Exception {
        double[] result = arrayUtils.arrayBubbleSortDecrease(arr);
        Assert.assertArrayEquals(expectedDecrease,result,0);
    }

    @Test
    public void testSelectionSortArray() throws Exception {
        double[] result = arrayUtils.selectionSortArray(arr);
        Assert.assertArrayEquals(expectedAscending,result,0);
    }

    @Test
    public void testSearchMaxNumberArray() throws Exception {
        int result = arrayUtils.searchMaxNumberArray(array);
        Assert.assertEquals(expected,result);
    }

    @Test
    public void testSortArrayAscending() throws Exception {
        Integer[] result = arrayUtils.sortArrayAscending(arrInt);
        Assert.assertArrayEquals(expectedAscendingInt,result);
    }

    @Test
    public void testSortArrayDecrease() throws Exception {
        Integer result[] = arrayUtils.sortArrayDecrease(arrInt);
        Assert.assertArrayEquals(expectedDecreaseInt,result);

    }
}