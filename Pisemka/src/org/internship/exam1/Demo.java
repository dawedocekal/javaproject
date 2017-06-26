package org.internship.exam1;

/**
 * Demo
 */
public class Demo {

    public static void main(String[] args) {
        // init
        Person patrick = new PersonImpl("Patrick", "+420 123 456 789", "kwpatck@yahoo.com.hk");
        Person joe = new PersonImpl("John", "+420 987 654 321", "john@gmail.com");
        Person anon = new PersonImpl("John", null, null);
        String message = "Drahousek zakaznik, KB zrusit tvuj ucet.";
        Email gmail = new Gmail();

        gmail.send(patrick, joe, message, "Lotery WIN");
        gmail.send(patrick, joe, message);
        System.out.print("Sending mail with no owner: ");
        System.out.println((gmail.send(null, joe, message)) ? "ERROR" : "OK");
        System.out.print("Sending mail with no recipient: ");
        System.out.println((gmail.send(patrick, null, message)) ? "ERROR" : "OK");
        System.out.print("Sending mail with no recipient's address: ");
        System.out.println((gmail.send(patrick, anon, message)) ? "ERROR" : "OK");

        Sender iPhone = new MobilePhone();
        iPhone.send(joe, patrick, "Stop spamming!");
        System.out.print("Sending SMS with no owner: ");
        System.out.println((iPhone.send(null, patrick, "Stop spamming!")) ? "ERROR" : "OK");
        System.out.print("Sending SMS with no recipient: ");
        System.out.println((iPhone.send(joe, null, "Stop spamming!")) ? "ERROR" : "OK");
        System.out.print("Sending SMS with no recipient's number: ");
        System.out.println((iPhone.send(joe, anon, "Stop spamming!")) ? "ERROR" : "OK");
    }

}
