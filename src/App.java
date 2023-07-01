import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

public class App {
    public static void main(String[] args) throws Exception {
        
        
       // System.out.println("Task started....");

        Timer timer = new Timer();

        TimerTask task = new TimerTask(){

            int counter = 10;
            @Override
            public void run() {
                if (counter > 0) {
                    System.out.println(counter + " seconds");
                    counter--;
                } else {
                    System.out.println("Suprise!");
                    timer.cancel();
                }
            }   
        };

        Calendar date = Calendar.getInstance();
        date.set(Calendar.YEAR, 2023);
        date.set(Calendar.MONTH, Calendar.JULY);
        date.set(Calendar.DAY_OF_MONTH, 1);
        date.set(Calendar.HOUR_OF_DAY, 12);
        date.set(Calendar.MINUTE, 12);
        date.set(Calendar.SECOND, 50);

        //timer.schedule(task, 3000);
       // timer.schedule(task,date.getTime());
    //    timer.scheduleAtFixedRate(task, 0, 1000);
    timer.scheduleAtFixedRate(task, date.getTime(), 1000);

    }
}
