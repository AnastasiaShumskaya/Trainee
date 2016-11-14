import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.testng.annotations.BeforeClass;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

/**
 * Created by AnastasiaShumskaya on 11/11/2016.
 */
@RunWith(Parameterized.class)
public class Class_Parametrized {

    @Parameterized.Parameters
    public static Iterable<Object[]> dataSet() {
        return Arrays.asList(new Object[][] {
                { 1, 7 },
                { 2, 3 },
                { 3, 0 },
                { 4, -1}
        });
    }
    private int x;
    private int y;

    public Class_Parametrized(int x, int y){
        this.x = x;
        this.y = y;
    }
    Mathematics rez = new Mathematics();

    @BeforeClass
    public void setUpClass(){
        Mathematics rez = new Mathematics();
        rez.setResult(1);
    }

    @Before
    public void setUpTest(){
        rez.setResult(0);
    }

    @After
    public void tearDownTest(){
        rez.setResult(0);
    }

    @Test
    public void testAddDDT() {
        rez.add(x,y);
        assertEquals(x+y, rez.getResult());
    }
    @Test
    public void testDeductDDT() {
        rez.setResult(1);
        rez.deduct(x, y);
        assertEquals(x-y, rez.getResult());
    }

    @Test
    public void testMultiplyDDT() {
        rez.multiply(x, y);
        assertEquals(x*y, rez.getResult());
    }

    @Test(expected = Exception.class)
    public void testDivideDDT() {
        rez.divide(x,y);
        assertEquals(x/y, rez.getResult());
    }

    @AfterClass
    public static void tearDownClass() {

    }

}