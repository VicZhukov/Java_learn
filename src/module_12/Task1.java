package module_12;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 1; i <= 20; i++) {
            System.out.println(i + " ?????? ? ??????? ?????? ????????.");
            if(i % 5 == 0) {
                new Thread(() -> System.out.println("?????? 5 ??????!")).start();
            }
            Thread.sleep(1000);
        }
    }
}