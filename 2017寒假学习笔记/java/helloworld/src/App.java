/**
 * Created by Administrator on 2017/3/5.
 */
class A{
    void Fun(){
        System.out.println("singing");
    }
}
class B{
    void Fun(){
        System.out.println("dancing");
    }
}
class C{
    void Fun(){
        System.out.println("Keep your eyes on the stars,and your feet on the ground");
        System.out.println("志高存远，脚踏实地");
    }
}
class D{
    void Fun(){
        System.out.println("志存高远，脚踏实地");
    }
    void FunDanc(){
        System.out.println("dancing");
    }
    void FunSing(){
        System.out.println("singing");
    }
}
public class App{
    void Fun(){
        System.out.println("表现app的功能");
    }
    public static void main (String[] args){
        App app = new App();
        app.Fun();
        A a = new A();
        a.Fun();
        B b = new B();
        b.Fun();
        C c = new C();
        c.Fun();
        D d = new D();
        d.FunSing();
        d.FunDanc();
        d.Fun();
    }
}
