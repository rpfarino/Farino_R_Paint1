/* Robert Farino
 * IT 145 Foundations in App Development
 * Southern New Hampshire University */

import java.util.Scanner;

public class Paint1 {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double wallHeight = 0.0;
        double wallWidth = 0.0;
        double wallArea = 0.0;
        double gallonsPaintNeeded = 0.0;
        boolean valueValid;
        
        final double squareFeetPerGallons = 350.0;
        
        // Implement a do-while loop to ensure input is valid
        // Prompt user to input wall's height
        valueValid = false;
        do
        {
        	try
        	{
        		System.out.println("Enter wall height (feet): ");
        		wallHeight = scnr.nextDouble();
        		
        		// Make sure wallHeight is greater than 0.
        		if (wallHeight > 0)
        			valueValid = true; // Exit loop since wall height is valid.
        		else
        			System.out.println("Wall Height Must be Greater than 0.");
	    	}
	    	catch(Exception ex)
	    	{
	    		// An exception was thrown (e.g., a string may have been entered
	    		// by the user). Print an error message and clear the input buffer.
	    		System.out.println("Please Enter a Valid Wall Height.");
	    		scnr.nextLine();
	    	}
	       
	    } while(valueValid == false); // Ask user for wall height again if it was not valid.
        
        // Implement a do-while loop to ensure input is valid
        // Prompt user to input wall's width
        valueValid = false;
        do
        {
        	try
        	{
        		// Bug Fix: Replaced wallHeight with wallWidth in 
        		// call to scnr.nextDouble().
        		System.out.println("Enter wall width (feet): ");
        		wallWidth = scnr.nextDouble();
        		
        		// Make sure wallWidth is greater than 0.
        		if (wallWidth > 0)
        			valueValid = true; // Exit loop since wall width is valid.
        		else
        			System.out.println("Wall Width Must be Greater than 0.");
        	}
        	catch(Exception ex)
        	{
	    		// An exception was thrown (e.g., a string may have been entered
	    		// by the user). Print an error message and clear the input buffer.
        		System.out.println("Please Enter a Valid Wall Width.");
        		scnr.nextLine();
        	}
	       
        } while(valueValid == false); // Ask user for wall width again if it was not valid.

        // Calculate and output wall area
        // Bug Fix: Added wallArea to println().
        wallArea = wallHeight * wallWidth;
        System.out.println("Wall area: " + wallArea + " square feet");

        // Calculate and output the amount of paint (in gallons) needed to paint the wall
        // Bug Fix: Fixed typo in gallonsPaintNeeded in println().
        gallonsPaintNeeded = wallArea/squareFeetPerGallons;
        System.out.println("Paint needed: " + gallonsPaintNeeded + " gallons");

        scnr.close();
    }
}
