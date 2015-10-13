package com.leepengg;

import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;

import static org.quartz.CronScheduleBuilder.cronSchedule;
import static org.quartz.DateBuilder.evenMinuteDate;
import static org.quartz.JobBuilder.newJob;
import static org.quartz.TriggerBuilder.newTrigger;

/**
 * Created by peng on 5/22/15.
 */

public class TestQuartz {
    public static final Logger LOG = LoggerFactory.getLogger(TestQuartz.class);

    public static void main(String[] argv) throws SchedulerException, InterruptedException {
        SchedulerFactory sf = new StdSchedulerFactory();
        Scheduler sched = sf.getScheduler();

        JobDetail job = newJob(HelloJob.class)
                .withIdentity("job1", "group1")
                .build();

        // compute a time that is on the next round minute
        Date runTime = evenMinuteDate(new Date());
        // Trigger the job to run on the next round minute
        CronTrigger trigger = newTrigger()
                .withIdentity("trigger1", "group1")
                .withSchedule(cronSchedule("0/20 * * * * ?"))
                .build();

        sched.scheduleJob(job, trigger);

        sched.start();

        Thread.sleep(900L * 1000L);

        sched.shutdown(true);
    }

}
