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

@Configuration
@EnableBatchProcessing
public class JobConf {

    @Autowired
    public JobBuilderFactory jobBuilderFactory;

    @Autowired
    @Qualifier("memberInfoStep")
    public Step memberInfoStep;


    @Bean
    public Job MFJob(JobCompletionNotificationListener listener) {

        return jobBuilderFactory.get("MFJob")
                .incrementer(new RunIdIncrementer())
                //.listener(listener)
                .flow(memberInfoStep)
                .end()
                .build();
    }

}
