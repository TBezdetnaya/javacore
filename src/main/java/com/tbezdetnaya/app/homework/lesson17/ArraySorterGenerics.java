package com.tbezdetnaya.app.homework.lesson17;
/**
 * Написать class ArraySorterGenerics который сортирует любой массив типов которые extends Numbers
 -принимает этот массив в конструкторе;
 -имеет не-статический метод sort() для сортировки внутреннего массива, а также геттер для извлечения внутреннего массива из объекта
 -имеет статический метод static sort() который принимает на входе любой массив типов которые extends Numbers и возвращает этот сортированный массив
 * Created by tanya on 18.01.2017.
 */
public class ArraySorterGenerics<T extends Number>  {

    private T[]arr;
    private T[]arraySorted;

    public ArraySorterGenerics(T[]arr) {
        this.arr = arr;

    }

    public T[] getArr() {
        return arraySorted;
    }
    public void sort (){
        this.arraySorted = arrayBubbleSortDecrease(arr);
    }

    public static <U extends Number> U[] arrayBubbleSortDecrease(U[] arr) {
        U temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j].doubleValue()< arr[j + 1].doubleValue())  {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        return arr;
    }
}
