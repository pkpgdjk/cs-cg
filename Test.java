
import java.util.function.Function;

public class Test {
    static void exampleMethod(Function<String, String> f) {
        System.out.println(f.apply("this form example"));
    }


    

    // Method to pass
    static String sayHello(String tt) {
        return "this form sayHello : " + tt;
    }

    public static void main(String[] args) {
        exampleMethod(Test::sayHello);  // prints "Hello"
    }
}