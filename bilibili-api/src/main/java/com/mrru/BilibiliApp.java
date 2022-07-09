package com.mrru;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * @className: BilibiliApp
 * @author: 茹某
 * @date: 2022/7/7 19:13
 **/
@SpringBootApplication
public class BilibiliApp
{
    public static void main(String[] args)
    {
        ApplicationContext app = SpringApplication.run(BilibiliApp.class, args);
    }
}
