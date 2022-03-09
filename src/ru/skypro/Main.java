
package ru.skypro;

public class Main {

    public static void main(String[] args) {
        // Задача 1
        {
            int number = 1;
            while (number <= 10) {
                if (number == 10) {
                    System.out.println(10);
                    break;
                }
                System.out.print(number + " ");
                number++;

            }
        }
        {
            int numberTwo = 10;
            while (numberTwo >= 1) {
                if (numberTwo == 1) {
                    System.out.println(1);
                    break;
                }
                System.out.print(numberTwo + " ");
                numberTwo--;
            }
        }
        // Задача 2
        {
            int friday = 1;
            do {
                System.out.println("Сегодня пятница " + friday + "-е число. Необходимо подготовить отчет.");
                friday = friday + 7;
            }
            while (friday <= 31);
        }
        // Задача3
        {
            int yearBefore = 1822;
            int yearAfter = 2122;
            for (; yearBefore <= yearAfter; yearBefore++ ){
            if (yearBefore % 79 == 0) { System.out.println(yearBefore);
             }}
        }
    }
    }







