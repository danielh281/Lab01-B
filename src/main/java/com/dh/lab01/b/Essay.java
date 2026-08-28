package com.dh.lab01.b;

/**
 * @author Daniel Haddadeen (2588731)
 */
public class Essay extends GradedActivity {
    private double grammer;
    private double spelling;
    private double correctLength;
    private double content;
    
    /**
     * Sets the score for grammar, spelling, correct length and content and also
     * sets the global score for the essay by adding them up.
     * @param gr The score for grammar
     * @param sp The score for spelling
     * @param len The score for correct length
     * @param cnt The score for content
     */
    public void setScore(double gr, double sp, double len, double cnt) {
        grammer = Math.clamp(gr, 0, 30);
        spelling = Math.clamp(sp, 0, 20);
        correctLength = Math.clamp(len, 0, 20);
        content = Math.clamp(cnt, 0, 30);
        
        super.setScore(grammer + spelling + correctLength + content);
    }
    
    public void setGrammer(double g) {
        grammer = g;
    }
    
    public void setSpelling(double s) {
        spelling = s;
    }
    
    public void setCorrectLength(double c) {
        correctLength = c;
    }
    
    public void setContent(double c) {
        content = c;
    }

    public double getGrammer() {
        return grammer;
    }

    public double getSpelling() {
        return spelling;
    }

    public double getCorrectLength() {
        return correctLength;
    }
}
