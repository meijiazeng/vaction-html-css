/**
 * Created by Administrator on 2017/2/24.
 */
// 1.0 类方法定义使用thid关键字代表使用该方法的对象的引用
    //2.0 this可以处理方法中成员变量和参数重名的情况
    //3.0 this可以看作一个变量，它的值就是当前对象的引用
public class Leaf {
    int i = 0;    //成员变量
    Leaf (int i)  { this.i = i; }//就近原则 i=形参
    // this（指向自己的变量）  因为  引用. 所以this.i=（成员变量）
    Leaf increament(){
        i++;
        return this;  //自身的类型 指向Leaf的引用  就是this
    }
    void print(){ System.out.println("i = "+i);}
    public static void main(String[] args) {
        Leaf leaf = new Leaf(100);   //调用Leaf方法 i=100 this.i=100
        leaf.increament().increament().print();
        //left调用increament i=101  再次调用increament i=102
    }
}
