import java.util.Arrays;

public class Country {

    public static void main(String args[]) {

        String[] countries = { "Poland", "Thailand", "India", "China", "America" };

        Arrays.sort(countries);
        System.out.println(Arrays.toString(countries));
        System.out.println(Arrays.binarySearch(countries, "India"));

    }

}
