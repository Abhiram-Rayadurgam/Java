import java.util.Scanner;
// usn:1BM23CS011 name:Abhiram Rayadurgam
class Quadratic{
 public static void main(String[] args){
  int a,b,c,d;
  double r1,r2;
  Scanner s = new Scanner(System.in);
  System.out.printf("enter values for a,b,c in ax^2+bx+c=0");
  a=s.nextInt();
  b=s.nextInt();
  c=s.nextInt();
  d=b*b-4*a*c;
  if(d==0){
   r1=(-b)/(2*a);
   System.out.printf("roots are real and equal, root1 = root2 = %f",r1);
  }
  else if(d>0){
   r1=((-b) + (Math.sqrt(d)))/(double)(2*a);
   r2 = ((-b) - (Math.sqrt(d)))/(double)(2*a);
   System.out.printf("root1 = %f,root2 = %f",r1,r2);
  }
  else if(d<0){
   r1 = (-b)/(2*a);
   r2 = Math.sqrt(-d)/(2*a);
   System.out.printf("roots are imaginary, root1 = %.2f+i%.2f,root2 = %.2f-i%.2f",r1,r2,r1,r2);
  }
 }
}
