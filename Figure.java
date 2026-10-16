class Figure {
    protected int x;
    protected int y;
    protected int color;
    protected static int count = 0;

    public Figure(int x, int y, int color) {
        this.x = x;
        this.y = y;
        this.color = color;
        count++;
    }

    public static int getCount() {
        return count;
    }

    public void draw() {
        System.out.println("Figure at (" + x + ", " + y + "), color " + color);
    }
}

class Square extends Figure {
    private int side;

    public Square(int x, int y, int color, int side) {
        super(x, y, color);
        this.side = side;
    }

    public void draw() {
        for (int i = 0; i < side; i++) {
            for (int j = 0; j < side; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

class Rectangle extends Figure {
    private int width;
    private int height;

    public Rectangle(int x, int y, int color, int width, int height) {
        super(x, y, color);
        this.width = width;
        this.height = height;
    }

    public void draw() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Figure f = new Figure(0, 0, 1);
        Square s = new Square(1, 2, 2, 4);
        Rectangle r = new Rectangle(3, 4, 3, 6, 3);

        f.draw();
        s.draw();
        r.draw();

        System.out.println("Number of instances : " + Figure.getCount());
    }
}
