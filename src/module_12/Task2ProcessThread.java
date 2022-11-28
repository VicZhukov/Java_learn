package module_12;

import java.util.concurrent.atomic.AtomicBoolean;

public class Task2ProcessThread extends Thread{
    private int number;
    private AtomicBoolean processed = new AtomicBoolean(true);
    private Task2NumberProcessor processor;

    public Task2ProcessThread(Task2NumberProcessor processor){
        this.processor = processor;
    }

    public void process(int number){
        this.number = number;
        processed.set(false);
    }

    public boolean isProcessed(){
        return processed.get();
    }

    @Override
    public void run() {
        while(true){
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if(processed.get()){
                continue;
            }
            processor.process(number);

            processed.set(true);
        }
    }
}
