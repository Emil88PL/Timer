import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

public class App {
    public static void main(String[] args) throws Exception {
        
        
        System.out.println("Task started....");

        Timer timer = new Timer();

        TimerTask task = new TimerTask(){

            @Override
            public void run() {
                System.out.println("Count down completed!!!!");
            }   
        };

        Calendar date = Calendar.getInstance();
        date.set(Calendar.YEAR, 2023);
        date.set(Calendar.MONTH, Calendar.JULY);
        date.set(Calendar.DAY_OF_MONTH, 1);
        date.set(Calendar.HOUR_OF_DAY, 12);
        date.set(Calendar.MINUTE, 2);
        date.set(Calendar.SECOND, 0);


        //timer.schedule(task, 3000);
        timer.schedule(task,date.getTime());

    }
}
