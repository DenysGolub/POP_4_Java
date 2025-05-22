import java.util.concurrent.Semaphore;

public class Waiter {
    private final Semaphore waiter;

    public Waiter(int numWaiters) {
        waiter = new Semaphore(numWaiters);
    }

    public void getWaitersAttention() throws InterruptedException {
        waiter.acquire();
    }

    public void releaseWaitersAttention() {
        waiter.release();
    }
}

