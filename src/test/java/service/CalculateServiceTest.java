package service;


import entity.Fraction;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Red Date.
 * @date 2020/3/24 12:39
 */

public class CalculateServiceTest {

    @Test
    public void calculate() {
        List list = new ArrayList();
        list.add(new Fraction(1,3));
        list.add("+");
        list.add(new Fraction(5,1));
        list.add("*");
        list.add(new Fraction(3,1));
        Fraction fraction = CalculateService.calculate(list);
        System.out.println("计算结果为:"+fraction);
        list.clear();
        list.add(new Fraction(1,3));
        list.add("-");
        list.add(new Fraction(1,1));
        Fraction fraction1 = CalculateService.calculate(list);
        System.out.println(fraction1);
        Assert.assertEquals("计算结果错误","15'1/3",fraction.toString());
        Assert.assertEquals("计算结果为负数返回空",null,fraction1);

    }

    @Test
    public void operationsOrder() {
        List list = new ArrayList();
        list.add(new Fraction(1,3));
        list.add("+");
        list.add(new Fraction(5,1));
        list.add("*");
        list.add(new Fraction(3,1));
        list.add("÷");
        list.add(new Fraction(10,9));
        List<String> stringList = CalculateService.operationsOrder(list);
        System.out.println(stringList.toString());
        List<String> expect = Arrays.asList("5","*","3","15","÷","1'1/9","1/3","+","13'1/2");
        Assert.assertEquals(expect,stringList);
    }
}
