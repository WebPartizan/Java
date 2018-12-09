public class VivalaJava {
    public static String printString (){
        String text = "Vive la Java!";
        char one = text.charAt(0);
        char last_ = text.charAt(text.length()-2);
        String substr = text.substring(8,12);
        return (text + "\n" + text.length() + "\n" + one + " " + last_ + "\n" + substr);
    }
    public static void main(String[] args) {
        System.out.println(printString());
    }
}
