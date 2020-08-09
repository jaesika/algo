package Day01;

import java.util.ArrayList;

/*
 * Stack - push, pop 간단 구현
 *  */
class Stack1<T> {
    private ArrayList<T> al = new ArrayList<>();

    public void push(T t) {
        al.add(t);
    }

    public T pop() {
        if(al.size()-1 < 0) {
            return null;
        }
        return al.remove(al.size()-1);
    }

    public void printStack() {
        System.out.println(al);
    }
}

public class StackAlgorithm {

    public static void main(String[] args) {
        Stack1<Integer> stack1 = new Stack1<>();

        stack1.push(3);
        stack1.push(1);
        stack1.push(9);
        stack1.push(6);

        stack1.printStack();
        for(int i=0; i<4; i++) {
            System.out.println("추출 : " + stack1.pop());
            stack1.printStack();
        }

    }

}
