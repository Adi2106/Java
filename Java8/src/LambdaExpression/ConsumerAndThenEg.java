package LambdaExpression;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.IntPredicate;
import java.util.function.Supplier;

public class ConsumerAndThenEg {
    public static void main(String[] args) {
        List<Integer> num=Arrays.asList(10,13,12,14,15);
Consumer<List<Integer>> cn=(ls)->{        
        for(int i=0;i<ls.size();i++)
        {
            ls.set(i, ls.get(i)+10);        
        }
        };
Consumer<List<Integer>> cn1=(ls)->{
    for(Object o:ls)
    System.out.println(o);
    
};
cn.andThen(cn1).accept(num);
    }
}