/**
 * Created by Administrator on 2017/2/22.
 */
public class 输出101到200内的质数 {
    public static void main(String[] args) {
        int i;
        for (i = 101 ;i < 200; i+=2){
            boolean f =true;
            for (int j =2 ;j < i;j++)
            {
                if (i % j==0)
                    f = false;
                break;
            }
            if (!f) continue;
            System.out.println(" "+i);
        }
    }
}
