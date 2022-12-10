package hillel;

import java.time.Duration;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

        LocalDateTime start = LocalDateTime.now();
        System.out.println("Start time: " + start);
        ValueCalculator thread = new ValueCalculator("My thread");
        thread.start();

        MyRunnable myRunnable = new MyRunnable("My thread2");
        Thread thread2 = new Thread(myRunnable);
        thread2.start();

        LocalDateTime end = LocalDateTime.now();
        System.out.println("End time: " + end);
        System.out.println("Execution time: " + Duration.between(start, end).toMillis());





    }
}
