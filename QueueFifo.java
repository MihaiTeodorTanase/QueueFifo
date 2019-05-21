package codSursa.curs11CodSursa;

import java.util.Arrays;

public class QueueFifo {
    //Queue de tip FIFO ( primu venit primu servit ) -> bagam 1 -> 1 ; bagam 2 -> 2 1 ;
    // bagam 3 -> 3 2 1 unde 3 e pe poz 1, 2 pe poz 2 ,1 pe poz 3
    int[] queue;
    int front;
    int back;

    public QueueFifo(int capacity) {
        front = 0;
        back = 0;
        queue = new int[capacity];
    }

    public int[] getQueue() {
        return queue;
    }

    public int[] enQueue(int element) {
        if (back < queue.length) {
            queue[back] = element;
            back++;
        }
        return queue;
    }

    public int[] deQueue() {
        if(back>0){
        queue[front] = 0;
        int j = front;
        for (int i = front + 1; i < back; i++) {
            queue[j] = queue[i];
            j++;
        }
        queue[back - 1] = 0;
        back--;}
        return queue;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < queue.length; i++) {
            if (i == 0) {
                sb.append("[ ");
            }
            sb.append(queue[i]);
            sb.append(" ");
            if (i == queue.length - 1) {
                sb.append("]");
            }
        }
        return sb.toString();
    }

    public boolean isEmpty() {
        return queue[front]==0;
    }
}
