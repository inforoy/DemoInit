package demo.test;

import org.junit.Assert;
import org.junit.Test;

public class TestDemo {
    
    @Test
    public void testDemoInit(){
        String cadena = "Roy";

        Assert.assertEquals(cadena, "Roy");
    }
}
