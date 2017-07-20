/**
 * Created by Administrator on 2017/2/22.
 */
public class 求阶层的总和 {
    public static void main(String[] args) {
        long result = 0;
        long l1 = 1;
        for (int i = 1; i <= 10; i++){
            l1 = l1*i;
            result += l1;
        }
        System.out.println("result=" + result);
    }
}
