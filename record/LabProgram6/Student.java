package CIE;

import java.util.Scanner;

public class Student {
Scanner s = new Scanner(System.in);
protected String usn=new String();
protected String name=new String();
protected int sem;
public void inputStudentDetails(){
System.out.println("enter usn, name and sem");
usn = s.nextLine();
name = s.nextLine();
sem = s.nextInt();
}
public void displayStudentDetails() {
System.out.printf("usn=" + usn +", name="+ name+", sem="+sem+"\n");
}

}
