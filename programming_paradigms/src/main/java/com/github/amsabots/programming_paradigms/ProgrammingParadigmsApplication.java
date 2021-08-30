package com.github.amsabots.programming_paradigms;

import com.github.amsabots.programming_paradigms.prototype.ProtoFalse;
import com.github.amsabots.programming_paradigms.prototype.ProtoTrue;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

@SpringBootApplication
public class ProgrammingParadigmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProgrammingParadigmsApplication.class, args);
    }

    @Bean
    @Scope("prototype")
    public ProtoTrue protoTrue() {
        return new ProtoTrue();
    }

    @Bean
    public ProtoFalse protoFalse() {
        return new ProtoFalse();
    }
}
