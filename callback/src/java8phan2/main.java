package java8phan2;

import java.awt.image.AreaAveragingScaleFilter;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.OptionalInt;
import java.util.function.*;

public class main {
    public static void main(String[] args) {
       /* LocalDate localDate = LocalDate.now();
        LocalDate nextDate = localDate.plusDays(3);
        LocalDate prevDate = localDate.minusDays(5);
        System.out.println(localDate.toString());
        System.out.println(nextDate);
        System.out.println(prevDate);*/


        /*Function<String,Integer> function = Integer::parseInt; // chuyen doi kieu
        Consumer<String> consumer = System.out::println; // tieu thu
        Predicate<String> t = String::isEmpty;
        BiConsumer<String,Integer> biConsumer = System.out::printf;
        System.out.println(function.apply("12"));
        consumer.accept("truong trai thang");
        System.out.println(t.test("a"));
        biConsumer.accept("Truong",20);
        BiPredicate<String,String> biPredicate = String::equals;
        System.out.println(biPredicate.test("truaong","truong"));*/

        int a[] = new int[]{1,8,3,4,5,4,6};
//        Arrays.stream(a).filter(s->s>3).forEach(System.out::println);
//        Arrays.stream(a).filter(s->s>2).map(s->s*3).forEach(System.out::println);
        Arrays.stream(a).sorted().forEach(System.out::println);
        OptionalInt res = Arrays.stream(a).filter(s->s==8).findFirst();
        System.out.println(res.getAsInt());
        int max = Arrays.stream(a).max().getAsInt();
        System.out.println(max);
        int min = Arrays.stream(a).min().getAsInt();
        System.out.println(min);
        int sum = Arrays.stream(a).sum();
        System.out.println(sum);
    }
}
