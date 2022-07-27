package Day_6;

class Rectangle {
    private int length, width;

    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int calculate() {
        int area = (length * width);
        return area;
    }
}

public class Area {
    public static void main(String[] args) {
        Rectangle area = new Rectangle();
        area.setLength(20);
        area.setWidth(9);
        System.out.println("Area of Rectangle is : "+area.calculate());
    }
}

//Output
//
//        Area of Rectangle is : 180