import junit.framework.TestCase;

public class JunitTestCaseDemo extends TestCase {

    public JunitTestCaseDemo(String name)
    {
        super(name);
    }

    public void testFindday_1() {
        CalculateDate2 calDate= new CalculateDate2();
        int day= calDate.findDay(1999,1,13);
        assertEquals(3,day);
    }

    public void  testFindday_2() {
        CalculateDate2 calDate= new CalculateDate2();
        int day= calDate.findDay(1998,4,28);
        assertEquals(2,day);
    }

    public void  testFindday_3() {
        CalculateDate2 calDate= new CalculateDate2();
        int day= calDate.findDay(2000,2,29);
        assertEquals(2,day);
    }

    public void  testFindday_4() {
        CalculateDate2 calDate= new CalculateDate2();
        int day= calDate.findDay(2001,12,30);
        assertEquals(0,day);
    }

    public void  testFindday_5() {
        CalculateDate2 calDate= new CalculateDate2();
        int day= calDate.findDay(2017,3,31);
        assertEquals(5,day);
    }

    public void  testFindday_6() {
        CalculateDate2 calDate= new CalculateDate2();
        int day= calDate.findDay(-1,1,13);
        assertEquals(-1,day);
    }

    public void  testFindday_7() {
        CalculateDate2 calDate= new CalculateDate2();
        int day= calDate.findDay(2016.1,1,13);
        assertEquals(-1,day);
    }

    public void  testFindday_8() {
        CalculateDate2 calDate= new CalculateDate2();
        int day= calDate.findDay(1999,0,13);
        assertEquals(-1,day);
    }

    public void  testFindday_9() {
        CalculateDate2 calDate= new CalculateDate2();
        int day= calDate.findDay(1999,13,13);
        assertEquals(-1,day);
    }

    public void  testFindday_10() {
        CalculateDate2 calDate= new CalculateDate2();
        int day= calDate.findDay(1999,1.1,13);
        assertEquals(-1,day);
    }

    public void  testFindday_11() {
        CalculateDate2 calDate= new CalculateDate2();
        int day= calDate.findDay(1999,1,0);
        assertEquals(-1,day);
    }

    public void  testFindday_12() {
        CalculateDate2 calDate= new CalculateDate2();
        int day= calDate.findDay(1999,1,1.1);
        assertEquals(-1,day);
    }

    public void  testFindday_13() {
        CalculateDate2 calDate= new CalculateDate2();
        int day= calDate.findDay(1999,11,32);
        assertEquals(-1,day);
    }
}
