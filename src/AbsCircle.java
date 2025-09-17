public class AbsCircle extends Absshape {
    double radius;
    AbsCircle(double radius){
        this.radius =radius;
    }
    @Override
    double calculateArea() {
        return  Math.PI * radius * radius;
    }
}
