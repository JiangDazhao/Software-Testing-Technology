import java.util.Scanner;

public class CalculateDate1 {
    public double year=0;
    public double month=0;
    public double day=0;

    public int getFindday() {
        return findday;
    }

    int findday=0;

    public int findDay(int year,int month,int day)
    {
        int leapYear=0;
        int noLeapYear=0;
        int days_1=0;
        int days_2=0;
        int days=0;

        //判断第1年到第year-1年中闰年的个数
        int i;
        for (i = 1;i < year;i++) {
            if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0)) {
                leapYear ++;

            } else {
                noLeapYear ++;

            }
        }
        //通过年个数算出总天数
        days_1= leapYear*366+noLeapYear*365;

        //判断第year年中第1月到第month-1月的天数
        int j;
        for (j = 1;j < month;j++) {
            switch (j) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12: days_2 += 31;break;
                case 4:
                case 6:
                case 9:
                case 11:days_2 += 30;break;
                case 2: if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
                    days_2 += 29;
                else
                    days_2 += 28;
                    break;
            }
        }

        //总天数
        days = days_1+days_2+day;

        //计算星期数
        findday=days%7;

        //0:Sunday
        //1:Monday
        //2:Tuesday
        //3:Wednesday
        //4:Thursday
        //5:Friday
        //6:Saturday
        return findday;
    }

}
