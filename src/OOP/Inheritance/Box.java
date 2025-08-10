package OOP.Inheritance;

public class Box {
    double l ;
    double w;
    double h;
    Box(){
        this.l = -1 ;
        this.w = -1;
        this.h = -1;
    }
    Box (double size){
        double l= size;
        double w = size;
        double h = size;

    }

    Box(double l,double w,double h){
        this.l= l;
        this.w = w;
        this.h = h;
    }
    Box(Box old){
        this.h = old.h;
        this.w = old.w;
        this.l = old.l;
    }
}
