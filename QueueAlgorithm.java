package Day01;

import java.util.ArrayList;

/*
 * Queue - push, pop 간단 구현
 * */

class Queue1<T> {
    private ArrayList<T> al = new ArrayList<>();

    public void push(T t) {
        al.add(t);
    }

    public T pop() {
        if(al.size()-1 < 0) {
            return null;
        }

        return al.remove(0);
    }

    public void printQueue() {
        System.out.println(al);
    }
}

public class QueueAlgorithm {

    public static void main(String[] args) {
        Queue1<Integer> queue1 = new Queue1<>();

        queue1.push(1);
        queue1.push(4);
        queue1.push(5);
        queue1.push(2);

        queue1.printQueue();
        for(int i=0; i<4; i++) {
            System.out.println("추출 : " + queue1.pop());
            queue1.printQueue();
        }

    }

}
