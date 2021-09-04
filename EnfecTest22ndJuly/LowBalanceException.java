package Test22ndJuly;

public class LowBalanceException extends RuntimeException
{
    LowBalanceException(String msg)
    {
        super(msg);
    }   
}
