/**
 * Created by Administrator on 2017/2/22.
 */
public class Switch语句 {
    public static void main(String[] args) {
        int score = 90;
        int num = score/10;
        switch (num){
            case 9:
                System.out.println("A");
                break;
            case 8:
                System.out.println("B");
                break;
            case 7:
                System.out.println("C");
                break;
            case 6:
                System.out.println("D");
                break;
            case 5:
            case 4:
            case 3:
            case 2:
            case 1:
                System.out.println("dashabi");
                break;
            default:
                System.out.println("error");
        }
    }
}
