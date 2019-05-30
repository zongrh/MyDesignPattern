/**
 * FileName: ShapeFactory
 * Author: nanzong
 * Date: 2019/5/30 4:23 PM
 * Description:
 * History:
 */
public class ShapeFactory {

    public Shape getShape(String shapeType) {
        if (shapeType.equalsIgnoreCase("circle")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("square")) {
            return new Square();
        } else if (shapeType.equalsIgnoreCase("rectangle")) {
            return new Rectangle();
        }
        return null;
    }

}
