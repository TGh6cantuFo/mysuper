package com.st.scheduled;


import com.st.util.SpringContextUtil;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Created by sxm on 2016/10/14.
 */
@Component
@Configurable
@EnableScheduling
public class ScheduledTask {

    //@Scheduled(cron = "0 0/1 * * * ?")
    public void reportCurrentTime() {
        JobLauncher launcher = SpringContextUtil.getBean(JobLauncher.class);
        Job importUserJob = SpringContextUtil.getBean("MFJob");
        JobParameters jobParameters = new JobParametersBuilder()
                .addDate("date", new Date()).toJobParameters();
        try {
            launcher.run(importUserJob, jobParameters);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}