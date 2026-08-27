package com.dh.lab01.b;

/**
 * @author Daniel Haddadeen (2588731)
 */
public class Essay extends GradedActivity {
    private double grammer;
    private double spelling;
    private double correctLength;
    private double content;
    
    public Essay(double grammer, double spelling, double correctLength, double content) {
        this.grammer = Math.clamp(grammer, 0, 30);
        this.spelling = Math.clamp(spelling, 0, 20);
        this.correctLength = Math.clamp(correctLength, 0, 20);
        this.content = Math.clamp(content, 0, 30);
    }
    
    public void setScore(double gr, double sp, double len, double cnt) {
        grammer = Math.clamp(gr, 0, 30);
        spelling = Math.clamp(sp, 0, 20);
        correctLength = Math.clamp(len, 0, 20);
        content = Math.clamp(cnt, 0, 30);
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
    
    @Override
    public double getScore() {
        return grammer + spelling + correctLength + content;
    }
}
