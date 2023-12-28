package throw_exceptionhandling;

public class UnderAgeException extends RuntimeException {
	UnderAgeException(String msg)
	{
		super(msg);
	}

}
