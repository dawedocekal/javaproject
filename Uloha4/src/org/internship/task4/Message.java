package org.internship.task4;

/**
 * Text message for one or more recipients.
 */
public interface Message
{
    /**
     *
     * @return text of the message
     */
    String getText();

    /**
     *
     * @return number of recipients (addresses) in the message.
     */
    int numTargets();

    /**
     *
     * @param index index of the target
     * @return address on success,
     *         null on failure (e.g. there is no address on "index" position,
     *              index is out of array's bounds, etc.)
     */
    String getTarget(int index);
}
