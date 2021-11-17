import org.junit.*;
import static org.junit.Assert.*;
public class CalculatorTest {
    private static Calculator cal = new Calculator();
    @BeforeClass
    public static void setupBeforClass() throws Exception{
        System.out.println("@BeforeClass");
    }
    @AfterClass
    public static void teardownAfterClass() throws Exception{
        System.out.println("@AfterClass");
    }
    @Before
    public void setUp() throws Exception {
        System.out.println("≤‚ ‘ø™ º");
    }
    @After
    public void tearDown() throws Exception {
        System.out.println("≤‚ ‘Ω· ¯");
    }
    @Test
    public void add() {
        cal.add(2,2);
        assertEquals(4,cal.getResult());
    }
    @Test
    public void subtract() {
        cal.subtract(4,2);
        assertEquals(2,cal.getResult());
    }
    @Ignore
    public void multiple() {
        fail("Not yet implemented");
    }
    @Test(timeout = 2000)
    public void divide() {
        for(;;);
    }
    @Test(expected = ArithmeticException.class)
    public void testDivideByZero(){
        cal.divide(4,0);
    }
}
