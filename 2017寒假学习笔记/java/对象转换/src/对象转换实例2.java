/**
 * Created by Administrator on 2017/3/4.
 */
public class 对象转换实例2 {
    public static void main (String[] args){
        Animal a = new Animal ("name");
        Cat c = new Cat ("catname","blue");
        Dog d = new Dog ("dogname","black");
        System.out.println(a instanceof Animal); //true
        System.out.println(c instanceof Animal);  //true
        System.out.println(d instanceof Animal);   //true
        System.out.println(a instanceof Cat);   //false
        a = new Dog("bigyellow","yellow");
        System.out.println(a.name);  //bigyellow
//        System.out.println(a.furname);  error
        System.out.println(a instanceof Animal);  //true
        System.out.println(a instanceof Dog);    //true
        Dog d1 = (Dog)a;   //要加上强制转换符
        System.out.println(d1.furColor);   //yellow
    }

}
