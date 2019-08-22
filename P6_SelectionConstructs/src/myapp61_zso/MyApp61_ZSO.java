package myapp61_zso;

public class MyApp61_ZSO {

    enum Status {
        ACCEPTED, MOVED, GONE, ERROR
    }

    public static void main(String[] args) {
        System.out.println("Исследование конструкций выбора Java");

        
        // If condition is true in logical context, body block will be execute.
        if (true) {
            System.out.println("Yeah! True is True.");
        }

        int partial = 10;
        int base = 16;

        // If condition is true, run 'true' part, otherwise 'else' block.
        // Necessarily that one of the block will be execute.
        if (partial != base && base > 0) {
            System.out.println("Called");           // the condition equal true
        } else {
            System.out.println("I am never show."); // the condition equal false
        }

        int summary = 120;
        int average = 64;

        // Combine and create nested block into another as u want.
        if (summary > 0) {
            if (summary > average) {
                System.out.println("You paid more than others");
            } else if (summary == average) {
                System.out.println("You pay average sum.");
            } else {
                System.out.println("You paid less than others");
            }
        } else if (summary == 0) {
            System.out.println("You summary is empty. Continue with out pay.");
        } else {
            System.out.println("Summary can`t be negative");
        }
        
        
        Status pageStatus = Status.GONE;
        // print description about status code.
        switch (pageStatus) {  // Find equal value to expression
            case ACCEPTED:     // If expression equal to ACCEPTED, run block.
                System.out.println("Accepted for processing. Just waite.");
                break;         // Determinate switch operator
            case MOVED:        // Another value to compare with expression
                System.out.println("Moved to another resource.");
                break;
            case GONE:
                System.out.println("No longer available.");
                break;
            case ERROR:
                System.out.println("Incorrect input data.");
                break;
            default: // Default way, run if not found value equal to expression.
                System.out.println("Unsupported status code!");
                break;
        }
        
        
        // Case with out break, execute all blocks after first found too.
        // Next u can see 'Roberto Watts' student and all next(to end)..
        int studentID = 3;
        switch (studentID) {
            case 1:
                System.out.println("Brent Rogers");
            case 2:
                System.out.println("Curtis Hill");
            case 3:
                System.out.println("Roberto Watts");
            case 4:
                System.out.println("Wayne Weaver");
            case 5:
                System.out.println("Wilma Reid");
        }
        
        
        System.out.println("Ternary operator");
        // "(condition) ? x : y" equal to "if (condition) x else y"
        String value = (5 > 2) ? "More" : "Less";
        System.out.println("5 is \"" + value + "\" that 2");
        
        // Nested ternary operations:
        int EOFType = (value.equals("\r\n")) ? 1 : 
                ((value.equals("\n")) ? 2 : 3);
        System.out.println("EOF: " + EOFType);
    }

}
