public class Calculator implements java.io.Serializable {
    //private String name;
    int op;
    int op2;
    String name;
    int result;
    public void Calculator(){
    }
    public void setOperandOne(int num){
        this.op = num;
    }
    public void setOperation(String operator){
        this.name = operator;
    }
    public void setOperandTwo(int num){
        this.op2 = num;
    }
    public void performOperation(){
        if (this.name == "+")
        {
            this.result = this.op + this.op2;
        }
        else if (this.name == "-")
        {
            this.result = this.op - this.op2;
        }
    }
    public int getResults(){
        return this.result;
    }
    public static void main(String[] args) {
    
    Calculator cal1 = new Calculator();
    cal1.setOperandOne(10);
    cal1.setOperandTwo(12);
    cal1.setOperation("+");
    cal1.performOperation();
    System.out.println(cal1.getResults());
  }
}
