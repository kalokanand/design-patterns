package collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortNumberBaseOLastDigit {

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(11,90,71,67,43,54);
        Collections.sort(integers, (i, j) -> (i%10)>(j%10)?1:-1);
        integers.forEach(System.out::println);
    }
}
