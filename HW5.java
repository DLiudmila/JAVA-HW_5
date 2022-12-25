import java.util.*;

public class HW5 {
    static Map<Integer, String> keys = new HashMap<>();
    final static String PRINT_TEMPLATE = "%s. %s%n";

    public static void main(String[] args) {
        keys.put(1, "Иванов Иван Иванович 28 м");
        keys.put(2, "Петрова Петра Петровна 27 ж");
        keys.put(3, "Сидоров Сидр Сидорович 29 м");
        keys.put(4, "Прокопов Прокоп Уктопович 90 м");
        keys.put(5, "Романова Анна Иоановна 265 ж");

        System.out.println("Коллекция с изменённым сокращением \"пол\":");
        keys.replaceAll(
                (k, v) -> v.substring(0, v.length() - 1) + String.valueOf(v.charAt(v.length()-1)).toUpperCase()
        );
        keys.forEach((k, v) -> System.out.printf(PRINT_TEMPLATE, k, v));
        System.out.println();

        System.out.println("Имя и инициалы:");
        keys.values().forEach(person -> {
            String[] s = person.split(" ");
            System.out.printf("%s %s.%s.%n", s[0], s[1].toUpperCase().charAt(0), s[2].toUpperCase().charAt(0));
        });

    }
}
