public class Dz2 {
    public static void main(String[] args){

        //1
        boolean res1 = within10and20(12, -9);
        System.out.println(res1);

        //2
        isPositiveOrNegative(-93);

        //3
        boolean res3 = isNegative(19);
        System.out.println(res3);

        //4
        printWordNTimes("Я изучаю Java в GeekBrains", 3);

        //5
        boolean res5 = leapYear(2002);
        System.out.println(res5);
    }


    public static boolean within10and20(int x1, int x2) {
        int sum = x1 + x2;
        return (sum > 10 && sum <= 20);
    }

    public static void isPositiveOrNegative(int x) {
        if (x >= 0)
            System.out.println(x + " - положительное число");
        else
            System.out.println(x + " - отрицательное число");
    }

    public static boolean isNegative(int x) {
        return (x < 0);
        /*
        на такой укороченной версии настаивает IDEA
        изначально было так
        if (x < 0)
           return true;
        else
           return false;
         */
    }

    public static void printWordNTimes(String word, int times) {
        while (times > 0) {
            System.out.println(word);
            times--;
        }
    }

    public static boolean leapYear(int year){
        return ((year % 4 == 0 && year % 100 !=0) || year % 400 == 0);
    }
}
