package myapp5_zso;


public class MyApp5_ZSO {

    public static void main(String[] args) {
        System.out.println("Исследование операторов Java");
        
        System.out.println("\nOperator greater than");
        System.out.println("2 > 2\t\t" + (2 > 2));          // false
        System.out.println("2 > 9\t\t" + (2 > 9));          // false
        System.out.println("2 > -2\t\t" + (2 > -2));        // true
        System.out.println("-2 > -9\t\t" + (-2 > -9));      // true
        
        System.out.println("\nOperator less than");
        System.out.println("2 < 2\t\t" + (2 < 2));          // false
        System.out.println("2 < 9\t\t" + (2 < 9));          // true
        System.out.println("2 < -2\t\t" + (2 < -2));        // false
        System.out.println("-2 < -9\t\t" + (-2 < -9));      // false
        
        System.out.println("\nOperator greater than or equal to");
        System.out.println("2 >= 2\t\t" + (2 >= 2));        // true
        System.out.println("2 >= 9\t\t" + (2 >= 9));        // false
        System.out.println("2 >= -2\t\t" + (2 >= -2));      // true
        System.out.println("-2 >= -9\t" + (-2 >= -9));      // true
        
        System.out.println("\nOperator less than or equal to");
        System.out.println("2 <= 2\t\t" + (2 <= 2));        // true
        System.out.println("2 <= 9\t\t" + (2 <= 9));        // true
        System.out.println("2 <= -2\t\t" + (2 <= -2));      // false
        System.out.println("-2 <= -9\t" + (-2 <= -9));      // false

        System.out.println("\nOperator equal to");
        System.out.println("2 == 2\t\t" + (2 == 2));        // true
        System.out.println("2 == 9\t\t" + (2 == 9));        // false
        System.out.println("2 == -2\t\t" + (2 == -2));      // false
        System.out.println("-2 == -9\t" + (-2 == -9));      // false
        
        System.out.println("\nOperator not equal to");
        System.out.println("2 != 2\t\t" + (2 != 2));        // false
        System.out.println("2 != 9\t\t" + (2 != 9));        // true
        System.out.println("2 != -2\t\t" + (2 != -2));      // true
        System.out.println("-2 != -9\t" + (-2 != -9));      // true
        
        boolean positive = true;
        boolean negative = false;
        
        System.out.println("\nOperator: logical not");
        // inverts the value of a boolean
        System.out.println("!true\t\t" + (!positive));       // false
        System.out.println("!false\t\t" + (!negative));      // true
        
        System.out.println("\nOperator: bitwise AND");
        System.out.println("true & true\t\t" + (true & true));      // true
        System.out.println("true & false\t\t" + (true & false));    // false
        System.out.println("false & true\t\t" + (false & true));    // false
        System.out.println("false & false\t\t" + (false & false));  // false
        
        System.out.println("\nOperator: bitwise OR");
        System.out.println("true | true\t\t" + (true | true));      // true
        System.out.println("true | false\t\t" + (true | false));    // true
        System.out.println("false | true\t\t" + (false | true));    // true
        System.out.println("false | false\t\t" + (false | false));  // false
        
        System.out.println("\nOperator: bitwise exclusive OR(XOR)");
        System.out.println("true ^ true\t\t" + (true ^ true));      // false
        System.out.println("true ^ false\t\t" + (true ^ false));    // true
        System.out.println("false ^ true\t\t" + (false ^ true));    // true
        System.out.println("false ^ false\t\t" + (false ^ false));  // false
        
        System.out.println("\nOperator: logical AND");
        System.out.println("true && true\t\t" + (true && true));      // true
        System.out.println("true && false\t\t" + (true && false));    // false
        System.out.println("false && true\t\t" + (false && true));    // false
        System.out.println("false && false\t\t" + (false && false));  // false
        
        System.out.println("\nOperator: logical OR");
        System.out.println("true || true\t\t" + (true || true));      // true
        System.out.println("true || false\t\t" + (true || false));    // true
        System.out.println("false || true\t\t" + (false || true));    // true
        System.out.println("false || false\t\t" + (false || false));  // false
        
        System.out.println("\nBitwise operators. Unary bitwise complement");
        // ~x = -(~(~x)+1) = -(x+1)
        System.out.println("~0\t\t" + (~0));            // -1
        System.out.println("~128\t\t" + (~128));        // -129
        System.out.println("~-128\t\t" + (~-128));      // 127
        System.out.println("~-255\t\t" + (~255));       // -256
        System.out.println("~-1\t\t" + (~-1));          // 0
        System.out.println("~(~255)\t\t" + (~~255));    // 255
        
        System.out.println("\nBitwise operators. Bitwise AND");
        // Equal 1 if both bit is 1, else zero.
        // 0 0  => 0
        // 0 1  => 0
        // 1 0  => 0
        // 1 1  => 1
        //      00110011 => 51
        // AND  00101010 => 42
        //      00100010 => 34
        System.out.println("51 & 42\t\t" + (51 & 42));          // 34
        System.out.println("42 & 51\t\t" + (42 & 51));          // 34
        System.out.println("-128 & -128\t" + (-128 & -128));    // -128
        // x & 1 equal to x % 2
        System.out.println("128 & 1\t\t" + (128 & 1));          // 0
        System.out.println("129 & 1\t\t" + (129 & 1));          // 1
        
        System.out.println("\nBitwise operators. Bitwise OR");
        // Equal 1 if one of bit is 1, else zero.
        // 0 0  => 0
        // 0 1  => 1
        // 1 0  => 1
        // 1 1  => 1
        //      00110011 => 51
        // OR   00101010 => 42
        //      00111011 => 59
        System.out.println("51 | 42\t\t" + (51 | 42));          // 59
        System.out.println("16 | -16\t" + (16 | -16));          // -16
        
        System.out.println("\nBitwise operators. Bitwise XOR");
        // Equal 1 if bits are different.
        // 0 0  => 0
        // 0 1  => 1
        // 1 0  => 1
        // 1 1  => 0
        //      00110011 => 51
        // XOR  00101010 => 42
        //      00011001 => 59
        System.out.println("51 ^ 42\t\t" + (51 ^ 42));          // 25
        System.out.println("16 ^ -16\t" + (16 ^ -16));          // -32
        // XOR any number with 0 always equals number.
        System.out.println("16 ^ 0\t\t" + (16 ^ 0));            // 16
        // XOR any number X with -1 yields ~X
        System.out.println("16 ^ -1\t\t" + (16 ^ -1));          // -17
        
        System.out.println("\nBitwise shift operators. Left shift");
        // 19       => 19 : 00010011
        // 19 << 2  => 76 : 01001100
        // x << y equals to x * 2^y
        System.out.println("19 << 2\t\t" + (19 << 2));          // 76
        System.out.println("2 << 8\t\t" + (2 << 8));            // 512
        System.out.println("-2 << 8\t\t" + (2 << 8));           // 512
        
        System.out.println("\nBitwise shift operators. Right shift");
        // 19       => 19  : 00010011
        // 19 >> 2  => 4   : 00000100
        System.out.println("19 >> 2\t\t" + (19 >> 2));          // 4
        System.out.println("2 >> 8\t\t" + (2 >> 8));            // 0
        System.out.println("-16 >> 2\t" + (-16 >> 2));          // -4
        
        System.out.println("\nBitwise shift operators. Zero-fill right shift");
        // Result is always non-negative.
        System.out.println("19 >>> 2\t" + (19 >>> 2));          // 4
        System.out.println("2 >>> 8\t\t" + (2 >>> 8));          // 0
        System.out.println("-16 >>> 2\t" + (-16 >>> 2));        // 1073741820
    }

}
