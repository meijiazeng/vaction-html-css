/**
 * Created by Administrator on 2017/2/23.
 */
class BirthDate {
    int day ;
    int month;
    int year;

    public BirthDate(int d, int m, int y){   //形参
        day = d;
        month = m;
        year = y;
    }

    public void setDay(int d){
        day = d;
    }

    public void setMonth(int m){
        month = m;
    }

    public void setYear(int y){
        year = y;
    }

    public int getDay(){
        return day;
    }

    public int getMonth(){
        return month;
    }

    public int getYear(){
        return year;
    }

    public void display(){
        System.out.println(day +" " +month+"  " +year);
    }
}
public class Test{
    public static void main(String[] args) {
        Test test = new Test();   // 定义一个局部变量test，
        // 调用test方法     编译器自动添加test(){ }构造函数
        int date = 9;               // 定义date变量值为9
        BirthDate d1 = new BirthDate(7,7,1970);
        //d1指向new出来的BirthDate。 new BirthDate调用的是BirthDate构造方法
        //day = 7;  month = 8;  year = 1970;
        BirthDate d2 = new BirthDate(1,1,2000);
        test.change1(date);       //调用方法  引用名.方法名
        //把date的值传递给i；i=9（这个方法白调）
        test.change2(d1);        //d1的值传递给b(这个方法白调)
        test.change3(d2);        //d2的值传递给b （1,1,2000）
        System.out.println("date=" +date);
        d1.display();  //使用display方法 打印出d1的值 d1的值没变（7,7,1970）
        d2.display();  //使用display方法 打印出d2的值 d2的值改变了(22,1,2000)
    }
    public void change1(int i){
        i = 1234;
    }
    public void change2(BirthDate b){   //birthdate引用的类型
        b = new BirthDate(22,2,2004);
    }
    public void change3(BirthDate b){
        b.setDay(22); //调用类里面的方法才能改变里面的值
        // b =（1,1,2000）执行setDay方法  day=d 所以最后的值为(22,1,2000)
    }
}