
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
            while ( numberTwo >= 1 ) {
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



            int kometa = 2022;
            int yearBefore = kometa - 200;
            int yearAfter = kometa + 100;

            if (kometa > yearBefore)
            {
                while (kometa > yearBefore)
                {
                    kometa = kometa - 79;
                }
            }

            while (kometa < yearAfter ){
                kometa = kometa + 79;
                System.out.println(kometa);
            }





        }

    }

}





