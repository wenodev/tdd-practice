package test.pc;

import main.pc.Consumer;
import main.pc.Producer;
import org.junit.Before;
import org.junit.Test;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ProducerConsumerExample {

    int numProducers;
    int numConsumers;

    @Before
    public void setUp(){
        numProducers = 4;
        numConsumers = 3;
    }

    @Test
    public void testProducerConsumer() throws InterruptedException {

        BlockingQueue<Object> myQueue = new LinkedBlockingQueue<>(20);

        for (int i = 0; i < numProducers; i++){
            new Thread(new Producer(myQueue)).start();
        }

        for (int i = 0; i < numConsumers; i++){
            new Thread(new Consumer(myQueue)).start();
        }

        // Let the simulation run for, say, 10 seconds
        Thread.sleep(10 * 1000);

        // End of simulation - shut down gracefully
        System.exit(0);

    }



}
