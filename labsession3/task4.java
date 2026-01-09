package labsession3;

class Box {
    double width;
    double height;
    double depth;

    Box() {
        this.width = 1;
        this.height = 1;
        this.depth = 1;
    }

    Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    double volume() {
        return width * height * depth;
    }

    double getSurfaceArea() {
        return 2 * (width * height + height * depth + depth * width);
    }

    boolean isEqual(Box otherBox) {
        return this.width == otherBox.width && this.height == otherBox.height && this.depth == otherBox.depth;
    }
}

class task4 {
    public static void main(String[] args) {

        // objects using default constructor
        Box box1 = new Box();
        Box box2 = new Box();

        // objects using parameterized constructor
        Box box3 = new Box(2, 3, 4);
        Box box4 = new Box(2, 3, 4);
        Box box5 = new Box(5, 6, 7);

        // volume method
        System.out.println("Box1 volume: " + box1.volume());
        System.out.println("Box3 volume: " + box3.volume());

        // getSurfaceArea method
        System.out.println("Box1 surface area: " + box1.getSurfaceArea());
        System.out.println("Box3 surface area: " + box3.getSurfaceArea());

        // isEqual method
        System.out.println("Box1 equals Box2: " + box1.isEqual(box2));
        System.out.println("Box3 equals Box4: " + box3.isEqual(box4));
        System.out.println("Box3 equals Box5: " + box3.isEqual(box5));
    }
}
