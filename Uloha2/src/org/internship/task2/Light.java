package org.internship.task2;

/**
 *
 */
public interface Light
{
    /**
     * @return beam distance in meters.
     */
    public int beamDistance();

    /**
     * @return true if the light is directional, false if it's omnidirectional
     */
    public boolean isDirectional();

    /**
     * @return text description of the light
     */
    public String toString();
}
