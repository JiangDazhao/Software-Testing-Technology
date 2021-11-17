public class Calculator {
    public int result = 0;
    public int add(int operand1,int operand2){
        result = operand1 + operand2; //对两个传入参数执行相加操作
        return result;
    }
    public int subtract(int operand1,int operand2){
        result = operand1 - operand2; //对两个传入参数执行相减操作
        return result;
    }
    public int multiple (int operand1,int operand2){
        result = operand1 * operand2; //对两个传入参数执行相乘操作
        return result;
    }
    public int divide(int operand1,int operand2){
        result = operand1 / operand2; //对两个传入参数执行相除操作
        return result;
    }
    public int getResult(){
        return this.result; //返回计算结果
    }
}