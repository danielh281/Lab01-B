package com.dh.lab01.b;

/**
 * @author Daniel Haddadeen (2588731)
 */
public class GradedActivity {
    private double score;
    
   public void setScore(double s) {
       score = s;
   }
    
   
   public double getScore() {
       return score;
   }
   
   /**
    * Returns the corresponding letter grade for the student's score.
    * If the score is 90+, the letter grade will be 'A'.
    * If the score is 80-89, the letter grade will be 'B'.
    * If the score is 70-79, the letter grade will be 'C'.
    * If the score is 60-69, the letter grade will be 'D'.
    * If the score is below 60, the letter grade will be 'F'.
    * @return The letter grade
    */
   public char getGrade() {
       if (score >= 90) {
           return 'A';
       } else if (score >= 80) {
           return 'B';
       } else if (score >= 70) {
           return 'C';
       } else if (score >= 60) {
           return 'D';
       }
       
       return 'F';
   }
}
