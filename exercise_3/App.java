// Array implementation of Stack
public class App {
    public static void main(String[] args) {
  
      // Create new Stack Object
      Stack tshirt_stack = new Stack(5);
  
      // Insert new elements into the stack
      tshirt_stack.push("Pink Shirt");
      tshirt_stack.push("Orange Shirt");
      tshirt_stack.push("Black Shirt");
      tshirt_stack.push("White Shirt");
  
      // Show the size of the stack
      System.out.println("The size of the stack is: " + tshirt_stack.size());
  
      // Show top element in the stack
      System.out.println("The top of the stack is: " + tshirt_stack.peek());
  
      // Remove top element in the stack
      tshirt_stack.pop();
  
      System.out.println("After pop");
  
      // Show all elements in Stack
      tshirt_stack.printStack();
  
      // Show top element in the stack
      System.out.println("The top of the stack is: " + tshirt_stack.peek());
    }
  }