package myImpl;

import java.math.BigDecimal;
import java.util.Random;


/*
*
*@Author Tiago Fernandes Avila
*/

public class StackImpl<T> implements StackTad<T> {

    public StackImpl(int tamanho, Class<T> type) {
        this.tamanho = tamanho;
        this.type = type;
        this.topo = 0;
        stack = (T[]) new Object[this.tamanho];
    }

    private T[] stack;
    private int topo;
    private int tamanho;
    private Class<T> type;

    @Override
    public void push(T elemento) { //depois implementar a logica para aumentar a lista
        if (isFull()) {
            throw new RuntimeException("Stack Full!");
        } else {
            stack[topo] = elemento;
            this.topo++;
        }

    }

    @Override
    public T pop() { // return null if stack isEmpty

        if (!isEmpty()) {

            T aux = (T) stack[lastIndex()];
            stack[lastIndex()] = null;
            this.topo--;
            return aux;

        } else {
            throw new RuntimeException("Stack Empty!");
        }

    }

    @Override
    public boolean isEmpty() {
        return lastIndex() == -1;
    }

    @Override
    public int lastIndex() {
        return topo - 1;
    }

    @Override
    public void clear() {
        while (!this.isEmpty()) {
            this.pop();
        }
    }

    public boolean isFull() {
        return this.topo == this.tamanho; 
    }

  public void fillStack() {
        if (type != Integer.class) {
            throw new UnsupportedOperationException(
                "fillStack() só é suportado para pilhas de Integer"
            );
        }

        Random random = new Random();
        while (!isFull()) {
            Integer value = random.nextInt(100);
           
            
            push(type.cast(value));
        }
    }


    @Override
    public String toString() {
        if (isEmpty()) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < lastIndex(); i++) {
            if (stack[i] != null) {
                sb.append(stack[i] + ", ");
            }
        }
        sb.append(stack[lastIndex()] + "]");

        return sb.toString();
    }

}
