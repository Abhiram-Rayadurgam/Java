class WrongAge extends Exception{
public WrongAge(String m){
super(m);
}
}

class Father{
int age;
public Father(int age) throws WrongAge{
if(age<=0){
throw new WrongAge("Too Less!");
} else {
System.out.println("Object created successfully");
}
this.age=age;
}
}

class Son extends Father{
int sAge;
public Son(int fatherAge,int sAge) throws WrongAge{
super(fatherAge);
if(sAge>=fatherAge){
throw new WrongAge("Son cannot be older than father");
}
}
}

public class Run{
public static void main(String[] args){
try{
Son son1 = new Son(40,20);
} catch(WrongAge e){
System.out.printf("error: "+e.getMessage());
}
try{
Son son1 = new Son(0,0);
} catch(WrongAge e){
System.out.printf("error: "+e.getMessage());
}
try{
Son son1 = new Son(10,20);
} catch(WrongAge e){
System.out.printf("error: "+e.getMessage());
}
}
}
