package com.dh.lab01.b;

/**
 * @author Daniel Haddadeen (2588731)
 */
public class CourseGrades implements Analyzable {
    private GradedActivity[] grades;
    private static int NUM_GRADES = 4;
    
    public CourseGrades() {
        grades = new GradedActivity[NUM_GRADES];
    }
    
    /**
     * Returns the average score of all the graded activities.
     * @return The average score of all the graded activities.
     */
    public double getAverage() {
        double total = 0;
        
        for (GradedActivity grade : grades) {
            total += grade.getScore();
        }
        
        return total / NUM_GRADES;
    }
    
    /**
     * Returns the graded activity with the highest score.
     * @return The graded activity with the highest score
     */
    public GradedActivity getHighest() {
        GradedActivity highest = grades[0];
        
        for (GradedActivity grade : grades) {
            if (grade.getScore() > highest.getScore()) {
                highest = grade;
            }
        }
        
        return highest;
    }
    
    /**
     * Returns the graded activity with the lowest score.
     * @return The graded activity with the lowest score
     */
    public GradedActivity getLowest() {
        GradedActivity lowest = grades[0];
        
        for (GradedActivity grade : grades) {
            if (grade.getScore() < lowest.getScore()) {
                lowest = grade;
            }
        }
        
        return lowest;
    }
    
    public void setLab(GradedActivity aLab) {
        grades[0] = aLab;
    }
    
    public void setPassFailExam(PassFailExam aPassFailExam) {
        grades[1] = aPassFailExam;
    }
    
    public void setEssay(Essay anEssay) {
        grades[2] = anEssay;
    }
    
    public void setFinalExam(FinalExam aFinalExam) {
        grades[3] = aFinalExam;
    }
    
    /**
     * Returns a formatted string containing the scores and grades
     * for each graded activity.
     * @return 
     */
    @Override
    public String toString() {
        String str = String.format(
                "%s %-10.1f %s: %c\n" 
                + "%s: %-10.1f %s: %c\n" 
                + "%s: %-10.1f %s: %c\n"
                + "%s: %-10.1f %s: %c\n", 
                "Lab Score", grades[0].getScore(), "Grade", grades[0].getGrade(),
                "Pass/Fail Exam Score", grades[1].getScore(), "Grade", grades[1].getGrade(),
                "Essay Score", grades[2].getScore(), "Grade", grades[2].getGrade(),
                "Final Exam Score", grades[3].getScore(), "Grade", grades[3].getGrade()
        );
        
        return str;
    }
}
