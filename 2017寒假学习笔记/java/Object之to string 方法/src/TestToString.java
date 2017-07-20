/**
 * Created by Administrator on 2017/2/28.
 */
public class TestToString {
    public static void main (String[] args){
        Dog d = new Dog();
        System.out.println("d:=" + d.toString());
        //d:=Dog@74a14482  (　默认：类名＋＂@＂＋哈希编码)
    }
}
class Dog{
    public String toString(){
        return "i am a cool dog!"; //返回一个正常的字符串信息
    }
}
