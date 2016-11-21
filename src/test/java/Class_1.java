import org.junit.*;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.junit.runners.Parameterized;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@Category(SlowTests.class)
public class Class_1 {


    private Mathematics rez = new Mathematics();

    @BeforeClass
    public void setUpClass() {
        rez.setResult(0);
    }

    @Before
    public void setUpTest(){
        rez.setResult(0);
    }

    @After
    public void tearDownTest(){
        rez.setResult(0);
    }

    @Category(FastTests.class)
    @Test
    public void deduct() {
        rez.setResult(1);
        rez.deduct(4, 1);
        assertEquals(3, rez.getResult());
    }

    @Test(timeout = 1)
    public void add() throws InterruptedException {
        Thread.sleep(1000);
        rez.add(20, 80);
        assertEquals(100, rez.getResult());
    }

    @Test
    public void multiply() {
        rez.multiply(2, 2);
        assertEquals(4, rez.getResult());
    }

    @Test
    public void divide() {
        rez.divide(6,3);
        assertEquals(2, rez.getResult());
    }

    @Test(expected = ArithmeticException.class)//check division by zeroarith
    public void divByZero() {
        rez.divide(1, 0);
    }

    @AfterClass
    public static void tearDownClass() {
    }
}