package com.mail.starter;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(MailProperties.class)
@EnableConfigurationProperties(MailProperties.class)
public class MailConfiguration {

    @Bean
   // @ConditionalOnProperty("czb.mail.enable")
    public ISendMail sendMail(MailProperties mailProperties){
        return new SendMailImpl(mailProperties);
    }
}
