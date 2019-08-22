package myapp62_zso;


public class MyApp62_ZSO {

    public static void main(String[] args) {
        System.out.println("Исследование циклических конструкций Java");
        
        
        int max = 8;
        for (int i = 0, sum = i; i < max; i++) {
            sum += i;
            System.out.println(i + ": " + sum);
        }
        
        
        int start = 16;  // low range
        int end = 32;    // height range
        int sum = 0;     // inital summrary value
        for (int num = start; num < end; num++) {   // for construction
            if (num % 2 == 0) { // is number even?
                sum += num;     // calc new summary of current iteration.
                System.out.println(num + ": " + sum);
            }
        }
        
        
        int maxNum = 64;        // end point range value
        int summary = 0;        // inital summrary value
        while(maxNum > 0) {     // loop if condition is positive(equal true)
            summary += maxNum;  // add to prev summary number value
            maxNum--;           // move to prev number
        }
        
        System.out.println("Summ for first 64 numbers is " + summary);
        
        
        int factory = 5;
        int result = 1;     // 0! = 1
        
        while (factory > 0) {
            result *= factory;
            factory--;
        }
        
        System.out.println("Factorial of number 5 is " + result);
        
        
        int a = 180;    // first number (non zero)
        int b = 48;     // secondary number
        int tmp;        // tempory variable
        
        while (b !=0) { // last non zero value will be result.
            tmp = a%b;  // swap 'a' vs 'a mod b' 
            a = b;
            b = tmp;
        }
        
        System.out.println("Greatest common divisor of 34 and 8 is " + a);
        
        
        int capacity = 5;        // inital capacity value
        
        do {                     // first run body block
            System.out.println("Capaciy: " + capacity);
            capacity--;
        } while (capacity > 0);  // after chech the condition.
        
        
        int capacity2 = 0;       // inital capacity value, that false condition
        
        do {                     // first run body block
            System.out.println("Capaciy: " + capacity2);
            capacity2--;          // has no affect.
        } while (capacity2 > 0);  // condition is false, loop end.
        
        
        int count = 1024;       // end point value
        int index = 1;          // started index
        int value = count;     // hierarchy increase with full count
        
        do {
            if (index == count) {   // check condition
                break;              // stop loop
            }
            
            if (value % index == 2) {  // calculate hierarchy increase by mod
                value++;               // capture new found count
            }
            
            index++;
        } while (true);         // condition for infinity loop. 
        
        value -= count;        // number of found hierarchy increase
        
        System.out.println("Found hierarchy increase: " + value);
        

        int maxValue = 24;
        int accSummary = 0;
        
        for (int num = 0; num < maxValue; num++) {   // loop over num..maxValue
            if (num % 2 != 0) {     // checking condition
                continue;           // force go to next iteration
            }
            
            accSummary += num;         // add current number
            System.out.println(num + ": " + accSummary);
        }
        
    }
    
}
