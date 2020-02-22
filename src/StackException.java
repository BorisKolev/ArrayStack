package lab2;

class StackException extends RuntimeException
{
    StackException(String s)
    {
        super("tried to apply " + s + " to an empty stack");
    }
}
