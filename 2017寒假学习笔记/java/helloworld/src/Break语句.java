/**
 * Created by Administrator on 2017/2/22.
 */
public class Break语句 {
    public static void main(String[] args) {
        int stop = 4;
        for (int i = 1;i <= 10;i++)
        {
            if (i == stop)
                break;
            System.out.println(" i=" +i);
        }
    }
}
