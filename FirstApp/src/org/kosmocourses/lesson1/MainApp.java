package org.kosmocourses.lesson1;

public class MainApp {
    public static String runProgram(String name) {
        return ("Я - " + name + " обязуюсь:\n"
                + "\t - прилежно комментировать свой код,\n"
                + "\t - не использовать goto,\n"
                + "\t - следить за состоянием потоков своих программ,\n"
                + "\t - контролировать выделение памяти.\n"
                + "Я обязуюсь не оставлять мусора в системе\n"
                + "и избегать однобуквенных переменных.\n"
                + "    |   |   |   |   |   |   |   |   Ресет."
        );
    }



    public static void main(String[] args) {
        String name = "Oleg";
        System.out.println(runProgram(name));

    }
}
