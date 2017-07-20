/**
 * Created by Administrator on 2017/2/25.
 */
class T{
    private int i = 0;
            int j = 0;
    protected int k = 0;
    public int m = 0;

    public void m(){
        i = 9;
    }
}
class TT{
    public void m(){
        T t = new T();
        System.out.println(t.j);  //i不可以访问 因为是私有的（private）
        //但是j可以访问  因为protected是同一个包中的类都可以访问
    }
}

public class TestAccess {
}
