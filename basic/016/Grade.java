/**
 * Calculate Final Grade
 *
 * Calculate final grade based on weighted average mean.
 * Use many different kinds of variables in the program.
 * The Final grade can have any number of decimals in the output.
 *
 * [1] Weighted arithmetic mean
 *
 * @author Ramesh Pandey <ramesh.pandey@tuni.fi>
 * @version 2024.0210
 * @since 17.0
 */
class Grade {
    /**
     * Calculates the final grade based on weighted average mean.
     *
     * @param ectsExam            ECTS points for the exam.
     * @param gradeExam           Grade for the exam.
     * @param ectsDesign          ECTS points for the design.
     * @param gradeDesign         Grade for the design.
     * @param ectsImplementation  ECTS points for the implementation.
     * @param gradeImplementation Grade for the implementation.
     * @return Final grade.
     */
    
    public static double calculateFinalGrade(int ectsExam, double gradeExam, int ectsDesign,
                                             double gradeDesign, int ectsImplementation, double gradeImplementation) {
        double totalEcts = ectsExam + ectsDesign + ectsImplementation;
        double weightedSum = (ectsExam * gradeExam) + (ectsDesign * gradeDesign) + (ectsImplementation * gradeImplementation);
        return weightedSum / totalEcts;
    }

    /**
     * Prints the details of each course part.
     *
     * @param part     Course part name.
     * @param ects     ECTS points for the course part.
     * @param grade    Grade for the course part.
     */
    public static void printCourseDetails(String part, int ects, double grade) {
        System.out.println(part + "          " + ects + "      " + grade);
    }

    /**
     * Main method to execute the program.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        int ectsExam = 2;
        double gradeExam = 2.0;
        int ectsDesign = 1;
        double gradeDesign = 4.0;
        int ectsImplementation = 3;
        double gradeImplementation = 4.0;




        System.out.println("                       ECTS   Grade");
        System.out.println("-------------------------------------------");
        printCourseDetails("Exam          ", ectsExam, gradeExam);
        printCourseDetails("Design        ", ectsDesign, gradeDesign);
        printCourseDetails("Implementation", ectsImplementation, gradeImplementation);
        System.out.println("-------------------------------------------");
        System.out.println("Totals                  " + (ectsExam + ectsDesign + ectsImplementation) + "      " +
                String.format("%.3f", calculateFinalGrade(ectsExam, gradeExam, ectsDesign, gradeDesign, ectsImplementation, gradeImplementation)) + "  (Final Grade)");
    }
}
