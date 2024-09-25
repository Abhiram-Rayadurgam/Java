class Prime{
public static void main(String args[]){
int a=7;int flag=0;
for(int i=2;i<a;i++){
if(a%i==0){
System.out.println("composite");
flag=1;
break;
}
}
if(flag==0){
System.out.println("prime");
}
}
}