package com.alan.hysupermarket.utils;


import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 代码自动生成
 * 通过数据库表生成
 */
public class MybatisGenerator {

    public static void main(String[] args) throws Exception {
        // 设置为今天的日期 2018-2-3 预防下次启动的时候会覆盖掉之前写好的配置
        String today = "";

        // 设置时间格式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date now = sdf.parse(today);
        Date date = new Date();
        // 对比时间，如果符合则执行
        if (date.getTime() > now.getTime() + 1000 * 60 * 60 * 24) {
            System.out.println("----未成功运行----");
            System.out.println("本程序具有破坏作用，应该只运行一次，如果必须要再运行，需要修改today变量为今天，如:" + sdf.format(new Date()));
            return;
        }
        if (false) {
            return;
        }
        List<String> warnings = new ArrayList<String>();
        boolean overwrite = true;
        InputStream is = MybatisGenerator.class.getClassLoader().getResource("generatorConfig.xml").openStream();
        //
        ConfigurationParser cp = new ConfigurationParser(warnings);
        //
        Configuration config = cp.parseConfiguration(is);
        is.close();
        //
        DefaultShellCallback callback = new DefaultShellCallback(overwrite);
        //
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
        myBatisGenerator.generate(null);
        System.out.println("生成代码成功，只能执行一次，以后执行会覆盖掉mapper,pojo,xml 等文件上做的修改");
    }

}
