public class Poo {
//    static void myMethod(String fname, int age) {
//        System.out.println("Welcome " + fname + "your age is " + age);
//    }

    static void checkAge(int age) {
        if (age < 18){
            System.out.println("you age must be at least 18 years");
        }
        else {
            System.out.println("welcome !");
        }
    }
    public static void main(String[] args) {
//        myMethod("abde",20);
//        myMethod("ali",42);
//        myMethod("hhafid",30);
        checkAge(14);
        checkAge(25);
    }
}