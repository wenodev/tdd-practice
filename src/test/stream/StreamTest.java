package test.stream;

import main.stream.Product;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * 1. productList 생성
 * 2. 번호,이름,가격
 * 3. 30000원 이상만 출력
 * */

public class StreamTest {

    private List<Product> productsList = new ArrayList<>();

    @Before
    public void setUp(){
        productsList.add(new Product(1, "HP Laptop", 25000));
        productsList.add(new Product(2, "Dell Laptop", 30000));
        productsList.add(new Product(3, "Lenevo Laptop", 28000));
        productsList.add(new Product(4, "Sony Laptop", 28000));
        productsList.add(new Product(5, "Apple Laptop", 90000));
    }

   @Test
    public void testWithoutStream(){
       for (Product product : productsList){
           if (product.getPrice() >= 30000){
               System.out.println(product.getPrice());
           }
       }
    }

    @Test
    public void testWithStream(){
        productsList.stream().filter(product -> product.getPrice()>=30000).forEach(product -> System.out.println(product.getPrice()));
    }




}
