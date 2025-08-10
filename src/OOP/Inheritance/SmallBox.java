package OOP.Inheritance;

public class SmallBox extends Box{
    double weight;
    SmallBox(){
        this.weight=-1;
    }

    public SmallBox(double l, double w, double h, double weight) {
        super(l, w, h);//used to call all the parent class parameter
        this.weight = weight;
    }
}
