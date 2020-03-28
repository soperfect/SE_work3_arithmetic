package service;

import entity.Fraction;
import entity.ResultMap;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Red Date.
 * @date 2020/3/22 23:22
 */
public class GeneratingService {

    /**
     * 生成算式，计算其结果
     * @param bound 数的范围
     * @return
     */
    public static ResultMap generateFormula(int bound,List<List<String>> resultList){

        String expression = "";
        Random random = new Random();
        String[] operator ={"+","-","*","÷"};
        //生成运算符的数量不得超过3
        int operatorNum = random.nextInt(3);
        //该集合用于存放算式，方便计算
        List list = new ArrayList();

        switch (operatorNum){
            //一个运算符
            case 0:{
                int operand = random.nextInt(3);
                //有一个分数
                if (operand == 0){
                    Fraction fraction = new Fraction(true,bound);
                    Fraction fraction1 = new Fraction(false,bound);
                    String symbol = operator[random.nextInt(4)];
                    list.add(fraction);
                    list.add(symbol);
                    list.add(fraction1);
                    expression = ""+fraction.toString()+" "+symbol+" "+fraction1.toString();
                }else if(operand == 1){
                    Fraction fraction = new Fraction(true,bound);
                    Fraction fraction1 = new Fraction(true,bound);
                    String symbol = operator[random.nextInt(4)];
                    list.add(fraction);
                    list.add(symbol);
                    list.add(fraction1);
                    expression = ""+fraction.toString()+" "+symbol+" "+fraction1.toString();
                }
                else if(operand == 2){   //无分数
                    Fraction fraction = new Fraction(false,bound);
                    Fraction fraction1 = new Fraction(false,bound);
                    String symbol = operator[random.nextInt(4)];
                    list.add(fraction);
                    list.add(symbol);
                    list.add(fraction1);
                    expression = ""+fraction.toString()+" "+symbol+" "+fraction1.toString();
                }
                break;
            }
            //两个运算符
            case 1:{
                int operand = random.nextInt(4);
                //一个分数
                if(operand == 0){
                    Fraction fraction = new Fraction(false,bound);
                    Fraction fraction1 = new Fraction(false,bound);
                    Fraction fraction2 = new Fraction(true,bound);
                    String symbol = operator[random.nextInt(4)];
                    String symbol1 = operator[random.nextInt(4)];
                    list.add(fraction);
                    list.add(symbol);
                    list.add(fraction1);
                    list.add(symbol1);
                    list.add(fraction2);
                    expression = ""+fraction.toString()+" "+symbol+" "+fraction1.toString()+" "+symbol1+" "+fraction2.toString();
                }
                //两个分数
                else if(operand == 1){
                    Fraction fraction = new Fraction(false,bound);
                    Fraction fraction1 = new Fraction(true,bound);
                    Fraction fraction2 = new Fraction(true,bound);
                    String symbol = operator[random.nextInt(4)];
                    String symbol1 = operator[random.nextInt(4)];
                    list.add(fraction);
                    list.add(symbol);
                    list.add(fraction1);
                    list.add(symbol1);
                    list.add(fraction2);
                    expression = ""+fraction.toString()+" "+symbol+" "+fraction1.toString()+" "+symbol1+" "+fraction2.toString();
                }
                //三个分数
                else if(operand == 2){
                    Fraction fraction = new Fraction(true,bound);
                    Fraction fraction1 = new Fraction(true,bound);
                    Fraction fraction2 = new Fraction(true,bound);
                    String symbol = operator[random.nextInt(4)];
                    String symbol1 = operator[random.nextInt(4)];
                    list.add(fraction);
                    list.add(symbol);
                    list.add(fraction1);
                    list.add(symbol1);
                    list.add(fraction2);
                    expression = ""+fraction.toString()+" "+symbol+" "+fraction1.toString()+" "+symbol1+" "+fraction2.toString();
                }
                //无分数
                else if(operand == 3){
                    Fraction fraction = new Fraction(false,bound);
                    Fraction fraction1 = new Fraction(false,bound);
                    Fraction fraction2 = new Fraction(false,bound);
                    String symbol = operator[random.nextInt(4)];
                    String symbol1 = operator[random.nextInt(4)];
                    list.add(fraction);
                    list.add(symbol);
                    list.add(fraction1);
                    list.add(symbol1);
                    list.add(fraction2);
                    expression = ""+fraction.toString()+" "+symbol+" "+fraction1.toString()+" "+symbol1+" "+fraction2.toString();
                }
                break;
            }
            //三个运算符
            case 2:{
                int operand = random.nextInt(4);
                //一个分数
                if(operand == 0){
                    Fraction fraction = new Fraction(false,bound);
                    Fraction fraction1 = new Fraction(false,bound);
                    Fraction fraction2 = new Fraction(true,bound);
                    Fraction fraction3 = new Fraction(false,bound);
                    String symbol = operator[random.nextInt(4)];
                    String symbol1 = operator[random.nextInt(4)];
                    String symbol2 = operator[random.nextInt(4)];
                    list.add(fraction);
                    list.add(symbol);
                    list.add(fraction1);
                    list.add(symbol1);
                    list.add(fraction2);
                    list.add(symbol2);
                    list.add(fraction3);
                    expression = ""+fraction.toString()+" "+symbol+" "+fraction1.toString()+" "+symbol1+" "+fraction2.toString()
                                +" "+symbol2+" "+fraction3.toString();
                }
                //两个分数
                else if(operand == 1){
                    Fraction fraction = new Fraction(false,bound);
                    Fraction fraction1 = new Fraction(true,bound);
                    Fraction fraction2 = new Fraction(true,bound);
                    Fraction fraction3 = new Fraction(false,bound);
                    String symbol = operator[random.nextInt(4)];
                    String symbol1 = operator[random.nextInt(4)];
                    String symbol2 = operator[random.nextInt(4)];
                    list.add(fraction);
                    list.add(symbol);
                    list.add(fraction1);
                    list.add(symbol1);
                    list.add(fraction2);
                    list.add(symbol2);
                    list.add(fraction3);
                    expression = ""+fraction.toString()+" "+symbol+" "+fraction1.toString()+" "+symbol1+" "+fraction2.toString()
                            +" "+symbol2+" "+fraction3.toString();
                }
                //三个分数
                else if(operand == 2){
                    Fraction fraction = new Fraction(false,bound);
                    Fraction fraction1 = new Fraction(true,bound);
                    Fraction fraction2 = new Fraction(true,bound);
                    Fraction fraction3 = new Fraction(true,bound);
                    String symbol = operator[random.nextInt(4)];
                    String symbol1 = operator[random.nextInt(4)];
                    String symbol2 = operator[random.nextInt(4)];
                    list.add(fraction);
                    list.add(symbol);
                    list.add(fraction1);
                    list.add(symbol1);
                    list.add(fraction2);
                    list.add(symbol2);
                    list.add(fraction3);
                    expression = ""+fraction.toString()+" "+symbol+" "+fraction1.toString()+" "+symbol1+" "+fraction2.toString()
                            +" "+symbol2+" "+fraction3.toString();
                }
                //四个分数
                else if(operand == 3){
                    Fraction fraction = new Fraction(true,bound);
                    Fraction fraction1 = new Fraction(true,bound);
                    Fraction fraction2 = new Fraction(true,bound);
                    Fraction fraction3 = new Fraction(true,bound);
                    String symbol = operator[random.nextInt(4)];
                    String symbol1 = operator[random.nextInt(4)];
                    String symbol2 = operator[random.nextInt(4)];
                    list.add(fraction);
                    list.add(symbol);
                    list.add(fraction1);
                    list.add(symbol1);
                    list.add(fraction2);
                    list.add(symbol2);
                    list.add(fraction3);
                    expression = ""+fraction.toString()+" "+symbol+" "+fraction1.toString()+" "+symbol1+" "+fraction2.toString()
                            +" "+symbol2+" "+fraction3.toString();
                }else {     //没有分数
                    Fraction fraction = new Fraction(false,bound);
                    Fraction fraction1 = new Fraction(false,bound);
                    Fraction fraction2 = new Fraction(false,bound);
                    Fraction fraction3 = new Fraction(false,bound);
                    String symbol = operator[random.nextInt(4)];
                    String symbol1 = operator[random.nextInt(4)];
                    String symbol2 = operator[random.nextInt(4)];
                    list.add(fraction);
                    list.add(symbol);
                    list.add(fraction1);
                    list.add(symbol1);
                    list.add(fraction2);
                    list.add(symbol2);
                    list.add(fraction3);
                    expression = ""+fraction.toString()+" "+symbol+" "+fraction1.toString()+" "+symbol1+" "+fraction2.toString()
                            +" "+symbol2+" "+fraction3.toString();
                }
            }
            break;
        }
        //存放运算的式子
        List order = new ArrayList();
        for (int i= 0;i<list.size();i++)
            order.add(list.get(i));
        //计算结果
        Fraction resultFraction = CalculateService.calculate(list);
        if(resultFraction == null)
            return null;
        //把运算的式子转化成List<String>
        List<String> stringList = CalculateService.operationsOrder(order);
        //去重
        boolean flag = CheckService.isRepeat(stringList,resultList);
        if(flag)
            return null;
        else
            return new ResultMap(expression,resultFraction.toString());
    }
}
