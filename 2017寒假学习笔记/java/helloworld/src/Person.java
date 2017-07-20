/**
 * Created by Administrator on 2017/2/23.
 */
//构造（方法）函数   1.0 函数与类名必须一致  2.0 构造函数与类名没有返回值
//3.0 与new一起用 4.0当没有指定构造函数时，编译器自动添加如类名（）{}的构造函数
public class Person {
    int id;
    int age = 20;

    Person(int _id, int _age){
        id = _id;
        age = _age;
    }

    public static void main(String[] args) {
        Person tom = new Person(1,25);
        //tom.person(1,25)  引用.方法名
    }
}
