import java.text.DecimalFormat;

public class NumberPi {
    public static void main(String[] args) {
        double NumPI = Math.PI;
        DecimalFormat twoDForm = new DecimalFormat("0.00");
        double NewPI = Double.valueOf(twoDForm.format(NumPI));
        System.out.println(NewPI);
    }
}
