package com.bahrath.boot.bath.config;

import com.bahrath.boot.bath.MyJobListener;
import com.bahrath.boot.bath.Processor;
import com.bahrath.boot.bath.Reader;
import com.bahrath.boot.bath.Writer;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BatchConfig {

    @Autowired
    private StepBuilderFactory stepBuilderFactory;

    @Bean
    public Step step() {
        return stepBuilderFactory.get("step1")
                .<String, String>chunk(1)
                .reader(reader())
                .processor(processor())
                .writer(writer())
                .build();
    }

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
