public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();

    }

    private static void task1() {
        int[] first = new int[12];
        first[0] = 1;
        first[1] = 2;
        first[2] = 3;
        double[] second = {1.57, 7.654, 9.986};
        boolean[] third = {true, false};
    }

    private static void task2() {
        int[] first = new int[12];
        first[0] = 1;
        first[1] = 2;
        first[2] = 3;
        double[] second = {1.57, 7.654, 9.986};
        boolean[] third = {true, false};
        for (int i = 0; i < first.length; i++) {
            if (i == first.length - 1) {
                System.out.printf("%d %n", first[i]);
            } else {
                System.out.printf("%d,", first[i]);
            }
        }
        for (int j = 0; j < second.length; j++) {
            if (j == second.length - 1) {
                System.out.printf("%s%n", second[j]);
            } else {
                System.out.printf("%s,", second[j]);
            }
        }
        for (int j = 0; j < third.length; j++) {
            if (j == third.length - 1) {
                System.out.printf("%s%n", third[j]);
            } else {
                System.out.printf("%s,", third[j]);
            }
        }
        System.out.println();
    }

    private static void task3() {
        int[] first = new int[12];
        double[] second = {1.57, 7.654, 9.986};
        boolean[] third = {true, false};
        first[0] = 1;
        first[1] = 2;
        first[2] = 3;
        for (int i = first.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.printf("%d %n", first[i]);
            } else {
                System.out.printf("%d,", first[i]);
            }
        }
        for (int j = second.length - 1; j >= 0; j--) {
            if (j == 0) {
                System.out.printf("%s%n", second[j]);
            } else {
                System.out.printf("%s,", second[j]);
            }
        }
        for (int j = third.length - 1; j >= 0; j--) {
            if (j == 0) {
                System.out.printf("%s%n", third[j]);
            } else {
                System.out.printf("%s,", third[j]);
            }
        }
        System.out.println();
    }

    private static void task4() {
        int[] first = new int[12];
        first[0] = 1;
        first[1] = 2;
        first[2] = 3;
        for (int i = 0; i < first.length; i++) {
            if (first[i] % 2 != 0) {
                first[i]++;
            }
            if (i < first.length - 1) {
                System.out.printf("%d,", first[i]);
            } else {
                System.out.printf("%d%n", first[i]);
            }
        }
    }


}