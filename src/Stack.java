public class Stack {
    private int index = 0;
    private final int[] content = new int[10];

    private boolean isEmpty(){
        //encapsulation using private keyword and use inside same class
        return  index ==0;
    }
    private boolean isFull(){
        return index > 9;
    }

     boolean push(int i){
        if(isFull()){
            return  false;
        }else{
            content[index++] = i;
            return  true;
        }
    }
     int pop(){
        if(isEmpty()){
            return -1;
        }else{
            return  content[--index];
        }
    }
     int popWithIndex(int index){
        if(index >= content.length)  return  -1;
        return content[index];
    }
}
