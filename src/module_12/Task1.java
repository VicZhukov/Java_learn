package module_12;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 1; i <= 20; i++) {
            System.out.println(i + " секунд з початку роботи програми.");
            if(i % 5 == 0) {
                new Thread(() -> {
                    System.out.println("ћинуло 5 секунд.");
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }).start();
            }
            Thread.sleep(1000);

        }
    }
}