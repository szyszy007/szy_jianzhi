package com.jianZhi.ssh.utils;


import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * @author szy
 */
public class XCollections {

    public static <T> List<T> filter(List<T> list, Predicate<? super T> predicate) {
        return list.stream()
                .filter(predicate)
                .collect(Collectors.toList());
    }

    public static <R, T> List<R> pick(List<T> list, Function<T, R> function) {
        return list.stream()
                .map(function)
                .collect(Collectors.toList());
    }

    public static <K, V> Map<K, V> listToMap(List<V> lists, Function<V, K> kSupplier) {
        return lists
                .stream()
                .collect(Collectors.toMap(kSupplier, e -> e, (oldValue, newValue) -> newValue));
    }

    public static <K, V> Map<K, List<V>> groupBy(List<V> lists, Function<V, K> kSupplier) {
        return lists
                .stream()
                .collect(Collectors.groupingBy(kSupplier));
    }

}
