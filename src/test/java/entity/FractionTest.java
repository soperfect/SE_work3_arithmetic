package entity;

import org.junit.Assert;
import org.junit.Test;

/** 
* Fraction Tester. 
* 
* @author <Authors name> 
* @since <pre>���� 24, 2020</pre> 
* @version 1.0 
*/ 
public class FractionTest { 

/** 
* 
* Method: addition(Fraction fraction) 
* 
*/ 
@Test
public void testAddition() throws Exception {

    Fraction fraction = new Fraction(1,4);
    Fraction fraction1 = new Fraction(4,3);
    Fraction fraction2 = fraction.addition(fraction1);
    System.out.println("1/4 + 1'1/3 = "+fraction2);
    Assert.assertEquals("加法结果错误","1'7/12",fraction2.toString());
} 

/** 
* 
* Method: subtraction(Fraction fraction) 
* 
*/ 
@Test
public void testSubtraction() throws Exception {

    Fraction fraction = new Fraction(3,4);
    Fraction fraction1 = new Fraction(1,9);
    Fraction fraction2 = fraction.subtraction(fraction1);
    System.out.println("3/4 + 1/9 = "+fraction2);
    Assert.assertEquals("减法结果错误","23/36",fraction2.toString());

} 

/** 
* 
* Method: division(Fraction fraction) 
* 
*/ 
@Test
public void testDivision() throws Exception {
    Fraction fraction = new Fraction(3,4);
    Fraction fraction1 = new Fraction(1,9);
    Fraction fraction2 = fraction.division(fraction1);
    System.out.println("3/4 ÷ 1/9 = "+fraction2);
    Assert.assertEquals("除法结果错误","6'3/4",fraction2.toString());
} 

/** 
* 
* Method: multiplication(Fraction fraction) 
* 
*/ 
@Test
public void testMultiplication() throws Exception {
    Fraction fraction = new Fraction(3,4);
    Fraction fraction1 = new Fraction(1,9);
    Fraction fraction2 = fraction.multiplication(fraction1);
    System.out.println("3/4 * 1/9 = "+fraction2);
    Assert.assertEquals("乘法结果错误","1/12",fraction2.toString());
} 

/** 
* 
* Method: Appointment() 
* 
*/ 
@Test
public void testAppointment() throws Exception { 

    Fraction fraction = new Fraction(16,18);
    fraction.appointment();
    System.out.println(fraction);
    Assert.assertEquals("约分结果错误","8/9",fraction.toString());
} 

/** 
* 
* Method: toString() 
* 
*/ 
@Test
public void testToString() throws Exception {
    //真分数
    Fraction fraction = new Fraction(1,3);
    //假分数
    Fraction fraction1 = new Fraction(7,3);
    //约分后为整数
    Fraction fraction2 = new Fraction(10,5);
    //整数
    Fraction fraction3 = new Fraction(5,1);
    //分子分母相同
    Fraction fraction4 = new Fraction(3,3);

    String string = fraction.toString();
    String string1 = fraction1.toString();
    String string2 = fraction2.toString();
    String string3 = fraction3.toString();
    String string4 = fraction4.toString();

    Assert.assertEquals("1/3",string);
    Assert.assertEquals("2'1/3",string1);
    Assert.assertEquals("2",string2);
    Assert.assertEquals("5",string3);
    Assert.assertEquals("1",string4);
}

} 
