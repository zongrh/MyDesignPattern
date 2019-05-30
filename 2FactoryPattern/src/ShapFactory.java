/**
 * FileName: ShapFactory
 * Author: nanzong
 * Date: 2019/5/29 6:10 PM
 * Description:
 * History:
 */
public class ShapFactory {
    public Shape getShape(String shapType) {
        if (shapType == null) {
            return null;
        }
        if (shapType.equalsIgnoreCase("circle")) {
            return new Circle();
        } else if (shapType.equalsIgnoreCase("Rectangle")) {
            return new Rectangle();
        } else if (shapType.equalsIgnoreCase("square")) {
            return new Square();
        }
        return null;
    }
}
