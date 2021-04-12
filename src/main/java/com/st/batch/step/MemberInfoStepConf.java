package com.st.batch.step;

import com.st.batch.entity.MemberInfo;
import com.st.batch.listener.StepCompletionNotificationListener;
import com.st.batch.mapper.MemberInfoLineMapper;
import com.st.batch.writer.MemberInfoWriter;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.mapping.JsonLineMapper;
import org.springframework.batch.item.file.separator.JsonRecordSeparatorPolicy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

import javax.sql.DataSource;
import java.text.SimpleDateFormat;
import java.util.Date;

@Configuration
@EnableBatchProcessing
public class MemberInfoStepConf {

    @Autowired
    public StepBuilderFactory stepBuilderFactory;

    @Autowired
    public DataSource dataSource;

    @Autowired
    StepCompletionNotificationListener steplistener;

    @Autowired
    MemberInfoWriter memberInfoWriter;


    @Bean
    public Step memberInfoStep() {
        return stepBuilderFactory.get("memberInfoStep")
                .allowStartIfComplete(true)
                .listener(steplistener)
                .<MemberInfo, MemberInfo> chunk(1000)
                .reader(memberInfoReader())
                .writer(memberInfoWriter)
                .build();
    }

    @Bean
    @StepScope
    public FlatFileItemReader<MemberInfo> memberInfoReader() {

        //创建Reader
        FlatFileItemReader<MemberInfo> reader = new FlatFileItemReader<MemberInfo>();
        //加载Resource
        reader.setResource(new FileSystemResource("E:/MemberInfo-2016-12-30.txt"));
        //查询起始执行行数
        //HashMap parm = new HashMap();
        //parm.put("step", "memberInfoStep");
        //parm.put("date",new SimpleDateFormat("yyyy-MM-dd").format(new Date(new Date().getTime() - 40*60*1000)));
        //reader.setLinesToSkip(startCountService.getCount(parm) == null ? 0 :startCountService.getCount(parm));
        //System.out.println(startCountService.getCount(parm));
        reader.setRecordSeparatorPolicy(new JsonRecordSeparatorPolicy());
        reader.setLineMapper(new MemberInfoLineMapper(new JsonLineMapper()));
        return reader;
    }

    //@Bean
    //public JdbcBatchItemWriter<MemberInfo> writer() {
    //    JdbcBatchItemWriter<MemberInfo> writer = new JdbcBatchItemWriter<MemberInfo>();
    //    writer.setItemSqlParameterSourceProvider(new BeanPropertyItemSqlParameterSourceProvider<MemberInfo>());
    //    writer.setSql("INSERT INTO memberInfo (" +
    //            "BrandCode,IFMemberId,MemberCode,MemName,Gender,MobilePhone,Email,IdentityCard,BirthDay,CounterCodeBelong,JoinDate,JoinTime,TotalPoint,MemberLevelCode,DataSource) " +
    //            "VALUES (:brandCode,:iFMemberId,:memberCode,:memName,:gender,:mobilePhone,:email,:identityCard,:birthDay,:counterCodeBelong,:joinDate,:joinTime,:totalPoint,:memberLevelCode,:dataSource)");
    //    writer.setDataSource(dataSource);
    //    return writer;
    //}
}
