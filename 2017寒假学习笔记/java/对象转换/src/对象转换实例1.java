/**
 * Created by Administrator on 2017/3/4.
 */
public class 对象转换实例1 {
}
class Animal{
    public String name;
    Animal (String name){
        this.name = name;
    }
}
class Cat extends Animal{
    public String eyesColor;
    Cat (String n,String c){
        super(n);
        eyesColor = c;
    }
}
class Dog extends Animal {
    public String furColor;
    Dog (String n,String c){
        super(n);
        furColor = c;
    }
}