public class UltimateQuestion {
    public static String Question(String answer){
        return ("The Ultimate Question of Life, the Universe, and Everything?\n"
                + "Answer: "
                +  answer
                + ".");
    }

    public static void main(String[] args) {
        String answer = "42";
        System.out.println(Question(answer));
    }
}
