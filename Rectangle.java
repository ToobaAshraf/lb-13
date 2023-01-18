package lab2scd;
import java.text.DecimalFormat;
public class Rectangle {  private double length; private double width;
    public Rectangle() {  this(1.0, 1.0);    }
    public Rectangle(double length, double width) {
this.length = verifyValue(length);    this.width = verifyValue(width);    }
    public double getLength() {     return length;    }
    public double getWidth() { return width;   }
    public void setLength(double length) {this.length = verifyValue(length); }
    public void setWidth(double width) {this.width = verifyValue(width);    }
    public double calcPerimeter() {return (length * 2) + (width * 2);    }
    public double calcArea() {   return length * width;   }
    public String toString() {DecimalFormat fmt = new DecimalFormat("#,##0.00");
    return "Length of Rectangle: " + fmt.format(length) + "\nWidth of Rectangle: " +
                fmt.format(width);    }
    private double verifyValue(double value) {
 if (value < 0) {  throw new IllegalArgumentException("Argument is NEGATIVE."); }
 else if (value > 20) {throw new IllegalArgumentException("Argument is Greater than 20.");      }       
 else return value;    }}
