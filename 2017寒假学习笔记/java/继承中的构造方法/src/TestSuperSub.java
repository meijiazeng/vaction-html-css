/**
 * Created by Administrator on 2017/2/26.
 */
//如果子类构造方法中既没有显示调用基类构造方法，而基类中又没有无参的构造方法，则编译出错
class SuperClass {
    private int n;
    SuperClass() {
        System.out.println("SuperClass()");  // C 调用此函数
    }
    SuperClass(int n){
        System.out.println("SuperClass(" + n + ")");  //3.0 调用此函数
        this.n = n;
    }
}
class SubClass extends SuperClass{
    private int n;
    SubClass(int n){
 // B 如果子类的构造方法中没有显示其调用基类构造方法，则系统默认调用基类无参数的构造方法
        System.out.println("SuperClass(" + n + ")");  // D 最后调用自身的方法
        this.n = n;
    }
    SubClass(){
        super(300);   //2.0 super会先调用自己的基类 有参数的
        System.out.println("SubClass()");  //最后才调用自身方法
    }
}
public class TestSuperSub {
    public static void main (String[] agrs){
        SubClass sc1 = new SubClass();  //1.0 调用没有参数的SubClass
        SubClass sc2 = new SubClass(400);   //A 调用有参数的SubClass
    }
}
