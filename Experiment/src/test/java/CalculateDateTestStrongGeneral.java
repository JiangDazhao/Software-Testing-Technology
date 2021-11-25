import org.junit.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class CalculateDateTestStrongGeneral {
    private static CalculateDate calDate = new CalculateDate();
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
        System.out.println("�ò���������ʼ");
    }
    @After
    public void tearDown() throws Exception {
        System.out.println("�ò�����������");
    }
    @Ignore
    public void multiple() {
        fail("Not yet implemented");
    }
}