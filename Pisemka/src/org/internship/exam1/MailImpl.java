package org.internship.exam1;

/**
 * Created by Davča on 8.6.2017.
 */
public class MailImpl implements Email {
    private String SMTP;
    public final static String NOSUBJECT = "No subject";
    public MailImpl(String SMTP){
        this.SMTP = SMTP;
    }
    @Override
    public String getSmtp() {
        return SMTP;
    }

    @Override
    public boolean send(Person from, Person to, String content, String subject) {
        if ((from == null) || (to == null) || (to.getEmail() == null)){
            return false;
        }
        if (subject == null){
            subject = NOSUBJECT;
        }
        System.out.println("Email from "+from+" to " +to.getEmail()+":"+subject+":"+content);
        return true;
    }

    @Override
    public boolean send(Person from, Person to, String content) {
        return send(from,to,content,NOSUBJECT);
//        if ((from == null) || (to == null) || (to.getEmail() == null)){
//            return false;
//        }
//        content = NOSUBJECT;
//        System.out.println("Email from "+from+" to " +to.getEmail()+":"+content);
//        return true;
    }
}
