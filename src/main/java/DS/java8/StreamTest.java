package DS.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamTest {
    public static void main(String[] args) {

        List<Integer> list= Arrays.asList(12,34,1,8,6,10,7,3);
        //
        Predicate<Integer> prid=p->p%2!=0;
        //intermediate operation map,filter,sorted
        //Comparator.comparing(n->n).thenComparing()
        list.stream().filter(prid).sorted(Comparator.comparing(n->n)).map(n->n*2).forEach(
                n->{
                    //System.out.print(n+" ,");
                }
        );

        System.out.println("-------");

        List<Integer> list1=Arrays.asList(3,1,2,42,5);
        //terminal operation (collect,foreach,reduce)
        int test=list1.stream().reduce(0,(ans,i)->ans+i);
        System.out.println("reduce :-  "+test);

        BiConsumer<Integer, Integer> addTwo = (x, y) ->System.out.println(x+y);
        addTwo.accept(1, 2);
        Consumer<Integer> consumer=(x)->System.out.println(x);
        consumer.accept(56);
        System.out.println("map--collect");
        Set<Integer> set=list1.stream().collect(Collectors.toSet());
        set.stream().map(n->n+" ,").forEach(System.out::print);

    }
}
