package ExceptionHandlingExamples;

public class UserException extends Exception{
	UserException(String str)
	{
		super(str);
	}
	public static void main(String[] args)
	{
		UserDefinedException userexception = new UserDefinedException();
		userexception.userDefinedExceptions();
	}

}
