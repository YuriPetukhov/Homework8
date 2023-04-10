import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3_2();
        task3();
        task4();

    }
    public static void task1 () {
        System.out.println("Задача 1");

        int [] array1 = new int [12];
        array1[0] = 1;
        array1[1] = 2;
        array1[2] = 3;

        float [] array2 = {1.57f, 7.654f, 9.986f};

        String [] array3 = new String []{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    }

    public static void task2 () {
        System.out.println("Задача 2");

        int [] array1 = new int [12];
        array1[0] = 1;
        array1[1] = 2;
        array1[2] = 3;

        float [] array2 = {1.57f, 7.654f, 9.986f};

        String [] array3 = new String []{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

        System.out.print(array1[0]);
        for (int i = 1; i < array1.length; i++) {
            System.out.print(", " + array1[i]);
        }
        System.out.println();
        System.out.print(array2[0]);
        for (int i = 1; i < array2.length; i++) {
            System.out.print(", " + array2[i]);
        }
        System.out.println();
        System.out.print(array3[0]);
        for (int i = 1; i < array3.length; i++) {
            System.out.print(", " + array3[i]);
        }
        System.out.println();
    }

    public static void task3_2 () {
        System.out.println("Задача 3 - второй вариант");

        int [] array1 = new int [12];
        array1[0] = 1;
        array1[1] = 2;
        array1[2] = 3;

        float [] array2 = {1.57f, 7.654f, 9.986f};

        String [] array3 = new String []{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

        for (int i = array1.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(array1[i]);
                break;
            }
            System.out.print(array1[i] + ", ");
        }
        for (int i = array2.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(array2[i]);
                break;
            }
            System.out.print(array2[i] + ", ");
        }
            for (int i = array3.length - 1; i >= 0; i--) {
                if (i == 0) {
                    System.out.println(array3[i]);
                    break;
                }
                System.out.print(array3[i] + ", ");
            }
    }
    public static void task3 () {
        System.out.println("Задача 3");

        int [] array1 = new int [12];
        array1[0] = 1;
        array1[1] = 2;
        array1[2] = 3;

        float [] array2 = {1.57f, 7.654f, 9.986f};

        String [] array3 = new String []{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

        System.out.print(array1[array1.length - 1]);
        for (int i = array1.length - 2; i >= 0; i--) {
            System.out.print(", " + array1[i]);
        }
        System.out.println();
        System.out.print(array2[array2.length - 1]);
        for (int i = array2.length - 2; i >= 0; i--) {
            System.out.print(", " + array2[i]);
        }
        System.out.println();
        System.out.print(array3[array3.length - 1]);
        for (int i = array3.length - 2; i >= 0; i--) {
            System.out.print(", " + array3[i]);
        }
        System.out.println();
    }

    public static void task4 () {
        System.out.println("Задача 4");

        int [] array1 = {4, 5, 3, 1, 12, 34, 16, 0, 11, 89, 100, 35};
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] % 2 != 0) {
                array1[i] ++;
            }
        }
        System.out.println(Arrays.toString(array1));
    }

}