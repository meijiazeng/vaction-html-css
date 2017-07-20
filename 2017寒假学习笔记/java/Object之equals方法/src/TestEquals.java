/**
 * Created by Administrator on 2017/3/1.
 */
public class TestEquals {
    public static void main(String[] args){
        Dog c1 = new Dog();
        Dog c2 = new Dog();
         System.out.println(c1 == c2);
    }

}
class Dog{
    int color;
    int height,weight;
}
