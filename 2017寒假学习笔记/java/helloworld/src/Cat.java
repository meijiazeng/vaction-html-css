/**
 * Created by Administrator on 2017/2/24.
 */
//局部变量是在栈内 new的东西都是在堆内 静态的都在数据区（data segment）
//static关键字
public class Cat {
    static int sid = 0;
    String name;
    int id;
    Cat(String name){
        this.name = name;
        id = sid++;
    }
    public void info(){
        System.out.println("My name is "+name+" No. "+id);
    }

    public static void main(String[] args) {
        Cat.sid = 100;
        Cat mimi = new Cat ("mimi");
        Cat pipi = new Cat ("pipi");
        mimi.info();
        pipi.info();
    }
}
