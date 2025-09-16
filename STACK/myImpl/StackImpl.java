package myImpl;

import java.util.Iterator;

import javax.management.RuntimeErrorException;

public class StackImpl<T> implements StackTad<T> {

    public StackImpl(int tamanho) {
        this.tamanho = tamanho;
        stack = (T[]) new Object[this.tamanho];
    }

    private T[] stack;
    private int topo;
    private int tamanho;

    @Override
    public void push(T elemento) {
        if (isEmpty()) {
            this.topo++;
            stack[topo] = elemento;
            topo++;
        } else {
            stack[topo] = elemento;
            this.topo++;
        }

    }

    @Override
    public T  pop() { //return null if stack isEmpty
        
        if (!isEmpty()){
            
            T aux = (T) stack[lastIndex()];
            stack[lastIndex()] = null;
            this.topo--;
            return aux;

        } else {
            throw new RuntimeException("Stack Empty!");  
        }
        
    }

    public boolean isEmpty() {
        return lastIndex() == -1;
    }

    public int lastIndex() {
        return topo - 1;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        if (lastIndex() == -1) {
            return "[]";
        }

        for (int i = 0; i < lastIndex(); i++) {
            if (stack[i] != null) {
                sb.append(stack[i] + ", ");
            }
        }
        
        sb.append(stack[lastIndex()] + "]");

        return sb.toString();
    }

    
}
