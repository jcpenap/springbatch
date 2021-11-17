package com.bahrath.boot.bath.config;

import com.bahrath.boot.bath.MyJobListener;
import com.bahrath.boot.bath.Processor;
import com.bahrath.boot.bath.Reader;
import com.bahrath.boot.bath.Writer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BatchConfig {

    @Bean
    public Reader reader() {
        return new Reader();
    }

    @Bean
    public Processor processor() {
        return new Processor();
    }

    @Bean
    public Writer writer() {
        return new Writer();
    }

    @Bean
    public MyJobListener listener() {
        return new MyJobListener();
    }
}
