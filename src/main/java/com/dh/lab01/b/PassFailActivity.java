package com.dh.lab01.b;

/**
 * @author 2588731
 */
public class PassFailActivity extends GradedActivity {
    private double minPassingScore;
    
    public PassFailActivity(double mps) {
        minPassingScore = mps;
    }
    
    /**
     * Returns a passing letter grade based on whether the score is higher or
     * lower than the minimum passing score.
     * @return 'P' if the score is higher or equal to the minimum passing score. 'F' if it is less.
     */
    @Override
    public char getGrade() {
        if (getScore() >= minPassingScore) {
            return 'P';
        } else {
            return 'F';
        }
    }
}
