package com.st.batch.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.ExitStatus;
import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.StepExecutionListener;
import org.springframework.stereotype.Component;

@Component
public class StepCompletionNotificationListener implements StepExecutionListener {

    private static final Logger log = LoggerFactory.getLogger(StepCompletionNotificationListener.class);
    @Override
    public void beforeStep(StepExecution stepExecution) {
        //stepExecution.getJobParameters();
        //stepExecution.setReadSkipCount(3);
        //stepExecution.setWriteCount(3);
        //System.out.println(stepExecution.getReadCount());
    }

    @Override
    public ExitStatus afterStep(StepExecution stepExecution) {
        //stepExecution.setStatus(BatchStatus.STOPPED);
        //System.out.println(stepExecution.getReadCount());
        //return ExitStatus.STOPPED;
        return null;
    }
}
