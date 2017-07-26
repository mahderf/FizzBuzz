package fizzbuzz;

public class Fizzbuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int x=1;x<=100; x++)
			
{
				
      
      if(x%3==0 && x%5==0)
	
	  {
		System.out.println("FizzBuzz");
		//System.out.println(x+ "is a division of 3 & 5");
	  }
	
      else if (x%3==0)
      {
    	  System.out.println("Fizz");
    	  //System.out.println(x + "is a division of 3");
      }
      else if(x%5==0)
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
