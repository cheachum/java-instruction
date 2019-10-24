
public class ElseSwitchApp {

	public static void main(String[] args) {
		int a = 5;
        int b = 10;
        
        String str = "abc";
        
        if (a < 3) {
            System.out.println("a less than 3");            
        }
        else if (a < 10) {
            System.out.println("a less than 10");
            
        }
        else {
            System.out.println("a is 10 or greater");
        }
        
        
        if ((a < 10) && (b==10)) {
        	System.out.println("Hello");
        }
        
        if ((a>10) || (b<20)) {
        	System.out.println("woohoo");
        	
        }
        
        if (a < 10) {
        	if (b<10) {
        		System.out.println("b less than 10");
        	}
        }
        else {
        	System.out.println("b greater than 10 or equal to 10");
        	
        	
        }
            
        
		// switch statement demo
		switch (a) { 
		case 1: 
			System.out.println( "a is 1");
			break;
		case 2: 
			System.out.println( "a is 2");
			break;
		case 3: 
			System.out.println( "a is 3");
			break;
		case 4:  
			System.out.println( "a is 4");
			break;
		case 5: 
			System.out.println( "a is 5");
			break;
		default: 
			
			
		}
		}
		}
		


