package sevenLab;

import java.util.ArrayList;

public class SevenLab {
    public static void main(String[] args) {

        ArrayList<String> movies = new ArrayList<String>();
        movies.add("Человек Дождя");
        movies.add("Дюна");
        movies.add("Джентльмены");

        System.out.printf("В списке %d элемента \n", movies.size());
        for (String out : movies) {
            System.out.println(out);
        }
        System.out.println("   ");
        movies.remove(1);
        for (String out : movies) {
            System.out.println(out);
        }
        System.out.println("   ");
        movies.set(0,"Области Тьмы");
        for (String out : movies) {
            System.out.println(out);
        }
    }
}