package org.me.mylib;

/**
 * A <code>LibClass</code> adds functionality for some string and array 
 * transformation.
 * 
 * @author mda
 */
public class LibClass {

    /**
     * Build acronym string from first letters of input array
     * 
     * <pre>LibClass.acrostic(String[])</pre>
     * 
     * @param args The array of string
     * @return Acronym string
     */
    public static String acrostic(String[] args) {
        StringBuffer b = new StringBuffer();

        for (int i = 0; i < args.length; i++) {
            if (args[i].length() > i) {
                b.append(args[i].charAt(i));
            } else {
                b.append('?');
            }
        }
        
        return b.toString();
    }
    
    public static String sayHello() {
        return "Hello, World!";
    }

}
