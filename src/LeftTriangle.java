// Timothy Lafontaine ID: 261066866

public class LeftTriangle {
	
	public static void main(String args[]) {
	   
	int UserInput = Integer.parseInt(args[0]); {
			
	int a, b;
	    	        	    	       
		if (UserInput < 0) {
	    	           	    			    		
		System.out.print("Error: input value must be >= 0 "); }
	    	  
		// Number of rows 
	    	
		for (a = 0; a < UserInput; a++) {
	    	  
		// Number of columns
		// Number of stars depending on user input 
					
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
