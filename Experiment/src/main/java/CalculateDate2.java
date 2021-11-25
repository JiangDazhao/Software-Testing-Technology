import java.util.Scanner;

public class CalculateDate2 {
    public double year=0;
    public double month=0;
    public double day=0;
    int findday=0;


    public int getFindday() {
        return findday;
    }

    public int findDay(double year,double month,double day)
    {
        double leapYear=0;
        double noLeapYear=0;
        double days_1=0;
        double days_2=0;
        double days=0;
        //年月日是否越界
        findday=judgeValid(year,month,day);
        if(findday!=0){
            return findday;
        }

        //年月日是否为整数
        findday=judgeInteger(year,month,day);
        if(findday!=0){
            return findday;
        }

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
        findday=(int)days%7;

        //0:Sunday
        //1:Monday
        //2:Tuesday
        //3:Wednesday
        //4:Thursday
        //5:Friday
        //6:Saturday
        return findday;
    }

    //判断输入的年月日是否超界
    public static int judgeValid(double year,double month,double day)
    {
        if(year<=0)
        {
            return -1;
        }
        if(month<=0||month>=13)
        {
            return -2;
        }
        if(day<=0||day>=32)
        {
            return -3;
        }
        return 0;
    }

    //判断年月日是否为整数
    public static int judgeInteger(double year,double month,double day){
        if((int)year!=year)
        {
            return -1;
        }
        if((int)month!=month)
        {
            return -2;
        }
        if((int)day!=day)
        {
            return -3;
        }
        return 0;
    }

}
