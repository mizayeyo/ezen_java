package com.mycompany.ch04;

public class For3 {

	public static void main(String[] args) {
		
		
		
		 for (int i = 0; i < 5; i++) { //i가 5보다 작을때 1씩 증가 0,1,2,3,4, 총 5번
	           
	            for (int j = 0; j < 10; j++) { // j가 10보다 작을때까지 1씩증가 총10번
	                System.out.print("*"); // 별출력
	            }
    	            System.out.println(); // 줄바꿈
	        }
		 
		 			System.out.println("-------------------------");
		 			
		 for(int i=0; i<10; i++) {
			 System.out.print("*");
			 }
		 	System.out.println();
		
		 for(int j=0; j<=2; j++) {
			     String sum="        ";
				 System.out.println("*"+sum+"*");
			 }
		 
		 for(int i=0; i<10; i++) {
			 System.out.print("*");
			 }
		 	System.out.println("");
		 	System.out.println("-------------------------");
		 	
		 
	
	    for(int i=1; i<=9; i++) {
	    	for(int j=1; j<=i; j++) {
	    		System.out.print(j);
	    	}
	    		System.out.println();
	    }
	    
	    for(int i=1; i<=9; i++) {
	    	if(i%2==1) {
	    		int sum = i;
	    		System.out.print(sum + " ");
	    		
	    	}
	    }
	}
}
