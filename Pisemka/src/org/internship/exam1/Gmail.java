package org.internship.exam1;

/**
 * Created by Davča on 8.6.2017.
 */
public class Gmail extends MailImpl {
    private String SMTP;
    public Gmail(){
        super("smtp.gmail.com");
    }
    @Override
    public String getSmtp() {
        return SMTP;
    }

//    @Override
//    public boolean send(Person from, Person to, String content, String subject) {
//        return super.send(from, to, content, subject);
//    }
//
//    @Override
//    public boolean send(Person from, Person to, String content) {
//        return super.send(from,to,content);
////        if ((from == null) || (to == null) || (to.getEmail() == null)){
////            return false;
////        }
////        content = MailImpl.NOSUBJECT;
////        System.out.println("Email from "+from+" to " +to.getEmail()+":"+content);
////        return true;
//    }
}
