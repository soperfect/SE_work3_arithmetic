package service;

import entity.Fraction;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Red Date.
 * @date 2020/3/24 16:28
 */
public class CheckServiceTest {

    @Test
    public void isRepeat() {
        CheckService checkService = new CheckService();
        List l = new ArrayList();
        l.add(new Fraction(1,2));
        l.add("+");
        l.add(new Fraction(1,3));
        l.add("*");
        l.add(new Fraction(1,4));
        l.add("÷");
        l.add(new Fraction(1,5));
        List list = new ArrayList();
        list.add(new Fraction(1,3));
        list.add("+");
        list.add(new Fraction(5,1));
        list.add("*");
        list.add(new Fraction(3,1));
        list.add("÷");
        list.add(new Fraction(10,9));
        List<String> list1 = CalculateService.operationsOrder(l);
        List<String> list2 = CalculateService.operationsOrder(list);
        List<List<String>> listList = new ArrayList<List<String>>();
        listList.add(list1);
        listList.add(list2);
        List l1 = new ArrayList();
        l1.add(new Fraction(1,2));
        l1.add("+");
        l1.add(new Fraction(1,3));
        l1.add("*");
        l1.add(new Fraction(1,4));
        l1.add("÷");
        l1.add(new Fraction(1,5));
        List<String> list3 = CalculateService.operationsOrder(l1);

        boolean flag = checkService.isRepeat(list3,listList);
        System.out.println("集合的长度"+listList.size()+" "+ flag);
        Assert.assertEquals("式子重复",true,flag);
        List l2 = new ArrayList();
        l2.add(new Fraction(1,2));
        l2.add("*");
        l2.add(new Fraction(1,3));
        l2.add("÷");
        l2.add(new Fraction(1,4));
        l2.add("+");
        l2.add(new Fraction(1,5));
        List<String> list4 = CalculateService.operationsOrder(l2);
        boolean flag1 = checkService.isRepeat(l2,listList);
        System.out.println("集合的长度"+listList.size()+" "+ flag1);
        listList.clear();
        List l3 = new ArrayList();
        l3.add(new Fraction(1,2));
        l3.add("*");
        l3.add(new Fraction(1,3));
        l3.add("÷");
        l3.add(new Fraction(1,4));
        l3.add("+");
        l3.add(new Fraction(1,5));
        List<String> list5 = CalculateService.operationsOrder(l3);
        boolean flag2= checkService.isRepeat(l2,listList);
        System.out.println("集合的长度"+listList.size()+" "+ flag2);
    }
}