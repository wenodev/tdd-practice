package test.generic;


import main.generic.DemoClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericTest {


    @Test
    public void testGeneric(){
        DemoClass demoClass = new DemoClass(1.0);
        demoClass.getVar();
    }

    @Test
    public void testPrint(){
        DemoClass demoClass = new DemoClass(1);

        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3));

        demoClass.print(list);
        demoClass.printWithWildCard(list);

    }




}
