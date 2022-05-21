public class myRect {

    private int width;
    private int height;

    public myRect(){
        width = 1;
        height = 1;
    }

    public myRect(int length)
    {
        width = length;
        height = length;
    }

    public myRect(int width, int height)
    {
        this.width = width;
        this.height = height;
    }

    public int getWidth()
    {
        return width;
    }

    public int getHeight()
    {
        return height;
    }

    public int perimeter()
    {
        return 2 * (height + width);
    }

    public int area()
    {
        return height * width;
    }

    public String toString()
    {
        String s = "a ";
        s += width;
        s += "x";
        s += height;
        s += " rectangle";
        return s;
    }

    public static void main(String[] args)
    {
        myRect rect1 = new myRect();
        myRect rect2 = new myRect(5);
        myRect rect3 = new myRect(3, 4);

        System.out.println(rect1.getWidth());
        System.out.println(rect2.area());
        System.out.println(rect3);
    }



}
