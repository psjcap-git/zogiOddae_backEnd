package com.zerobase.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
@ComponentScan({
    "com.zerobase.user",
    "com.zerobase.common"
})
public class MemberApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(MemberApiApplication.class, args);
    }
}
