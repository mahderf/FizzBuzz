package fizzbuzz;

public class Fizzbuzz {
// prints Fizz for multiples of 3
	// prints Buzz for multiples of 5
	// prints FizzBuzz for multiples of 3 & 5
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int x=1;x<=100; x++) 
			
{
			
      
      if(x%3==0 && x%5==0)  // checks each value of x for a module number 0 when divided by 3 &5
	
	  {
		System.out.println("FizzBuzz");
		//System.out.println(x+ "is a division of 3 & 5");
	  }
	
      else if (x%3==0) // checks each value of x for a module number 0 when divided by 3
      {
    	  System.out.println("Fizz");
    	  //System.out.println(x + "is a division of 3");
      }
      else if(x%5==0) // checks each value of x for a module number 0 when divided by 5
      {
    	  System.out.println("buzz");
      }
	  else
	   {
		System.out.println(x);
	   }
      
}
}
}
