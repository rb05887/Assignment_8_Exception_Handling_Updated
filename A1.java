package test;

public class A1 {
	public static void main(String[] args) {	
		class NoMatchException extends Exception {
		    public NoMatchException() {
		        super("String does not match 'India'");
		    }
		}
		        try {
		            String inputString = "Delhi"; 
		            if (!inputString.equals("India")) {
		                throw new NoMatchException();
		            } else {
		                System.out.println("String matches 'India'");
		            }
		        } catch (NoMatchException e) {
		            System.err.println("Error: " + e.getMessage());
		        }
		    }
        }
