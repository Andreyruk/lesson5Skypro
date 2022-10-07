public class Main {
    public static void main(String[] args) {
    //Домашнее задание 5.1
        System.out.println("Домашнее задание 5.1");
        { //Задача 1
            System.out.println("Задача 1");
            int age = 20;
            if (age >= 18) System.out.println("Вам " + age + ". Поздровляем с совершеннолетием.");
            if (age < 18) System.out.println("Вам " + age + ". Возраст совершеннолетия ещё не наступил.");
        }
        { //Задача 2
            System.out.println("Задача 2");
            int age = 22;
            if (age >= 7 && age < 18) System.out.println(age +" - школный возраст");
            if (age >= 18 && age < 24) System.out.println(age +" - студенческий возраст");
            if (age >= 24) System.out.println(age +" - возраст рабочего человека");
        }
        { //Задача 3
            System.out.println("Задача 3");
            int occupiedPlaces = 102;
            if (occupiedPlaces < 60) System.out.println("Количество занятых мест "+ occupiedPlaces +", есть сидячие и стоячие места.");
            if (occupiedPlaces >= 60 && occupiedPlaces < 102) System.out.println("Количество занятых мест "+ occupiedPlaces +", есть стоячие места.");
            if (occupiedPlaces >= 102) System.out.println("Количество занятых мест "+ occupiedPlaces +", свободных мест нет.");
        } System.out.println();
    //Домашнее задание 5.2
        System.out.println("Домашнее задание 5.2");
        { //Задача 1
            System.out.println("Задача 1");
            int age = 15;
            if (age >= 18) System.out.println("Вам " + age + ". Поздровляем с совершеннолетием.");
            else System.out.println("Вам " + age + ". Возраст совершеннолетия ещё не наступил.");
        }
        { //Задача 2
            System.out.println("Задача 2");
            int age = 14;
            if (age >= 7 && age < 18) System.out.println(age +" - школный возраст");
            else if (age >= 18 && age < 24) System.out.println(age +" - студенческий возраст");
            else if (age >= 24) System.out.println(age +" - возраст рабочего человека");
        }
        { //Задача 3
            System.out.println("Задача 3");
            int occupiedPlaces = 10;
            if (occupiedPlaces < 60) System.out.println("Количество занятых мест "+ occupiedPlaces +", есть сидячие и стоячие места.");
            else if (occupiedPlaces >= 60 && occupiedPlaces < 102) System.out.println("Количество занятых мест "+ occupiedPlaces +", есть стоячие места.");
            else System.out.println("Количество занятых мест "+ occupiedPlaces +", свободных мест нет.");
        } System.out.println();
        //Домашнее задание 5.3
        System.out.println("Домашнее задание 5.3");
        { //Задача 1
            System.out.println("Задача 1");
            int age = 25;
            if (age >=2 && age <= 6) System.out.println("Если возраст человека равен "+ age +", то ему нужно ходить в детский сад.");
            if (age >= 7 && age < 18) System.out.println("Если возраст человека равен "+ age +", то ему нужно ходить в школу.");
            if (age >= 18 && age < 24) System.out.println("Если возраст человека равен "+ age +", то ему нужно ходить в университет.");
            else if (age >=24) System.out.println("Если возраст человека равен "+ age +", то ему нужно ходить на работу.");
        }
        { //Задача 2
            System.out.println("Задача 2");
            int age = 9;
            if (age < 5) System.out.println("Если возраст ребёнка равен "+ age +", то он не может кататься на аттракционе.");
            if (age >= 5 && age < 14) System.out.println("Если возраст ребёнка равен "+ age +", то он может кататься на аттракционе, только в сопровождении взрослого.");
            else if (age >= 14) System.out.println("Если возраст равен "+ age +", то можно кататься на аттракционе, без сопровождения взрослого.");
        }
        { //Задача 3
            System.out.println("Задача 3");
            int one=7;
            int two=5;
            int three=3;
            if (one >= two && one > three) System.out.println("Максимальное число "+ one);
            else if (two > one && two >= three) System.out.println("Максимальное число "+ two);
            else if (three >= one && three > two) System.out.println("Максимальное число "+ three);
            else System.out.println("Все три числа равны "+ one);
        }
    }
}