package myImpl;

import java.util.Collections;

public class Main {
    
    

    public static void main(String[] args) {
        StackTad<Double> s = new StackImpl<>(10, Double.class);
        s.push(10.0);    
        s.push(20.0);
        s.push(40.0);
        System.out.println(s.lastIndex());
        System.out.println(s.pop());
        System.out.println(s);
        System.out.println(s.lastIndex());

        


        StackImpl<TestClass> s2 = new StackImpl<>(10, TestClass.class );
        s2.push(new TestClass("tiago", 22));
        s2.push(new TestClass("fulano", 72));
        s2.push(new TestClass("ciclano", 45));
        System.out.println("======================Test IN Class======================");
        System.out.println(s2.lastIndex()); //expected 2
        
       s2.clear();
        System.out.println(s2);
         //expected 1


    
    }
}
