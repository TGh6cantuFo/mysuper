package com.st.service.impl;

import com.st.mapper.WxUserMapper;
import com.st.service.WxUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by zhaoyx on 2017/1/5.
 */
@Service
public class WxUserServiceImpl implements WxUserService {

    @Autowired
    WxUserMapper wxUserMapper;
    @Override
    public List getMessage(){

        List<Map<String,Object>> list = wxUserMapper.getMessage();
        for (Map map:list){
            System.out.println((String)map.get("name")+"----------"+(Integer)map.get("age")
                    +"----------"+(String)map.get("sex"));
        }
        return list;
    }
}
