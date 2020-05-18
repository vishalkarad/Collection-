public class StackPrograming {

    int MAXSIZE = 8;
    static int stack[] = new int[8];
    int top = -1;

    public int peek() {
        return stack[top];
    }

    public boolean isfull() {
        if (top == MAXSIZE)
            return true;
        else
            return false;
    }

    public boolean isempty() {
        if (top == -1)
            return true;
        else
            return false;
    }

    public void push(int data) {
        if (!isfull()) {
            top = top + 1;
            stack[top] = data;
        } else {
            System.out.println("Could not insert data, Stack is full.\n");
        }
    }

    public int pop() {
        int data;
        if (!isempty()) {
            data = stack[top];
            top = top - 1;
            return data;
        } else {
            System.out.println(" Stack is empty");
            return 0;
        }
    }

    public static void main(String[] args) {
        StackPrograming stackProgram = new StackPrograming();

        // Push stack
        stackProgram.push(10);
        stackProgram.push(20);
        stackProgram.push(50);
        stackProgram.push(90);
        stackProgram.push(101);

        // Print stack
        for (int stack1 : stack) {
            System.out.print(stack1 + ", ");
        }

        // Pop stack
        stackProgram.pop();
        for (int stack1 : stack) {
            System.out.print(stack1 + ", ");
        }
    }
}
