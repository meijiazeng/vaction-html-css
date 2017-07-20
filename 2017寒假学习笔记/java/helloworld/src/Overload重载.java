/**
 * Created by Administrator on 2017/2/23.
 */
//重载 1.0 名字相同 2.0 参数不同（类型不同，个数不同）
public class Overload重载 {
    void max (int a, int b){
        System.out.println(a > b ? a : b);
    }
    void max (float a, float b){
        System.out.println(a > b ? a : b);
    }
    public static void main(String[] args) {
        Overload重载 t = new Overload重载();
        t.max(3,4);
    }


}
