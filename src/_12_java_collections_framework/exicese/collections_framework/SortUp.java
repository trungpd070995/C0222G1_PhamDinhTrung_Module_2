package _12_java_collections_framework.exicese.collections_framework;

import java.util.Comparator;

public class SortUp implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {

        return (int) (o1.getPrice() - o2.getPrice());
    }
}