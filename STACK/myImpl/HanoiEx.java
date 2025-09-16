package myImpl;

public class HanoiEx {

    

    public static void main(String[] args) {
    StackTad<Integer> test = new StackImpl<>(50, Integer.class);    
        test.fillStack();    
    System.out.println(test);
    }
 
    
}
