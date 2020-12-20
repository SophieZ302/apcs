/**
 * Created by Sophie Zhang on 12/13/20.
 */
public class MyComplex {
    private double real;
    private double img;

    public MyComplex(double real, double img) {
        this.real = real;
        this.img = img;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MyComplex{");
        sb.append("real=").append(real);
        sb.append(", img=").append(img);
        sb.append('}');
        return sb.toString();
    }

    public static MyComplex addNew (MyComplex a , MyComplex b) {
        return new MyComplex( a.real + b.real, a.img + b.img);
    }
}
