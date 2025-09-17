public class AbsTriangle extends Absshape{
    double base, height;
    AbsTriangle(double base, double height){
        this.base = base;
        this.height = height;
    }
    @Override
    double calculateArea() {
        return 0.5 * base * height;
    }
}
