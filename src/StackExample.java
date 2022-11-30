import java.util.Stack;

class StackExample {
    public static void main(String[] args) {

        // create an object of Stack class
        Stack<String> animals= new Stack<>();

        // push elements to top of stack
        animals.push("Java");
        animals.push("C++");
        animals.push("Python");
        System.out.println("Stack: " + animals);

        // pop element from top of stack
        animals.pop();
        System.out.println("Stack after pop: " + animals);
    }
}