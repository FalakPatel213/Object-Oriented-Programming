import java.util.*;

public class TestArrayList {
    public static void main(String[] args) {
        ArrayList <String> cityList = new ArrayList<>();
        cityList.add("London");
        cityList.add("Denver");
        cityList.add("Paris");
        cityList.add("Miami");
        cityList.add("Seoul");
        cityList.add("Tokyo");
        System.out.println("List size? " + cityList.size());
        System.out.println("Is miami in the list? " + cityList.contains("Miami"));
        System.out.println("The loction of denver : " + cityList.indexOf("Denver"));
        System.out.println("Is the list empty? " + cityList.isEmpty());
        cityList.add(2, "Xian");
        cityList.remove("Miami");
        cityList.remove(1);
        System.out.println(cityList.toString());
    }
}
