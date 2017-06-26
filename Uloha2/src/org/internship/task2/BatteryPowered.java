package org.internship.task2;

/**
 *
 */
public interface BatteryPowered
{
    /**
     *
     * @return true if the device has batteries, false otherwise.
     */
    public boolean hasBatteries();

    /**
     * Inserts new batteries into device.
     *
     * @return false if the device already has batteries inside, true on success
     */
    public boolean insertBatteries();

    /**
     * Removes batteries from device.
     *
     * @return false if the device has no batteries inside, true on success
     */
    public boolean removeBatteries();

    /**
     *
     * @return text description of the device state.
     */
    public String toString();
}
