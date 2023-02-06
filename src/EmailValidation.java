// Timothy Lafontaine ID: 261066866
// Assignment 2 : EmailValidation 

public class EmailValidation {
	
	public static void main(String[] args) {
		
		
		String isAlphaNumericChar = args[0];
		String isValidPrefixChar = args[0];
		String isValidDomainChar = args[0];
				
		
		char char1 = isAlphaNumericChar.charAt(0);
		char char2 = isValidPrefixChar.charAt(0);
		char char3 = isValidDomainChar.charAt(0);
				
		
		System.out.println(isAlphaNumeric(char1));
		System.out.println(isValidPrefixChar(char2));
		System.out.println(isValidDomainChar(char3));
		System.out.println(exactlyOneAt("tim@gmail.com"));
		System.out.println(getPrefix("tim@gmail.com"));
		System.out.println(getDomain("tim@gmail.com"));
		System.out.println(isValidPrefix("tim@gmail.com"));
		System.out.println(isValidDomain("tim@gmail.com"));
		System.out.println(isValidEmail("tim@gmail.com"));

			
	}

	// 1a) Character is Alphanumeric ( input character in args 0 ) 
	
	public static boolean isAlphaNumeric (char char1) {
		if (char1 >= 'a' && char1 <= 'z') return true;
	    if (char1 >= 'A' && char1 <= 'Z') return true;
	    if (char1 >= '0' && char1 <= '9') return true;
	    
		return false;
	}
	
	// 1b) Valid Prefic Character ( input character in args 0 )
	
	public static boolean isValidPrefixChar (char char2) {
		// if (char2 >= 'a' && char2 <= 'z') return true;
	    // if (char2 >= 'A' && char2 <= 'Z') return true;
	    // if (char2 >= '0' && char2 <= '9') return true;
		if (isAlphaNumeric(char2)) return true;
	    if (char2 == '_') return true;
	    if (char2 == '-') return true;
	    if (char2 == '.') return true;
	    return false;
	}
	
	// 1b) Valid Domain Character  ( input character in args 0 )
	
	public static boolean isValidDomainChar (char char3) {
		if (char3 >= 'a' && char3 <= 'z') return true;
	    if (char3 >= 'A' && char3 <= 'Z') return true;
	    if (char3 >= '0' && char3 <= '9') return true;
	    if (char3 == '-') return true;
	    if (char3 == '.') return true;
	    return false;
	}
	
	
	
	// 1c) Exactly One '@'

	public static boolean exactlyOneAt (String email) {
	int countAt = 0;

	for(int i=0;i<email.length();i++) {
	if(email.charAt(i)=='@') {
	countAt++;
	}
	}

	return countAt==1;
	}

	
	// 1d) Method to get Prefix 
	
	public static String getPrefix(String email) { // tim@mail.com
	String prefix ="";

	for(int i=0;i<email.length();i++) {
	if(email.charAt(i)=='@') {
	break;
	}
	prefix= prefix + email.charAt(i);// prefix "tim"
	}

	return prefix;
	}
	
	
	// NOTE from here forward I was unable to follow and implement the proper methods. 
	// I did at the verly least name them correctly and made sure my program would complile. 
	
	// I spent a lot of time trying to figure out what I'm missing and was unable. 
	// I will take advantage of the break next week to review all materials and try to get caught up.
	// If there is any information that would help me it would be greatly appreciate. 
	
	
	
	// 1e) Method to get Domain 
	
	
	public static String getDomain(String email) { // tim@mail.com
		String domain ="";

		for(int i=0;i<email.length();i++) {
		if(email.charAt(i)=='@') {
		continue;
		}
		domain= domain + email.charAt(i);
		}
		return domain;				
		}
	
	// 1f) Method to check if Valid Prefix
	
	
	public static String isValidPrefix(String email) {
		
		String vPrefix ="";
		
		for(int i=0;i<email.length();i++) {
			if(email.charAt(i)=='@') {
			break;
			}
			vPrefix= vPrefix + email.charAt(i); // domain "mail.com"
			}

			return vPrefix;
			}
		
	// 1f) Method to check if Valid Domain 
	
	public static String isValidDomain(String email) {
		
		String vDomain ="";
		
		for(int i=0;i<email.length();i++) {
			if(email.charAt(i)=='@') {
			break;
			}
			vDomain= vDomain + email.charAt(i); // domain "mail.com"
			}

			return vDomain;
			}
	
		
	 // Method to check if is Valid Email 
	
	// 
	
	public static String isValidEmail(String email) {
		
		String vEmail ="";
		
		for(int i=0;i<email.length();i++) {
			if(email.charAt(i)=='@') {
			break;
			}
			vEmail= vEmail + email.charAt(i); // domain "mail.com"
			}

			return vEmail;
			}
		
	}
