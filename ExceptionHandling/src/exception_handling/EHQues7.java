package exception_handling;

class InvalidCountryException extends Exception{
	public InvalidCountryException(String msg) {
		super(msg);
	}
}

public class EHQues7 {
	
	public void registerUser(String userName,String userCountry) throws InvalidCountryException {
		if(!userCountry.equalsIgnoreCase("India")) {
			throw new InvalidCountryException("User Outside India cannot be registered");
		}else {
			System.out.println("User registration done successfully");
		}
	}

	public static void main(String[] args) {
		
		EHQues7 ur=new EHQues7();
		try {
			ur.registerUser("Rupa","india");
		}
		catch(InvalidCountryException e){
			System.out.println("InvalidCountryException: "+e.getMessage());
		}

		try {
			ur.registerUser("Nandini","us");
		}
		catch(InvalidCountryException e){
			System.out.println("InvalidCountryException: "+e.getMessage());
		}
	}

}