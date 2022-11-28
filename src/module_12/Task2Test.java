package module_12;

import java.util.ArrayList;
import java.util.List;

public class Task2Test {
    public static void main(String[] args) {
        Task2ProcessThread fizzbuzz = new Task2ProcessThread((n) -> {
            if(n % 15 == 0){
                System.out.println("FizzBuzz");
            }
        });

        Task2ProcessThread fizz = new Task2ProcessThread((n) -> {
            if(n % 3 == 0){
                System.out.println("Fizz");
            }
        });

        Task2ProcessThread buzz = new Task2ProcessThread((n) -> {
            if(n % 5 == 0){
                System.out.println("Buzz");
            }
        });

        Task2ProcessThread number = new Task2ProcessThread((n) -> {
            if(n % 3 != 0 && n % 5 != 0){
                System.out.println(n);
            }
        });

        List<Task2ProcessThread> result = new ArrayList<>();
        result.add(fizzbuzz);
        result.add(fizz);
        result.add(buzz);
        result.add(number);

        for(Task2ProcessThread thread : result){
            thread.start();
        }

        for (int i = 1; i < 50; i++) {
            for (Task2ProcessThread thread : result) {
                thread.process(i);
            }
            while(true){
                int processedCount = 0;
                for (Task2ProcessThread thread : result) {
                    if(thread.isProcessed()){
                        processedCount++;
                    }
                }
                if(processedCount == result.size()){
                    break;
                }
            }
        }
    }
}
