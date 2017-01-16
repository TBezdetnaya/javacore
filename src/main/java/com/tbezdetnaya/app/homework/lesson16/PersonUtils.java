package com.tbezdetnaya.app.homework.lesson16;
import com.tbezdetnaya.app.homework.lesson7.Validation;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by tanya on 16.01.2017.
 * Реализовать игру “Угадай-ка”, которая будет выводить случайным образом ФИО одного из известных людей и предлагать пользователю ввести его возраст.
 * В случае совпадения - выводим пользователю поздравление, в противном случае - сообщаем что он неправ и выводим случайным образом ФИО другого известного человека.
 * ФИО не должно повторяться два раза подряд.
 Задачу можно усложнить, спрашивая у пользователя не только возраст, а также то - жив ли этот человек или уже нет. Игра должна завершаться после трех угаданных людей.
 Список людей с ФИО, их возрастами и статусами жизни должен находится в enum.
 */
public class PersonUtils {
    private Random randomGenerator;
    private  Scanner sc = new Scanner(System.in);

    public PersonUtils() {
        randomGenerator = new Random();
    }

    public Person getRandomPerson() {
        Person array[] = Person.values();
        int index = randomGenerator.nextInt(array.length);
        return array[index];
    }

    public void guessPersonData() {
        do {
            try {
                int count = 0;
                do {
                    Person p = getRandomPerson();
                    System.out.println("How old is " + p.getFullName() + "?");
                    String inputAge = sc.next();
                    System.out.println("This person is 'alive' or 'died'?");
                    String inputStatus = sc.next();
                    int age = new Integer(inputAge);
                    if (p.getAge() == age && p.isAlive().equals(inputStatus)) {
                        System.out.println("Congratulations, you guessed!");
                        break;
                    } else {
                        count++;
                    }
                } while (count < 3);
                if (count == 3) {
                    System.out.println("You did not guess age and 'alive' or 'died'!");
                }

            } catch (Exception e) {
                System.out.println("Error: invalid value");
            }
        }while (Validation.needContinue());

    }
}
