public class CSE extends Thread{
public void run(){
while(true){
System.out.println("CSE");
try{
Thread.sleep(2000);}
catch(InterruptedException e){
System.out.println("interrupted: "+e);
return;
}}}}
