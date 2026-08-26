package com.dh.lab01.b;

/**
 * @author Daniel Haddadeen (2588731)
 */
public class FinalExam extends GradedActivity {
    private int numQuestions;
    private double pointsEach;
    private int numMissed;
    
    public FinalExam(int questions, int missed) {
        this.numQuestions = questions;
        this.numMissed = missed;
        
        pointsEach = 100.0 / this.numQuestions;
        super.setScore(100.0 - (missed * pointsEach));
    }
    
    public double getPointsEach() {
        return pointsEach;
    }
    
    public int getNumMissed() {
        return numMissed;
    }
}
