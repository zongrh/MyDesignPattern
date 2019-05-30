/**
 * FileName: ShapeFactory
 * Author: nanzong
 * Date: 2019/5/29 8:58 PM
 * Description:
 * History:
 */
public class ShapeFactory extends AbstractFactory {


    @Override
    public Shape getShape(String shape) {
        if (shape == null) {
            return null;
        }
        if (shape.equalsIgnoreCase("circle")) {
            return new Circle();
        } else if (shape.equalsIgnoreCase("square")) {
            return new Square();
        } else if (shape.equalsIgnoreCase("rectangle")) {
            return new Rectangle();
        }
        return null;
    }

    @Override
    public Color getColor(String color) {
        return null;
    }
}
