import codSursa.curs11CodSursa.QueueFifo;
import org.junit.Assert;
import org.junit.Test;

public class TestQueueFifo {
    @Test
    public void testEnQueue(){
        QueueFifo queueFifo=new QueueFifo(3);
        queueFifo.enQueue(1);
        queueFifo.enQueue(2);
        queueFifo.enQueue(3);
        int[] actual= queueFifo.getQueue();
        int[] expected = {1,2,3};
        Assert.assertArrayEquals(expected,actual);
    }
    @Test
    public void testDeQueue(){
        QueueFifo queueFifo=new QueueFifo(3);
        queueFifo.enQueue(1);
        queueFifo.enQueue(2);
        queueFifo.enQueue(3);
        queueFifo.deQueue();
        int[] actual= queueFifo.getQueue();
        int[] expected = {2,3,0};
        Assert.assertArrayEquals(expected,actual);
    }

    @Test
    public void testToString(){
        QueueFifo queueFifo=new QueueFifo(3);
        queueFifo.enQueue(1);
        queueFifo.enQueue(2);
        queueFifo.enQueue(3);
        String actual = queueFifo.toString();
        String expected = "[ 1 2 3 ]";
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testIsEmpty(){
        QueueFifo queueFifo=new QueueFifo(3);
        Assert.assertTrue(queueFifo.isEmpty());
    }
}
