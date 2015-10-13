package com.leepengg;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by peng on 5/21/15.
 */
public class TestTimeTask extends TimerTask {
    public static final Logger LOG = LoggerFactory.getLogger(TestTimeTask.class);

    /**
     * The action to be performed by this timer task.
     */
    static int i = 0;

    @Override
    public void run() {
        System.out.println("I am in timer! " + i++ + ": time: " + new Date().toString());
    }

    public static void main(String[] argv) {
        Timer timer = new Timer();
        TimerTask timerTask = (new TestTimeTask());

        timer.scheduleAtFixedRate(timerTask, getTime(), 5 * 60 * 1000);
        //timer.scheduleAtFixedRate(timerTask, getTime(), 1 * 60 * 1000);

        /*
        ScheduledExecutorService service = Executors
                .newSingleThreadScheduledExecutor();
        service.scheduleAtFixedRate(new LicaibaoIncomeTriggerService(conf), 0, 3, TimeUnit.MINUTES);
        */
    }

    public static Date getTime() {
        Calendar calendar = Calendar.getInstance();
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(day);
        calendar.set(Calendar.HOUR_OF_DAY, 11);
        calendar.set(Calendar.MINUTE, 42);
        calendar.set(Calendar.SECOND, 00);
        Date time = calendar.getTime();

        if (time.before(new Date())) {
            time = addDay(time, 1);
        }
        return time;
    }

    // 增加或减少天数
    public static Date addDay(Date date, int num) {
        Calendar startDT = Calendar.getInstance();
        startDT.setTime(date);
        startDT.add(Calendar.DAY_OF_MONTH, num);
        return startDT.getTime();
    }

}
