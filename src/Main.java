//import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
//         video_01_02
//          int a = 4;
//          int b = 5;
//          double c = 3.14;
//          double sum = a + b + c;
//          String message = "the Sum is : ";
//          System.out.println(message + sum);

//      video_03
//      primitive and non-primitive data types
//        char grade = 'A';
//        boolean isPass = true;
//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println("your grade is : " + grade);
//        System.out.println("Pass : " + isPass);
//        System.out.println("first number is : " + numbers[1]);

//      video_04
//        int x;
//        int a = 1;
//        int b = 2;
//        x = a+b;
//        System.out.println("x value is : " + x);

//      video_05
//        int a = 5;
//        int b = 6;
//        boolean aa = true;
//        boolean bb = false;
//        System.out.println(a == b );
//        System.out.println(a >= b );
//        System.out.println(a <= b );
//        System.out.println(aa || bb);
//        System.out.println(aa && bb);
//        System.out.println(!aa);
//        int a = 5;    // Binary: 0101
//        int b = 3;    // Binary: 0011
////        The & operator compares each bit of two integers and returns 1 only if both bits are 1; otherwise, it returns 0.
//        System.out.println("a & b = " + (a & b)); // Output: 1 (Binary: 0001)
////        The | operator compares each bit and returns 1 if at least one of the bits is 1.
//        System.out.println("a | b = " + (a | b)); // Output: 7 (Binary: 0111)
////        The ^ operator returns 1 only if the bits are different; otherwise, it returns 0.
//        System.out.println("a ^ b = " + (a ^ b)); // Output: 6 (Binary: 0110)
//        System.out.println("~a = " + (~a));       // Output: -6 (Binary: 1010)
//        System.out.println("a << 1 = " + (a << 1)); // Output: 10 (Binary: 1010)
//        System.out.println("a >> 1 = " + (a >> 1)); // Output: 2  (Binary: 0010)

//      video_06
//       If-Else Statement
//        int a =40;
//        if(a > 10 && a < 20 ){
//            System.out.println("you  passed the exam : and your note is : " + a);
//        }else if(a > 0 && a <10){
//            System.out.println("you didn't passed the exam : and your note is : " + a);
//        }else{
//            System.out.println("pleas entre a valid note");
//        }
//        Switch Statement
//        int day = 13;
//        String dayName;
//
//        switch (day) {
//            case 1:
//                dayName = "Monday";
//                break;
//            case 2:
//                dayName = "Tuesday";
//                break;
//            case 3:
//                dayName = "Wednesday";
//                break;
//            case 4:
//                dayName = "Thursday";
//                break;
//            case 5:
//                dayName = "Friday";
//                break;
//            case 6:
//                dayName = "Saturday";
//                break;
//            case 7:
//                dayName = "Sunday";
//                break;
//            default:
//                dayName = "Invalid day";
//        }
//        System.out.println("Day of the week: " + dayName);

//      video_07
//        for(int i = 0; i < 10 ; i++){
//            System.out.println(i);
//        }
//
//        for(int j = 0; j <= 10; j=j+2){
//            System.out.println(j);
//        }

//                String[] days = {"ltnin", "tlat", "larb3", "lkhmis", "ljam3", "sbt"};
//                for(int i = 0; i < 2; i++) {
//                    for(int j = 0; j < days.length; j++) {
//                        System.out.print(days[j] + " ");
//                    }
//                    System.out.println();
//                }
        int i=0;
        while (i <= 10){
            System.out.println("value of i == " + i);
            ++i;
        }

        do {
            System.out.println(i);
            i++;
        }
        while (i <= 1 );













//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter the first number: ");
//        int num1 = scanner.nextInt();
//
//        System.out.print("Enter the second number: ");
//        int num2 = scanner.nextInt();
//
//        int sum = num1 + num2;
//
//        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
//
//        scanner.close();
    }
}