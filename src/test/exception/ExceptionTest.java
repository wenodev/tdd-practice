package test.exception;

import main.exception.Resource;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ExceptionTest {

    private Resource resource;

    @Before
    public void setUp(){
        resource = new Resource(1);
    }

    @Test
    public void testMakeVar(){
        resource.getId();
    }

    @Test
    public void testCheckId(){
        assertEquals(false, resource.checkId());
    }

    @Test
    public void testMakeResourceManager(){

    }


}
