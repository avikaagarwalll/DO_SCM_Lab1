package pkg1;
public class MyClass {
    int a,b;
    public void mul(int x,int y)
    {
        a=x;
        b=y;
        int c = a*b;
        System.out.println("Multiplication  is"+c);
    }
    public static void main(String[]args){
         MyClass ob = new MyClass();
         ob.mul(2,5);
    } 
}
