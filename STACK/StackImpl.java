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
            topo++;
            stack[topo] = elemento;
            topo++;
        } else {
            stack[topo] = elemento;
            topo++;
        }

    }

    @Override
    public T pop() {
        return null;
    }

    public boolean isEmpty() {
        return topo == -1;
    }

    public int lastIndex() {
        if (isEmpty()) {
            return -1;
        }
        return topo -1;
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
