package com.st.batch.writer;

import com.st.batch.entity.MemberInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.item.ItemWriter;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by admin on 2016/12/30.
 */
@Component
@StepScope
public class MemberInfoWriter implements ItemWriter<MemberInfo> {
    private static Logger logger = LoggerFactory.getLogger(MemberInfoWriter.class);

    @Override
    public void write(List<? extends MemberInfo> list) throws Exception {
        logger.info("[PosCountersDsWriter write] run list size:" + list.size());
    //    if (!list.isEmpty())
    //    mfPushMemberDMapper.addMemberInfoBatch(list);
    }
}
