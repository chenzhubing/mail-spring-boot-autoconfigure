package com.mail.starter;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "czb.mail")
public class MailProperties {

    /**
     * 邮件发送地址
     */
    private String address;

    /**
     * 邮件抄送地址
     */
    private String cc;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCc() {
        return cc;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }
}
