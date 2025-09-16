package myImpl;
public interface StackTad<T>{
    void push(T elemento);
    T pop();
    int lastIndex();
    boolean isEmpty();

}