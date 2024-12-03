import SEE.Externals;

public class Run {
    public static void main(String[] args) {
        Externals[] students = new Externals[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter details for Student " + (i + 1) + ":");
            students[i] = new Externals();
            students[i].inputStudentDetails();
            students[i].inputCIEmarks();
            students[i].inputSEEmarks();
            students[i].calculateFinalMarks();
        }
        System.out.println("\nFinal marks for each student:");
        for (int i = 0; i < 3; i++) {
            System.out.println("\nStudent " + (i + 1) + " details:");
            students[i].displayFinalMarks();
        }
    }
}

