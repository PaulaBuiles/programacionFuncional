package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.function.*;

public class CollectionUtils {

    public static <T> List<T> punto1 (Supplier<T> supplier, Integer contador) {
        List<T> resultList = new ArrayList<>();
        for (int i = 0; i < contador; i++) {
            resultList.add(supplier.get());
        }
        return resultList;
    }

    public static <T,R> List<R> punto2 (List<T> list, Function<T,R> transformList) {
        List<R> resultList = new ArrayList<>();
        for (T t : list) {
            resultList.add(transformList.apply(t));
        }
        return resultList;
    }

    public static <T> void punto3 (List<T> list, Consumer<T> consumer){
        for (T t : list) {
            consumer.accept(t);
        }
    }

    public static <T> List<T> punto4 (List<T> list, Predicate<T> predicateFilter){
        List<T> resultList = new ArrayList<>();
        for (T t : list) {
            if (predicateFilter.test(t)){
                resultList.add(t);
            }
        }
        return resultList;
    }

    public static <T> T punto5 (List<T> list, BinaryOperator<T> operatorAdd){
        return list.stream()
                .reduce(operatorAdd)
                .get();
    }
}
