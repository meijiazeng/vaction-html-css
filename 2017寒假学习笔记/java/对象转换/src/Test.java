/**
 * Created by Administrator on 2017/3/5.
 */
public class Test {
    public static void main (String[] args){
        Test test =  new Test();
        Animal a = new Animal ("name");
        Cat c = new Cat("catname","blue");  // 2.0使用这个
        Dog d = new Dog("Dogname","black");
        test.f(a);test.f(c);test.f(d);  //分别把a.c.d分别传入f方法中
    }
    public void f(Animal a ){
        System.out.println("name: "+a.name);
        if (a instanceof Cat){   //因为a本身是animal类型 所以要转换为Cat类型才可以使用Cat
            Cat cat = (Cat)a;   // 1.0 如果是Cat就强制转换为Cat
            System.out.println(" "+cat.eyesColor+" eyes");
        }else if (a instanceof Dog){
            Dog dog = (Dog)a;   // 如果是Dog强制转换为Dog
            System.out.println(" "+dog.furColor+" fur");
        }
    }
}
