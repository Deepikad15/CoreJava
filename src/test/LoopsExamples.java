package test;

public class LoopsExamples {
	
	public static void main(String[] args) {
		
		int num1 =1;
		
		while(num1<=10) {
			
			if(num1==5) {
				
				num1 = num1+1;
			continue;
			}
			
			
	System.out.println(num1);
	
	
	num1=num1+1;
	
	
	//For loop
	
	for(int count=1;count<=10;count++) {
		
		if(count==5) {
			
		break;
		}
		
		System.out.println("Inside for loop " + count);
	}
}

}
	
}
