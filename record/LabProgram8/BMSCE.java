public class BMSCE extends Thread{
public void run(){
while(true){
System.out.println("BMSCE College of Engineering");
try{
Thread.sleep(10000);}
catch(InterruptedException e){
System.out.println("interrupted: "+e);
return;
}}}}
