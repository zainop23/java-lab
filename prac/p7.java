public class p7 {
    int in=0, out=0, count=0;
    int[] buf = new int[5];
    synchronized void put(int n) throws InterruptedException{
        if(buf.length==count) wait();
        buf[in]=n;
        in = (in+1)%buf.length;
        System.out.println("Produced: "+n);
        notifyAll();
    }

    synchronized void get() throws InterruptedException{
        if(buf.length==0) wait();
        int n = buf[out];
        out = (out+1)%buf.length;
        System.out.println("Consumed: "+ n);
        notifyAll();
    }

    public static void main(String[] args) {
        p7 pc = new p7();
        new Thread(()->{
            try {
                for(int i=1; i<=10; i++){
                    pc.put(i);
                    Thread.sleep(500);
                }
            } catch (InterruptedException ignored) {}
        }).start();

        new Thread(()->{
            try {
                while (true) { 
                    pc.get();
                    Thread.sleep(1000);
                }
            } catch (InterruptedException ignored) {}
        }).start();
    }
}
