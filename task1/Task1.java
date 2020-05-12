package task1;

import java.util.Arrays;
import java.util.Collections;

public class Task1 {

	public static void main(String[] args) {
		
		/**
        *
        * 1. The variables of the primitive data types.
        * 2. Use the wrapper to select the maximum and minimum of all data types.
        * 3. Create an int, fill it with data, and output min and max to the console.
        *
        */
		
		
		//Integer
        byte a = 2;
        char b = 'c';
        short sh = 3;
        int in = 3;
        long lg = 223L;

        // Floating point
        float fl = 2.2F;
        double db = 2.32D;

        //Symbolic
        char ch = 'a';

        //Logical
        boolean bl = true;
        
        
        System.out.println("Byte min and max value is from [" + Byte.MIN_VALUE + "] to [" + Byte.MAX_VALUE + "]");
        System.out.println("Integer min and max value is from [" + Integer.MIN_VALUE + "] to [" + Integer.MAX_VALUE + "]");
        System.out.println("Double min and max value is from  [" + Double.MAX_VALUE + "] to [" + Double.MIN_VALUE + "]");
        System.out.println("Character min and max value is from [" + Character.MIN_VALUE + "] to [" + Character.MAX_VALUE + "]");
        System.out.println("Short min and max value is from ["+ Short.MIN_VALUE +"] to [" + Short.MAX_VALUE + "]");
        System.out.println("Long min and max value is from ["+ Long.MIN_VALUE +"] to [" + Long.MAX_VALUE + "]");
       
        
        System.out.print( "Boolean has value: ["+ Boolean.valueOf(bl) +"] \n");
        
		/**
		 * Find the min and max values from the integer Array.
		 */
		Integer[] intArr = {2,23,98,14,45};
		
	    // using Collections.min() to find minimum element
	    int min = Collections.min(Arrays.asList(intArr));
	
	    // using Collections.max() to find maximum element
	    int max = Collections.max(Arrays.asList(intArr));
	
	    // printing minimum and maximum numbers
	    System.out.println("Minimum number of array is : " + min);
	    System.out.println("Maximum number of array is : " + max);

	}

}
