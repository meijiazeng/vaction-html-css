/**
 * Created by Administrator on 2017/2/23.
 */
//定义一个点（point）类用来表示三维空间中的点（三个坐标）
//1.0 可以生成具有特定坐标的点对象
//2.0 提供可以设置三个坐标的方法
//3.0 提供可以计算该“点”距原点距离平方的方法
//4.0 编写程序验证上诉三条
class Point{         // 定义一个类 （Point）
    double x, y, z;     // 定义三个成员变量（三个坐标）
     Point(double _x,double _y,double _z) {   //构造方法（可以生成对象）
        x = _x;
        y = _y;
        z = _z;
    }
    void setX(double _x){   //设置三个坐标的方法
        x = _x;
    }
    void setY(double _y){  //设置三个坐标的方法
        y = _y;
    }
    void setZ(double _z){  //设置三个坐标的方法
        z = _z;
    }
    double getDistance(Point p){   //new当前点的对象对某个点对象调用这个方法
        return (x - p.x)* (x - p.x)+(y - p.y)*(y - p.y)+(z - p.z)*(z - p.z);
        //当前点的x减去p点上的x
    }
}
public class TestPoint {
    public static void main(String[] args) {  //入口函数
        Point  p = new Point(1.0,2.0,3.0);  //
        Point p1 = new Point (0.0,0.0,0.0); //原点
        System.out.println(p.getDistance(p1));//当前点到p点的平方距离

        p.setX(5.0); //重新设置x的坐标  最后坐标为（5.0，2.0,3.0）
        System.out.println(p.getDistance(new Point (1.0,1.0,1.0)));
        //重新计算到点的平方
       // 直接把 new Point (1.0,1.0,1.0,)的引用传给p
    }
}
