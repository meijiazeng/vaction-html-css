/**
 * Created by Administrator on 2017/2/22.
 */
public class 前五个能被3整除的数100内 {
    public static void main(String[] args) {
        int num = 0,i = 1;
        while (i<=100){
            if(i % 3 == 0)
            {
                System.out.println("i= "+i);
                num++;
            }
            if (num == 5)
            {
                break;
            }
            i++;
        }
    }
}
