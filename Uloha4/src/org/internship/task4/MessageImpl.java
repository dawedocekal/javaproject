package org.internship.task4;

/**
 * Created by Davča on 1.6.2017.
 */
public class MessageImpl implements Message {
    private String[] array;
    private String text;
    public MessageImpl(String text,String[] receiver) {
        if ((text==null)||(receiver==null)) {
            throw new NullPointerException("Error occurs, text or receiver is empty.");
        }
        this.text = text;
        array = new String[receiver.length];
        System.arraycopy(receiver,0,array ,0,receiver.length);

    }


    @Override
    public String getText() {
        return text;
    }

    @Override
    public int numTargets() {
        return array.length;
    }

    @Override
    public String getTarget(int index) {
        return array[index];
    }
}
