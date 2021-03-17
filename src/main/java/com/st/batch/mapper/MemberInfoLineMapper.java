package com.st.batch.mapper;

import com.st.batch.entity.MemberInfo;
import com.st.util.MapUtils;
import org.springframework.batch.item.file.LineMapper;
import org.springframework.batch.item.file.mapping.JsonLineMapper;

/**
 * Created by admin on 2016/12/29.
 */
public class MemberInfoLineMapper implements LineMapper<MemberInfo> {

    private JsonLineMapper delegate;
    @Override
    public MemberInfo mapLine(String line, int lineNumber) throws Exception {
        return MapUtils.toObject(MemberInfo.class,delegate.mapLine(line, lineNumber),true);
    }

    public MemberInfoLineMapper(JsonLineMapper delegate) {
        this.delegate = delegate;
    }

    public JsonLineMapper getDelegate() {
        return delegate;
    }

    public void setDelegate(JsonLineMapper delegate) {
        this.delegate = delegate;
    }
}
