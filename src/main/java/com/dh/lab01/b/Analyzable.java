package com.dh.lab01.b;

/**
 * @author Daniel Haddadeen (2588731)
 */
public interface Analyzable {
    /**
     * Returns the average score of all the graded activities.
     * @return The average score of all the graded activities.
     */
    double getAverage();
    
    /**
     * Returns the highest score of all the graded activities.
     * @return The highest score of all the graded activities.
     */
    GradedActivity getHighest();
    
    /**
     * Returns the lowest score of all the graded activities.
     * @return The lowest score of all the graded activities.
     */
    GradedActivity getLowest();
}
