/**
 * Created by Administrator on 2017/2/26.
 */
class A{
    protected void print (String s){
        System.out.println(s);
    }
    A() { print ("A() ");}  //2.0调用这个没有参数的构造方法
    public void f() { print ("A:f()");}
    //  3.0 输出A（）
}  //然后调用B（）
class B extends A {
    B() { print ("B()");}  //　1.0 如果没有构造方法，系统自动寻找没有参数的基类
    public void f() { print ("B:f() ");}
    public static void main(String[] args){
        B b = new B(); b.f();
        //
    }

}
public class 继承 {
}
