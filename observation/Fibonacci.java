class Fibonacci{
    public static void main(String[] args){
        int a=0,b=1,c,i=0;
        while(i<=7){
            System.out.printf("%d\n",a);
            c=a+b;
            a=b;
            b=c;
            i++;
        }
    }
}
