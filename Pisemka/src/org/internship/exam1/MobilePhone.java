package org.internship.exam1;

/**
 * Created by Davča on 8.6.2017.
 */
public class MobilePhone implements Sender {

    @Override
    public boolean send(Person from, Person to, String content) {
        if ((from == null) || (to == null) || (to.getPhoneNumber() == null)) {
            return false;
        } else {
            System.out.println("SMS from" + from.getName() + "to number" + to.getPhoneNumber() + ":" + content);
            return true;
        }
    }
}
