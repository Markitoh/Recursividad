package marco;

//import mk.Recursividad;

public class Recursividad {


			public void print(int x, int stop) {
				System.out.println(x);	
				if (x < stop) {
					print(x+1, stop);
				}
			}
			
		    
		    	public static void main(String [] arg) {
		    	Recursividad uno = new Recursividad();
		       
		    	uno.print(1, 100); 

		  
			
			
		    	}
			
		}

	

