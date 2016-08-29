import java.time.Duration;
import java.time.Period;

import static java.time.temporal.ChronoUnit.SECONDS;

public class ElapsedTime {


    public static void main(String[] args) {
//        int i = Integer.parseInt(args[0]);
        int i = 9999;
        Duration time = Duration.of(i, SECONDS);
        Period from = Period.from(time);
        System.out.println(from);


//        System.out.println("This corresponds to: %d hours, %m minutes and %d seconds.",
//                time.getUnits());
    }


}
