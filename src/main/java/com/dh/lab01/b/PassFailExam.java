package com.dh.lab01.b;

/**
 * @author Daniel Haddadeen (2588731)
 */
public class PassFailExam extends PassFailActivity {
    private int numQuestions;
    private double pointsEach;
    private int numMissed;
    
    public PassFailExam(int questions, int missed, double minPassing) {
        super(minPassing);
        numQuestions = questions;
        numMissed = missed;
        pointsEach = getPointsEach();
        
        setScore(100.0 - (pointsEach * numMissed));
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
