public class AbsRectangle  extends Absshape{
    double length, width;
    AbsRectangle(double length,double width){
        this.length = length;
        this.width = width;
    }
    @Override
    double calculateArea() {
        return length * width;
    }
}
