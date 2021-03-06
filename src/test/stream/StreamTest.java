package test.stream;


import main.stream.Product;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;


/**
 * 1. productList 생성
 * 2. 번호,이름,가격
 * 3. 30000원 이상만 출력
 * 4. 총 가격 구하기
 * 5. 최대, 최소 값
 * */

public class StreamTest {

    private List<Product> productList = new ArrayList<>();

    @Before
    public void setUp(){
        productList.add(new Product(1, "HP Laptop", 25000f));
        productList.add(new Product(2, "Dell Laptop", 30000f));
        productList.add(new Product(3, "Lenevo Laptop", 28000f));
        productList.add(new Product(4, "Sony Laptop", 28000f));
        productList.add(new Product(5, "Apple Laptop", 90000f));
    }

    @Test
    public void testMakeStream(){

        List < String > fruits = new ArrayList <String> ();
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Orange");

        fruits.stream().sorted((f1,f2) -> f1.compareTo(f2)).forEach(p -> System.out.print(p + " "));

        List<String> orderedFruits = fruits.stream().sorted((o1,o2) -> o1.compareTo(o2)).collect(Collectors.toList());
        System.out.println(orderedFruits);

    }


    @Test
    public void testStreamForeach(){
        productList.stream().filter(product -> product.getPrice()>=30000f).forEach(product -> System.out.println(product.getName()));
    }

    @Test
    public void testStreamMap(){
        List<String> answerList = productList.stream().filter(product -> product.getPrice()>=30000f).map(product -> product.getName()).collect(Collectors.toList());
        System.out.println(answerList);
    }

    @Test
    public void sumOfProductPrice(){
        double sumOfPrice = productList.stream().collect(Collectors.summingDouble(Product::getPrice));
        System.out.println(sumOfPrice);
    }

    @Test
    public void testGetMax(){
        Product product = productList.stream().max((p1, p2) -> p1.getPrice() > p2.getPrice() ? 1 : -1).get();
        System.out.println(product.getPrice());
    }


}
