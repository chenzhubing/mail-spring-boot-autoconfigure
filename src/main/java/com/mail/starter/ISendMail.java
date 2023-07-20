package com.mail.starter;

public interface ISendMail {

    /**
     * 发送邮件
     * @param content 发送内容
     */
    public void send(String content);

}
