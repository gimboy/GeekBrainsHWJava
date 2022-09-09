//Напишите функцию, для поиска наиболее длинного общего префикса, среди массива строк.
// Если общего префикса нет, то возвращать пустую строку
//Пример ["aabb", "aabbb", "aaabb"] - ответ "aa"

public class Second {

    public static void main(String[] args) {
        String[] str = {"aabb", "aabbb", "aababb"};
        findPrefix2(str);

    }

    public static void findPrefix2(String[] str) {
        StringBuilder prefix = new StringBuilder();

        for (int j = 0; j < str[0].length(); j++) {
            if (str[0].charAt(j) == str[1].charAt(j) && str[0].charAt(j) == str[2].charAt(j))
                prefix.append(str[0].charAt(j));
            else break;
        }
        System.out.println(prefix);
    }
}
