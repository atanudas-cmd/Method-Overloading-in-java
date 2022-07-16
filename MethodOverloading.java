/**
 *
 * 01. Write two methods with the same name but different number of parameters of same type
 * and call the methods from main method
 *
 * 02. Write two methods with the same name but different number of parameters of different
 * data type and call the methods from main method
 *
 * 03. Write two methods with the same name and same number of parameters of same type
 * and call from main method
 *
 * 04. Write two methods with the same name and same number of parameters of different
 * type and call from main method
 *
 * 05. Write two methods with the same name, number of parameters and data type but
 * different return Type
 */


public class MethodOverloading 
{
    int num1;
    int num2;
    int rollNo;
    String name;

    // 01.Two methods with the same name but different number of parameters of same type
    void method1(int num1) 
    {
        this.num1 = num1;
        System.out.println("Number is: " + num1);
        
    }

    void method1(int num1, int num2) 
    {
        this.num1 = num1;
        this.num2 = num2;
        System.out.println("1.First number: " + num1);
        System.out.println("2.Second number: " + num2);
      
        System.out.println("Sum of two numbers : " + (num1 + num2));
    }

    // 02.Two methods with the same name but different number of parameters of different data type
    //same method name one parameter
    void method2(int rollNo) 
    {
        this.rollNo = rollNo;  
        System.out.println("2.Roll number : " + rollNo);
    }
    //same method name two parameters
    void method2(int rollNo, String name) 
    {
        this.rollNo = rollNo; 
        this.name = name;     
        System.out.println("2.Roll number : " + rollNo + " ; " + "\nName is : " + name);
    }

    // 04.Two methods with the same name and same number of parameters of different type
    //same method name different parameter type
    void method4(int rollNo) 
    {
        this.rollNo = rollNo;  
        System.out.println("4.Roll number : " + rollNo);
    }
    //same method name different parameter type
    void method4(String name) 
    {
        this.name = name;  
        System.out.println("4.Name : " + name);
    }

    public static void main(String[] args) 
    {

        MethodOverloading mo = new MethodOverloading();
        // 01.Calling the methods from main method
        mo.method1(22);
        mo.method1(33, 12);

        // 02.Calling the methods from main method
        mo.method2(18);
        mo.method2(18, "Atanu");

        // 03.Calling the methods from main method
        mo.method4(18);
        mo.method4("Atanu");
    }
}
