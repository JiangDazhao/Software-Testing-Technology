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
    public void testFindday_1() {
        CalculateDate2 calDate= new CalculateDate2();
        int day= calDate.findDay(1999,1,13);
        assertEquals(3,day);
    }

    @Test
    public void  testFindday_2() {
        CalculateDate2 calDate= new CalculateDate2();
        int day= calDate.findDay(1998,4,28);
        assertEquals(2,day);
    }

    @Test
    public void  testFindday_3() {
        CalculateDate2 calDate= new CalculateDate2();
        int day= calDate.findDay(2000,2,29);
        assertEquals(2,day);
    }

    @Test
    public void  testFindday_4() {
        CalculateDate2 calDate= new CalculateDate2();
        int day= calDate.findDay(2001,12,30);
        assertEquals(0,day);
    }

    @Test
    public void  testFindday_5() {
        CalculateDate2 calDate= new CalculateDate2();
        int day= calDate.findDay(2017,3,31);
        assertEquals(5,day);
    }

    @Test
    public void  testFindday_6() {
        CalculateDate2 calDate= new CalculateDate2();
        int day= calDate.findDay(-1,1,13);
        assertEquals(-1,day);
    }

    @Test
    public void  testFindday_7() {
        CalculateDate2 calDate= new CalculateDate2();
        int day= calDate.findDay(2016.1,1,13);
        assertEquals(-1,day);
    }

    @Test
    public void  testFindday_8() {
        CalculateDate2 calDate= new CalculateDate2();
        int day= calDate.findDay(1999,0,13);
        assertEquals(-1,day);
    }

    @Test
    public void  testFindday_9() {
        CalculateDate2 calDate= new CalculateDate2();
        int day= calDate.findDay(1999,13,13);
        assertEquals(-1,day);
    }

    @Test
    public void  testFindday_10() {
        CalculateDate2 calDate= new CalculateDate2();
        int day= calDate.findDay(1999,1.1,13);
        assertEquals(-1,day);
    }

    @Test
    public void  testFindday_11() {
        CalculateDate2 calDate= new CalculateDate2();
        int day= calDate.findDay(1999,1,0);
        assertEquals(-1,day);
    }

    @Test
    public void  testFindday_12() {
        CalculateDate2 calDate= new CalculateDate2();
        int day= calDate.findDay(1999,1,1.1);
        assertEquals(-1,day);
    }

    @Test
    public void  testFindday_13() {
        CalculateDate2 calDate= new CalculateDate2();
        int day= calDate.findDay(1999,11,32);
        assertEquals(-1,day);
    }
}