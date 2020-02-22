package lab2;

public interface Stack<T>
{
    public void push(T x);
    public void pop();
    public boolean isEmpty();
    public T top();
}
