package customer;



import dbhandler.DataFetcher;

public class Validator {

	public static boolean isValid(String uname, String pass) {
			String dbPass=DataFetcher.fetchPassword(uname);
			if(pass.equals(dbPass)) {
				return true;
			}
			else {
				return false;
			}
	}
}