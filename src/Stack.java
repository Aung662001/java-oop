public class Stack {
    private int index = 0;
    private final int[] content = new int[10];

    boolean isEmpty(){
        return  index ==0;
    }
    boolean isFull(){
        return index > 9;
    }

    void push(int i){
        content[index++] = i;
    }
    int pop(){
        return  content[--index];
    }
    int popWithIndex(int index){
        return content[index];
    }
}
