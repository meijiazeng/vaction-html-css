/**
 * Created by Administrator on 2017/2/22.
 */
public class 自加自减运算符 {
    public static void main(String[] args) {
        int i1 = 10, i2 = 20;
        int i = (i2++);               //ctrl+alt+l自动对齐所有代码
        System.out.print("i=" + i);  //print是不换行输出
        System.out.println(" i2=" + i2);   //println换行输出
        i = (++i2);
        System.out.print("i=" + i);
        System.out.println(" i2=" + i2);
        i = (--i1);
        System.out.print("i=" + i);
        System.out.println(" i1=" + i1);
        i = (i1--);
        System.out.print("i=" + i);
        System.out.println(" i1=" + i1);
    }
}
