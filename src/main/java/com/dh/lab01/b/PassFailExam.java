package com.dh.lab01.b;

/**
 * @author 2588731
 */
public class PassFailExam extends PassFailActivity {
    private int numQuestions;
    private double pointsEach;
    private int numMissed;
    
    public PassFailExam(int questions, int missed, double minPassing) {
        super(minPassing);
        numQuestions = questions;
        pointsEach = getPointsEach();
    }
    
    /**
     * Returns the points for each question using the following formula: (100.0 / numQuestions)
     * @return The points for each question
     */
    public double getPointsEach() {
        return 100.0 / numQuestions;
    }
    
    public int getNumMissed() {
        return numMissed;
    }
}
