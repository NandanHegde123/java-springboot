class Example {
    static void staticMethod() {
        System.out.println("Static method.");
    }

    void instanceMethod() {
        System.out.println("Instance method.");
    }
}

public class Main {
    public static void main(String[] args) {
        Example obj = new Example();
        
        obj.instanceMethod();  // ✅ Correct way to call an instance method
        

        Example.staticMethod();  // ✅ Best practice
    }
}
