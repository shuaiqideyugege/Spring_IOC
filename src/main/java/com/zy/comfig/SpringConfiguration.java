package com.zy.comfig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

//标志该类是Spring的核心配置类
@Configuration
//配置组件扫描
@ComponentScan("com.zy")
//导入类(数组)
@Import({DataSourceConfiguration.class})
public class SpringConfiguration {

}
