

public class Poo {
//    static void myMethod(String fname, int age) {
//        System.out.println("Welcome " + fname + "your age is " + age);
//    }

//    static void checkAge(int age) {
//        if (age < 18){
//            System.out.println("you age must be at least 18 years");
//        }
//        else {
//            System.out.println("welcome !");
//        }
//    }

    static int myMethod(int x, int y) {
        return y + x ;
    }
    static double myMethod(double x, double y) {
        return y + x ;
    }
    static int myMethod(int x, int y, int z) {
        return y + x + z;
    }
    public static void main(String[] args) {
//        myMethod("abde",20);
//        myMethod("ali",42);
//        myMethod("hhafid",30);
//        checkAge(14);
//        checkAge(25);
        int a = myMethod(5, 9);
        int b = myMethod(4, 6,3);
        double c = myMethod(4.8, 6.9);
        int d = myMethod(7, 3);
        int e = myMethod(3, 2,5);
        double f = myMethod(8.6, 5.4);


        System.out.println("a = " + a + " - b = " + b + " - c = " + c);
        System.out.println("d = " + d + " - e = " + e + " - f = " + f);


    }
}