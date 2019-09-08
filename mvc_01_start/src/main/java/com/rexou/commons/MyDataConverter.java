package com.rexou.commons;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author qiushi 2019/9/6
 */
public class MyDataConverter implements Converter<String, Date> {

    @Override
    public Date convert(String source) {

        if(null == source){
            throw new RuntimeException("时间为空");
        }

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        try {
            return sdf.parse(source);
        } catch (Exception e) {
            throw new RuntimeException("时间解析出错");
        }
    }
}
