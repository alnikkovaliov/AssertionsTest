package by.epam.assertionstest.main;

public class Runner {

    	 public void foo() 
    	    {
    	        assert false; 
    	        assert false; 
    	    } 
    	    public void bar()
    	    {
    	        while(true)
    	        {
    	            assert false; 
    	            break; 
    	        } 
    	        assert false;  
    	    } 
 

	public static void main(String[] args) {
		
		        int x = 1;  
		        assert (x > 0) : "assertion failed"; /* Line 6 */
		        
		        System.out.println("finished"); 
		
	}

}
