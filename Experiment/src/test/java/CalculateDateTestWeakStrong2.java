import org.junit.*;

import static org.junit.Assert.assertEquals;


public class CalculateDateTestWeakStrong2 {
    private static CalculateDate2 calDate = new CalculateDate2();
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
        System.out.println("该测试用例开始");
    }
    @After
    public void tearDown() throws Exception {
        System.out.println("该测试用例结束");
    }
    @Test
    public void findday_1() {
        calDate.findDay(1999,1,13);
        assertEquals(3,calDate.getFindday());
    }
    @Test
    public void findday_2() {
        calDate.findDay(1998,4,28);
        assertEquals(2,calDate.getFindday());
    }
    @Test
    public void findday_3() {
        calDate.findDay(2000,2,29);
        assertEquals(2,calDate.getFindday());
    }
    @Test
    public void findday_4() {
        calDate.findDay(2001,12,30);
        assertEquals(0,calDate.getFindday());
    }
    @Test
    public void findday_5() {
        calDate.findDay(2017,3,31);
        assertEquals(5,calDate.getFindday());
    }
    @Test
    public void findday_6() {
        calDate.findDay(-1,1,13);
        assertEquals(-1,calDate.getFindday());
    }
    @Test
    public void findday_7() {
        calDate.findDay(2016.1,1,13);
        assertEquals(-1,calDate.getFindday());
    }
    @Test
    public void findday_8() {
        calDate.findDay(1999,0,13);
        assertEquals(-2,calDate.getFindday());
    }
    @Test
    public void findday_9() {
        calDate.findDay(1999,13,13);
        assertEquals(-2,calDate.getFindday());
    }
    @Test
    public void findday_10() {
        calDate.findDay(1999,1.1,13);
        assertEquals(-2,calDate.getFindday());
    }
    @Test
    public void findday_11() {
        calDate.findDay(1999,1,0);
        assertEquals(-3,calDate.getFindday());
    }
    @Test
    public void findday_12() {
        calDate.findDay(1999,1,1.1);
        assertEquals(-3,calDate.getFindday());
    }
    @Test
    public void findday_13() {
        calDate.findDay(1999,11,32);
        assertEquals(-3,calDate.getFindday());
    }
}