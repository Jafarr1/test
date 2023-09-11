public class OverLoading {
    public static void main(String[] args) {
        new OverLoading().run();


    }

    public void run() {
        int result1 = addNumbers(10, 15);
        double result2 = addNumbers(5.5, 2.2);
        double result3 = addNumbers(10, 5.5);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);


    }


    public static int addNumbers(int a, int b) {
        return a + b;

    }

    static double addNumbers(double a, double b) {
        return (double) (a + b);
    }

    static double addNumbers(float a, float b) {
        return (double) (a + b);
    }
}
