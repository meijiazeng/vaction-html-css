/**
 * Created by Administrator on 2017/2/25.
 */
class Person {
    String name;
    int age;
    void setName(String name){
        this.name = name;
    }
    public void setAge (int age){
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
}
class Student extends Person{
    String school;
    String getSchool() {
        return school;
    }
    public void setSchool(String school){
        this.school = school;
    }
}

public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("John");
        student.setSchool("SCH");
        System.out.println(student.getName());
        System.out.println(student.getAge());
        System.out.println(student.getSchool());
    }
}
