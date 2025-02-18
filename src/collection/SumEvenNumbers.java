package collection;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class SumEvenNumbers {

    public static void main(String[] args) {
        int[] nums = {3,56,43,8,4,92,1};

        Consumer consumer = new Consumer<>() {
            @Override
            public void accept(Object o) {
                System.out.println(o);
            }
        };
        Predicate predicate = new Predicate() {
            @Override
            public boolean test(Object o) {
                return false;
            }
        };
        Function function = new Function() {
            @Override
            public Object apply(Object o) {
                return null;
            }
        };
        System.out.println(Arrays.stream(nums).filter(i->i%2==0).reduce(0,(i,j)->i+j));
    }
}
