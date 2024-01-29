package entity;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GradingCalculatorTest {


//    **Les scénarios de tests** :
//
//- Score : 95%, Présence : 90 => Note: A

    @Test
    void testGetGrade1(){
        GradingCalculator gradingCalculator = new GradingCalculator();
        int score = 95;
        int attendancePercentage = 90;

        gradingCalculator.setScore(score);
        gradingCalculator.setAttendancePercentage(attendancePercentage);

        char result = gradingCalculator.getGrade();

        Assertions.assertEquals('A',result);
    }


//- Score : 85%, Présence : 90 => Note: B
@Test
void testGetGrade2(){
    GradingCalculator gradingCalculator = new GradingCalculator();
    int score = 85;
    int attendancePercentage = 90;

    gradingCalculator.setScore(score);
    gradingCalculator.setAttendancePercentage(attendancePercentage);

    char result = gradingCalculator.getGrade();

    Assertions.assertEquals('B',result);
}


//- Score : 65%, Présence : 90 => Note: C

    @Test
    void testGetGrade3(){
        GradingCalculator gradingCalculator = new GradingCalculator();
        int score = 65;
        int attendancePercentage = 90;

        gradingCalculator.setScore(score);
        gradingCalculator.setAttendancePercentage(attendancePercentage);

        char result = gradingCalculator.getGrade();

        Assertions.assertEquals('C',result);
    }


//- Score : 95%, Présence : 65 => Note: B

    @Test
    void testGetGrade4(){
        GradingCalculator gradingCalculator = new GradingCalculator();
        int score = 95;
        int attendancePercentage = 65;

        gradingCalculator.setScore(score);
        gradingCalculator.setAttendancePercentage(attendancePercentage);

        char result = gradingCalculator.getGrade();

        Assertions.assertEquals('B',result);
    }
//- Score : 95%, Présence : 55 => Note: F

    @Test
    void testGetGrade5(){
        GradingCalculator gradingCalculator = new GradingCalculator();
        int score = 95;
        int attendancePercentage = 55;

        gradingCalculator.setScore(score);
        gradingCalculator.setAttendancePercentage(attendancePercentage);

        char result = gradingCalculator.getGrade();

        Assertions.assertEquals('F',result);
    }

//- Score : 65%, Présence : 55 => Note: F

    @Test
    void testGetGrade6(){
        GradingCalculator gradingCalculator = new GradingCalculator();
        int score = 65;
        int attendancePercentage = 55;

        gradingCalculator.setScore(score);
        gradingCalculator.setAttendancePercentage(attendancePercentage);

        char result = gradingCalculator.getGrade();

        Assertions.assertEquals('F',result);
    }

//- Score : 50%, Présence : 90 => Note: F

    @Test
    void testGetGrade7(){
        GradingCalculator gradingCalculator = new GradingCalculator();
        int score = 50;
        int attendancePercentage = 90;

        gradingCalculator.setScore(score);
        gradingCalculator.setAttendancePercentage(attendancePercentage);

        char result = gradingCalculator.getGrade();

        Assertions.assertEquals('F',result);
    }
}
