package org.internship.task1;
/**
 * Bus line.
 */

public class Line
{
    private int number;
    private String startStation;
    private String endStation;

    /**
     * Constructor
     * @param num line number
     * @param start start station of the line
     * @param end end station of the line
     */
    public Line(int num, String start, String end) {
        number = num;
        startStation = start;
        endStation = end;
    }

    /**
     * @return line number
     * @param number
     */
    public int getLineNumber(int number) {
        return this.number;
    }

    /**
     * @return start station of the bus line
     */
    public String getFirstEndStation() {
        return startStation;
    }

    /**
     * @return end station of the bus line
     */
    public String getSecondEndStation() {
        return endStation;
    }
}