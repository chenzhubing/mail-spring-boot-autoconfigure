package com.mail.starter;

public class SendMailImpl implements ISendMail{

    private MailProperties mailProperties;

    public SendMailImpl(MailProperties mailProperties){
        this.mailProperties = mailProperties;
    };

    public  SendMailImpl(){

    }

    @Override
    public void send(String content) {
        System.out.println("=============start send mail================");
        System.out.println("address:"+mailProperties.getAddress()+";cc:"+mailProperties.getCc());
        System.out.println("==============end  send mail================");
    }
}
