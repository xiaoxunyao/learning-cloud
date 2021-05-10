package com.inet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 启动目录和项目入口
 * @author HCY
 * @since 2021/5/7 7:55 下午
*/
@SpringBootApplication
public class SpringBootRun {
    public static void main(String[] args) {
        /* 启动方法 */
        SpringApplication.run(SpringBootRun.class,args);
    }
}
