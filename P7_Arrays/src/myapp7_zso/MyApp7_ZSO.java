package myapp7_zso;

public class MyApp7_ZSO {

    public static void main(String[] args) {
        System.out.println("Работа с массивами в Java");

        /*
        final int numbersLen = 32;          // array size constant
        int[] numbers=new int[numbersLen];  // alocate array for integer values
        
        for (int index = 0; index < numbersLen; index++) {  // loop over array
            // set array value
            numbers[index] = (index % 2 == 0) ? index : numbersLen - index;
            System.out.print(numbers[index] + ", ");    // print array value
        }
        */
        
        /*
        final int numbersLen = 32;          // array size constant
        int[] numbers=new int[numbersLen];  // alocate array for integer values
        int index = numbersLen;             // index for backward looping
        
        while (index > 0) {                 // backward loop array by index
            index--;  // go to next index (in first iter index == len, so last
                      // index will be len-1)
            numbers[index] = numbersLen * index;     // init array value
            System.out.print(numbers[index] + ", "); // show value from array
        }
        */
 
        /*
        final int numbersLen = 32;
        int[] numbers = new int[numbersLen];
        int index = 0;

        do {
            numbers[index] = index * index;  // set value to num square
            System.out.print(numbers[index] + ", "); // show value from array
            index++;
        } while (index < numbersLen);
        */
        
        /*
        int[] primeNumbers=new int[] {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31};
        int found = 21;
        int result = 0;
        int index = 0;
        
        // Find max number in primeNumbers that less that found value.
        while(index < primeNumbers.length && primeNumbers[index] <= found) {
            result = primeNumbers[index];
            index++;
        }
        
        System.out.println("Max prime number before 21 is: " + result);
        */
        
        /*
        int rowCount = 8;
        int colCount = 16;
        
        // creates a two-dimensional array of 8 rows and 16 columns
        int[][] numbers = new int[rowCount][colCount];
        
        // loop over rows
        for (int rowIndex = 0; rowIndex < rowCount; rowIndex++) {
            // loop over columns in row
            for (int colIndex = 0; colIndex < colCount; colIndex++) {
                // generate random value from 0..colCount
                int value = (int)(colCount * Math.random());
                // set random value to array
                numbers[rowIndex][colIndex] = value;
                // Accessing to value in array by two index(row, col)
                System.out.print(numbers[rowIndex][colIndex] + ", ");
            }
            
            System.out.println();   // move caret to new line
        }
        */
        
        /*
        final int matrixSize = 5;
        // define square matrix, with size 5x5
        int[][] matrix = new int[matrixSize][matrixSize];
        
        int indexRow = 0;
        int indexCol;
        
        // loop over matri rows
        while(indexRow < matrixSize) {
            indexCol = 0;   // reset col index
            
            while(indexCol < matrixSize) {  // loop over sub
                // assign square of indices to matrix array
                matrix[indexRow][indexCol] = indexRow * indexCol;
                System.out.print(matrix[indexRow][indexCol] + ",\t");
                
                indexCol++;
            }
            
            System.out.println();   // move caret to new line
            
            indexRow++;
        }
        */
        
        /*
        final int queryCapacity = 5;
        final int maxLineCapacity = 21;
        int[][] query = new int[queryCapacity][];
        int queryLine = 0;
        
        do {
            // generate random length for query line.
            int lineCapacity = (int)(maxLineCapacity * Math.random()) + 1;
            // create new dimensional in query array whith random length.
            query[queryLine] = new int[lineCapacity];
            
            // iterate query line
            for (int index = 0; index < lineCapacity; index++) {
                int value = (int)(lineCapacity * Math.random()) + queryLine;
                query[queryLine][index] = value;
                
                // print value
                System.out.print(query[queryLine][index] + ",\t");
            }
            
            System.out.println();   // move caret to new line
            queryLine++;
        } while (queryLine < queryCapacity);  // post condition
        */
        
        // Init two-dimensional array with specified values
        int[][] radix = new int[][] {
            {2, 41, 52},
            {5, 6, 1004},
            {0, 9, 82}
        };

        // iterate first dimensional
        for (int indexRow = 0; indexRow < radix.length; indexRow++) {
            // loop over secondary dimensional
            for (int indexCol = 0; indexCol < radix[indexRow].length;) {
                // print array value
                System.out.print(radix[indexRow][indexCol] + ",\t");
                indexCol++;
            }
            
            System.out.println();   // move caret to new line
        }
    }

}
