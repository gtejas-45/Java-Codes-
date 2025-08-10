package OOP.Inheritance;

public class Main {
    public static void main(String[] args) {
        Box box1 = new Box();
        System.out.println(box1.h + " "+ box1.l + " "+box1.w);
        Box box2 = new Box(3);
        System.out.println(box2.h + " "+ box2.l + " "+box2.w);
        Box box3 = new Box(3,4,5);
        System.out.println(box3.h + " "+ box3.l + " "+box3.w);
        Box box4 = new Box(box1);
        System.out.println(box4.h + " "+ box4.l + " "+box4.w);
        SmallBox box5 = new SmallBox();
        System.out.println(box3.h + " "+box5.weight);
    }
}
