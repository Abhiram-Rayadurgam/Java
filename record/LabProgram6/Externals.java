package SEE;
import CIE.Internals;

import java.util.Scanner;

public class Externals extends Internals {
protected int marks[] = new int[5];
protected int finalMarks[] = new int[5];

public void inputSEEmarks() {

Scanner s = new Scanner(System.in);
System.out.println("Enter 5 course marks:");
for(int i=0;i<5;i++){
marks[i]=s.nextInt();

 }}
public void calculateFinalMarks() {

for(int i=0;i<5;i++){
finalMarks[i]=(marks[i]/2)+cmarks[i];
}

 }

public void displayFinalMarks() {

displayStudentDetails();

for(int i=0;i<5;i++){
System.out.printf("marks"+(i+1)+": "+finalMarks[i]+"\n");
}

}

 }


