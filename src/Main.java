
public class Main {
    public static void main(String[] args) {
        Stack s= new Stack();
        int num = 1;

        while (s.push(num)){
            System.out.println("Added number is "+num);
            num++;
        }

        //view all items inside stack
        while(s.pop() != -1){
            System.out.println("Popped num is "+s.pop());
        }
        System.out.println(s.popWithIndex(7));
    }
}