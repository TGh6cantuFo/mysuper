package com.st.batch.job;

import com.st.batch.listener.JobCompletionNotificationListener;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;

@Configuration
@EnableBatchProcessing
public class JobConf {

    @Autowired
    public JobBuilderFactory jobBuilderFactory;

    @Resource
    public Step memberInfoStep;

    @Resource
    public Step firstStep;

    @Bean
    public Job MFJob(JobCompletionNotificationListener listener) {

        return jobBuilderFactory.get("MFJob")
                .incrementer(new RunIdIncrementer())
                //.listener(listener)
                .flow(firstStep)
                //.next(memberInfoStep)
                .end()
                .build();
    }

}
