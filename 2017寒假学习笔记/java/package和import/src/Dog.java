/**
 * Created by Administrator on 2017/2/24.
 */
//也可以使用import 在文件的开头引入要使用的类
    //import  com.shabi.java.(引入)或者import com.shabi.java.*(*表示这个包下的所有类引入)
//注意：如果访问同一个包的类不需要目录
public class Dog {
    public static void main (String[] args){
        //如果要使用一个类时，必须使用该类的全名（例如com.shabi.java.）
        com.shabi.java.Cat c = new com.shabi.java.Cat();
        //Cat c = new Cat();
    }
}
