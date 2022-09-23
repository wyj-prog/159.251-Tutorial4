package cn.WilliamWu.CI;

import junit.framework.Assert;
import org.junit.jupiter.api.Test;

public class TestCalc {
    @Test
    public void testADD(){
        Assert.assertEquals(2,cn.WilliamWu.CI.Calc.add(1,1));
    }
}
