import java.time.temporal.WeekFields;

public class Running extends Shoe{
    public final double weight; // instance variable

    public Running(String brand, double size, double weight){
        super(brand, size); // creates/sets the shoe
        this.weight = weight;
    }

}
