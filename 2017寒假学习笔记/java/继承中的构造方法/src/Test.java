/**
 * Created by Administrator on 2017/2/26.
 */
class Person{
    private String name;
    private String location;
    Person(String name){
        this.name = name;
        location = "beijing";
    }
    Person (String name,String location){   //name=n=c; l=location=beijing
        this.name = name;     //this.name=(成员变量)=name=c
        this.location = location;    //this.location=(成员变量)=location=beijing
    }
    public String info(){
        return "name: "+name+" location: "+location;
    }
}
class Student extends Person{
    private String school;
    Student (String name,String school){
        this(name,"beijing",school);  // 2.0 this后面加括号 就是调用同类的另一个方法
    }
    Student (String n,String l,String school){   // 3.0 n = c,l = beijing,school=s1;
        super(n,l);    // 4.0  调用带有两个参数的Person
        this.school = school;
    }
    public String info() {
        return super.info()+"school: "+school;
    }
}
public class Test {
    public static void main(String[] args) {
        Person p1 = new Person("A");
        Person p2 = new Person("B","shanghai");
        Student s1 = new Student ("C","S1");  // 1.0
        Student s2 = new Student ("C","shanghai","S2");
        System.out.println(p1.info());
        System.out.println(p2.info());
        System.out.println(s1.info());
        System.out.println(s2.info());
    }
}
