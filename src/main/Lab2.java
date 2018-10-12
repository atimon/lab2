/*
    Programming for Computer Scientists (CS118) - Lab 2
    Variables and basic types
*/

/* This class contains methods related to calculations
   involving percentages. */
public class Lab2 {
    // this method should calculate what percentage
    // the thisMany argument is of thatMany
    public float percentageOf(float thisMany, float thatMany) {
        float result;
        result = thisMany/thatMany*100;
        return result;
    }

    // this method should calculate the overall module mark
    // for CS118 based on the individual marks for the first
    // coursework, the second coursework, and the exam (all out
    // of 100) knowing that the weights of the components are
    // 15, 25, and 60 respectively.
    public float overallModuleMark(float cswk1, float cswk2, float exam) {
        float result2;
        result2 = ((cswk1/100)*15)+((cswk2/100)*25)+((exam/100)*60);
        return result2;
    }

    // this method should calculate the required exam mark needed
    // to achieve a desired overall module mark, given the marks
    // for the first and second coursework.
    public float desiredExamMarkToAchieve(float cswk1, float cswk2, float moduleMark) {
        float desired;
        desired = ((100*moduleMark)/60)-((cswk1*15)/60)-((cswk2*25)/60);
        return desired;
    }

    // this method should calculate the mark that is needed for
    // the third component of some assessment, given the marks for the
    // first two components as well as the weights of all components and
    // the desired overall mark
    public float markToAchieve(float c1, float w1, float c2, float w2, float overall) {
        float finalmark;
        float w3;
        w3 = 100-w1-w2;
        finalmark = ((100*overall)/w3)-((c1*w1)/w3)-((c2*w2)/w3);
        return finalmark;
    }
}
