// Timothy Lafontaine ID: 261066866

public class RightTriangle {
 
	public static void main(String args[]) {
   
    	// Input user variable in first Run configuration arguments slot 
    	
    int UserInput = Integer.parseInt(args[0]); {
    
    int a, b;
        
        // Error message if less than 0 
        
    	if (UserInput < 0) {
       
        System.out.print("Error: input value must be >= 0 "); 
        }
  
        // Loop one for = 0 
        
       for (a = 0; a < UserInput; a++) {
        	

        // Loop two nested for <0
        	
    	for (b = 2 * (UserInput - a); b >= 0; b--) {
            	
        // Spaces 
            	
        System.out.print(" ");
        }
  
        // Loop three nested for *'s
            
        for (b = 0; b <= a; b++) {
            	
        // Star print
            	
        System.out.print("* ");
        }
  
        // End line
            
        System.out.println();
        }
        
}
    
    	}
    
}