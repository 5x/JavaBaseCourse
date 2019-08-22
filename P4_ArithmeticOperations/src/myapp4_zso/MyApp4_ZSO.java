package myapp4_zso;

public class MyApp4_ZSO {

    public static void main(String[] args) {
        /*
        System.out.println("Исследование операторов Java");
        System.out.println("Оператори присваивания и \"+\"");

        int int1_ZSO, int2_ZSO, int3_ZSO;   // One line declare multiple(3)
                                            // variables, with out any init.

        int1_ZSO = int2_ZSO = 3;            // Initialize multiple(2) variables
                                            // of same type with same value
                                            // integer(3).

        int3_ZSO = 2;                       // Init variable "int3_ZSO" with 
                                            // integer value of 2.

        int result_ZSO;                     // Declare new variable with 
                                            // integer type for storage result.

        result_ZSO = int1_ZSO + int3_ZSO;   // Assign to variable "result_ZSO"
                                            // the result of addition variable
                                            // values from "int1_ZSO" and 
                                            // "int3_ZSO".

        // print result of concatenation const string and integer value
        // to default output stream and then terminate the line.
        System.out.println("result_ZSO=" + result_ZSO);
        */

        // NOTE: I don`t wanna repeate stupid task way. Next task by one way!
        System.out.println("Arithmetic demonstration.");
        System.out.println("@operator \t(int(5) {@operator} int(2))");

        int first = 5;
        int second = 2;

        System.out.println("addition:\t" + (first + second));
        System.out.println("subtraction:\t" + (first - second));
        System.out.println("multiplication:\t" + (first * second));
        System.out.println("division:\t" + (first / second));
        System.out.println("modulo: \t" + (first % second));

        System.out.println("\nOperators increment and decrement.");
        System.out.println("@operator\t(@operator@index) or (@index@operator)");

        int index = 0;

        System.out.println("initialize\t" + index);
        System.out.println("post-increment\t" + index++); // index = 1, print 0
        System.out.println("pre-increment\t" + ++index);  // index = 2, print 2
        System.out.println("post-decrement\t" + index--); // index = 1, print 2
        System.out.println("pre-decrement\t" + --index);  // index = 0, print 0
    }

}
