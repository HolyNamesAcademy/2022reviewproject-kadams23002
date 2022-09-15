
public class ShapeMaker {
    /**
     * Returns a string that looks like a square with sides of size "size". If size = 5, the square looks like this:
     * 
     *     * * * * *
     *     * * * * *
     *     * * * * *
     *     * * * * *
     *     * * * * *
     *
     * @param size length of side
     * @return a string that looks like the shape above when printed
     */
    public static String PrintSquare(int size)
    {
        String str = "";
        for (int i = 0; i < size; i++){
            for (int x = 0; x < size; x++){
                str += "* ";
            }
            str += "\n";
        }
        return str;
    }

    /**
     * Returns a string that looks like a rectangle with sides of size "length" and "width. If length = 5, width = 4 the rectangle looks like this:
     * 
     *     * * * * *
     *     * * * * *
     *     * * * * *
     *     * * * * *
     *
     * @param length the width of the rectangle
     * @param height the height of the rectangle
     * @return a string that looks like the shape above when printed
     */
    public static String PrintRectangle(int length, int height)
    {
        String str = "";
        for (int i = 0; i < height; i++){
            for (int x = 0; x < length; x++){
                str += "* ";
            }
            str += "\n";
        }
        // write your code here
        return str;
    }

    /**
     * Returns a string that looks like a right triangle with sides of size "size". If size = 5, the triangle looks like this:
     * 
     *     *
     *     * *
     *     * * *
     *     * * * *
     *     * * * * *
     *
     * @param height the height of the triangle
     * @return a string that looks like the shape above when printed
     */
    public static String PrintRightTriangle(int height)
    {
        String str = "";
        for (int i = 1; i <= height; i++){
            for (int x = 0; x < i; x++){
                str += "* ";
            }
            str += "\n";
        }
        return str;
    }

    /**
     * Returns a string that looks like an inverted right triangle with sides of size "size". If size = 5, the triangle looks like this:
     * 
     *     * * * * *
     *     * * * *
     *     * * *
     *     * *
     *     *
     *
     * @param height the height of the triangle
     * @return a string that looks like the shape above when printed
     */
    public static String PrintInvertedRightTriangle(int height)
    {
        String str = "";
        for (int i = height; i > 0; i--){
            for (int x = i; x > 0; x--){
                str += "* ";
            }
            str += "\n";
        }
        // write your code here
        return str;
    }

    /**
     * Returns a string that looks like a backwards right triangle with sides of size "size". If size = 5, the triangle looks like this:
     * 
     *             *
     *           * *
     *         * * *
     *       * * * *
     *     * * * * *
     *
     * @param height the height of the triangle
     * @return a string that looks like the shape above when printed
     */

    public static String PrintBackwardsRightTriangle(int height)
    {
        String str = "";

        return str;
    }

    /**
     * Returns a string that looks like an equilateral triangle with sides of size "size". If size = 5, the triangle looks like this:
     * 
     *         *
     *        * *
     *       * * *
     *      * * * *
     *     * * * * *
     *
     * @param height the height of the triangle
     * @return a string that looks like the shape above when printed
     */
    public static String PrintEquilateralTriangle(int height)
    {
        if (height == 0){
            return "";
        }
        String str = "";
        int space;
        for (int i = 1; i <= height; i++){
            space = (height/2) - i;
            for (int x = space; x > 0; x--){
                str += "  ";
            }
            for (int star = i; star <= height; star++){
                str += "* ";
            }
            for (int y = space; y > 0; y--){
                str += "  ";
            }
            str += "\n";
        }
        return str;
    }
}
