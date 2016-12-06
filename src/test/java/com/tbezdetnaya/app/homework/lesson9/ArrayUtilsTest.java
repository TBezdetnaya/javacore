package com.tbezdetnaya.app.homework.lesson9;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by tanya on 06.12.2016.
 */
public class ArrayUtilsTest {
    ArrayUtils arrayUtils = new ArrayUtils();
    Integer[] arr = {2, 10, 72, 2, 9, 40, 48, 5, 5, 49 };
    Integer[] expectedAscending = {2, 2, 5, 5, 9, 10, 40, 48, 49, 72};
    Integer[] expectedDecrease = {72, 49, 48, 40, 10, 9, 5, 5, 2, 2};
    int array [][]=  {{-9,1,0},
                     {4,1,1},
                     {-2,2,-1}};
    int expected = 4;


    @Test
    public void testArrayBubbleSortAscending() throws Exception {
        Integer[] result = arrayUtils.arrayBubbleSortAscending(arr);
        Assert.assertArrayEquals(expectedAscending,result);
    }

    @Test
    public void testArrayBubbleSortDecrease() throws Exception {
        Integer[] result = arrayUtils.arrayBubbleSortDecrease(arr);
        Assert.assertArrayEquals(expectedDecrease,result);
    }

    @Test
    public void testSelectionSortArray() throws Exception {
        Integer[] result = arrayUtils.selectionSortArray(arr);
        Assert.assertArrayEquals(expectedAscending,result);
    }

    @Test
    public void testSearchMaxNumberArray() throws Exception {
        int result = arrayUtils.searchMaxNumberArray(array);
        Assert.assertEquals(expected,result);
    }

    @Test
    public void testSortArrayAscending() throws Exception {
        Integer[] result = arrayUtils.sortArrayAscending(arr);
        Assert.assertArrayEquals(expectedAscending,result);
    }

    @Test
    public void testSortArrayDecrease() throws Exception {
        Integer result[] = arrayUtils.sortArrayDecrease(arr);
        Assert.assertArrayEquals(expectedDecrease,result);

    }
}