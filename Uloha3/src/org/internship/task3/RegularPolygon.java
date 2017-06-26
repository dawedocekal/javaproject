package org.internship.task3;

/**
 * Interface - convex regular polygons.
 *
 */
public interface RegularPolygon
{
    /**
     * @return length of edges
     */
    double getEdgeLength();

    /**
     * @return number of edges.
     */
    double getNumEdges();

    /**
     * @return radius of circumscribing circle
     */
    double getRadius();
}