// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Stack s= new Stack();
        int num = 1;

        while (!s.isFull()){
            s.push(num);
            System.out.println("Added number is "+num);
            num++;
        }

        //view all items inside stack
        while(!s.isEmpty()){
            System.out.println("Popped num is "+s.pop());
        }
    }
}