package Practice;

public class Voter {
      
	static void validate(int age)throws InvalidAgeException{
		if(age<18)
			throw new InvalidAgeException("Not a valid age");
		else
			System.out.println("Welcome voter");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    try {
    	validate(20);
    }
    catch(Exception m)
    {
    	System.out.println("Exception occured:"+m);
    }
	}
}
	
	class InvalidAgeException extends Exception{
		String str;
		InvalidAgeException(String s){
			this.str=s;
		}
		@Override
		public String toString() {
			return str;
		}
	}

