package CIE;

import java.util.Scanner;

public class Internals extends Student {
Scanner s = new Scanner(System.in);
protected int cmarks[] = new int[5];
public int total=0;
public void inputCIEmarks()
{
System.out.println("enter 5 courses' CIE marks");
for(int i=0;i<5;i++){

cmarks[i]=s.nextInt();
}
}


}
