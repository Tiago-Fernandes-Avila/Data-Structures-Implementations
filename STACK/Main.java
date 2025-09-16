
public class Main {
    
    

    public static void main(String[] args) {
        StackImpl<Integer> s = new StackImpl<>(10);
        s.push(10);    
        s.push(20);
        s.push(40);
        System.out.println(s.lastIndex());

        System.out.println(s);

    }
}
