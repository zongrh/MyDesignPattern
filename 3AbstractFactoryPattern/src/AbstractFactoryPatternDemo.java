/**
 * FileName: AbstractFactoryPatternDemo
 * Author: nanzong
 * Date: 2019/5/29 9:05 PM
 * Description:
 * History:
 */
public class AbstractFactoryPatternDemo {

    public static void main(String[] args) {

//        获取形状工厂
        AbstractFactory shapeFactory = FactoryProducer.getFactory("shape");

//        获取形状为Circle的对象
        Shape shape1 = shapeFactory.getShape("circle");

//        调用Circle 的draw 方法
        shape1.draw();

//        获取形状为Rectangle的对象
        Shape shape2 = shapeFactory.getShape("rectangle");

//        调用Rectangle的draw 方法
        shape2.draw();

//        获取形状为Circle的对象
        Shape shape3 = shapeFactory.getShape("square");

//        调用Square的 draw 方法
        shape3.draw();


//        获取颜色工厂
        AbstractFactory colorFactory = FactoryProducer.getFactory("color");

//        获取颜色为 red 的对象
        Color color = colorFactory.getColor("red");

//        调用red de fill 方法
        color.fill();

//        获取颜色为green的 对象
        Color color2 = colorFactory.getColor("green");

//        调用 green的fill方法
        color2.fill();

//        获取颜色为blue的对象
        Color color3 = colorFactory.getColor("blue");

//        调用blue的fill方法
        color3.fill();

    }

}


