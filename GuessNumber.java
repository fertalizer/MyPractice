import java.util.Scanner;

public class GuessNumber {

	public static void main(String[] args) {

		System.out.println("This is a program for number guessing.");
		Scanner input = new Scanner(System.in);
		
		int num = (int)(Math.random() * 100);
			
        int a = 0;   //lower limit
        int b = 99;  //upper limit
        
        System.out.println("Please input a number.(From " + a + " to " + b + ")");
        int x = input.nextInt();
        
        //System.out.println(num);  //for debug
        
        while(x < a || x > b ) {
        	
        	System.out.println("Input value is not in range. Please input again.(From " + a + " to " + b + ")");
        	x = input.nextInt();
        	
        	}
        //A(0).
        
        while( x != num ) {   	        	           
        	     	
        	if(x < num)
        		
        		a = x + 1;
        	
        	else if(x > num)
        		
        		b = x - 1; 	
        	//To change range.
        
        	if (b == a) {
        		
        		System.out.println("You lose! The answer is " + num + ".");
        		break;
        		
        	}
        	// Loss condition.
        	
        	
        	System.out.println("Please input again.(From " + a + " to " + b + ")");
        	x = input.nextInt();   
        	
        	while(x < a || x > b ) {
            	
            	System.out.println("Input value is not in range. Please input again.(From " + a + " to " + b + ")");
            	x = input.nextInt();
            	
            	}
        		//To  check whether if the input value is in range.
        	        	
        }
        //A(n) loop. 
        
        
        if (x == num) {  	
        	
        	System.out.println("Congratulatins! You win.");
        	
        }
        // Win condition.
        
        input.close();		
			
	}

}
