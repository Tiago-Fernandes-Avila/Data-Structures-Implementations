package myImpl;

/*
*
*@Author Tiago Fernandes Avila
*/
public interface StackTad<T>{
    void push(T elemento);
    T pop();
    int lastIndex();
    boolean isEmpty();
    void clear();
    void fillStack();
    boolean isFull();

}