package module_9;

public class MyStack {
    private int size;
    private int top;
    private int [] stackArray;

    public MyStack(int s){
        size = s;
        stackArray = new int[size];
        top = -1;
    }
    public boolean isEmpty(){
        return top == -1;
    }

    public void push(int element){
        stackArray[++top] = element;
    }

    public int pop(){
        if(isEmpty()){
            return 0;
        }
        else{
            return stackArray[top--];
        }
    }

    public int peek(){
        if(isEmpty()){
            return 0;
        }
        else{
            return stackArray[top];
        }
    }
    public int size(){
        return size;
    }

    public void clear(){
        int[] array = new int[0];
        stackArray = array;
        size = 0;
    }
}
