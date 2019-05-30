/**
 * FileName: FactoryProducer
 * Author: nanzong
 * Date: 2019/5/29 9:03 PM
 * Description:
 * History:
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String choice) {
        if (choice.equalsIgnoreCase("shape")) {
            return new ShapeFactory();
        } else if (choice.equalsIgnoreCase("color")) {
            return new ColorFactory();
        }
        return null;
    }
}
