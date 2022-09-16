package pages;

import com.google.common.base.CharMatcher;

public class TEmpPage {
    public static void main(String[] args) {
        String s = "Результатов: примерно 102 000 000 (0,37 сек.)   S";
        String itemstr = CharMatcher.DIGIT.retainFrom(s);
        long i = Long.parseLong(itemstr);
        System.out.println(i);
    }

}
