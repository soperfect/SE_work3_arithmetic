package entity;

import java.util.Random;

/**
 * 分数类，用于表示整数和分数
 * @author Red Date.
 * @date 2020/3/22 22:14
 */
public class Fraction {

    private int numerator;      //分子
    private int denominator;    //分母

    public Fraction(int numerator,int denominator){
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction(int numerator){
        this.denominator = 1;
        this.numerator = numerator;
    }

    //生成一个分数或整数，在给定的范围内
    public Fraction(boolean isFraction,int bound){
        Random random = new Random();
        int numerator = random.nextInt(bound);
        while (numerator==0 ){
            numerator = random.nextInt(bound);
        }
        //生成一个分数
        if(isFraction){
            int denominator = random.nextInt(bound);
            //分母不能为零,分子也不能为零
            while (denominator==0 ){
                denominator = random.nextInt(bound);
            }
            this.numerator = numerator;
            this.denominator = denominator;
        }else{
            this.numerator = numerator;
            this.denominator = 1;
        }
    }

    public Fraction(){

    }

    //加法运算
    public Fraction addition(Fraction fraction){
        int numerator = fraction.getNumerator();
        int denominator = fraction.getDenominator();
        //新的分子
        int newNumerator = this.numerator * denominator + this.denominator * numerator;
        //新的分母
        int newDenominator = this.denominator * denominator;
        Fraction result = new Fraction(newNumerator,newDenominator);
        return result;
    }

    //减法运算
    public Fraction subtraction(Fraction fraction){
        int numerator = fraction.getNumerator();
        int denominator = fraction.getDenominator();
        //新的分子
        int newNumerator = this.numerator * denominator - this.denominator * numerator;
        //新的分母
        int newDenominator = this.denominator * denominator;
        Fraction result = new Fraction(newNumerator,newDenominator);
        return result;
    }

    //除法运算
    public Fraction division(Fraction fraction){
        int numerator = fraction.getNumerator();
        int denominator = fraction.getDenominator();
        //新的分子
        int newNumerator = this.numerator * denominator ;
        //新的分母
        int newDenominator = this.denominator * numerator;
        Fraction result = new Fraction(newNumerator,newDenominator);
        return result;
    }

    public Fraction multiplication(Fraction fraction){
        int numerator = fraction.getNumerator();
        int denominator = fraction.getDenominator();
        //新的分子
        int newNumerator = this.numerator * numerator ;
        //新的分母
        int newDenominator = this.denominator * denominator;
        Fraction result = new Fraction(newNumerator,newDenominator);
        return result;
    }

    // 用辗转相除法求最大公约数
    private static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    // 对分数进行约分
    public void appointment() {
        // 如果分子是0或分母是1就不用约分了
        if (numerator == 0 || denominator == 1)
            return;
        int gcd = gcd(numerator, denominator);
        this.numerator /= gcd;
        this.denominator /= gcd;
    }

    //判断该数是否为负数
    public boolean isNegative(){
        return  (this.getDenominator()<0 || this.getNumerator()<0);
    }

    //TODO 没有考虑全部情况
    //重写toString，返回约分完的结果
    @Override
    public String toString(){
        appointment();
        //分子为0
        if(numerator == 0)
            return ""+ numerator;
        //真分数
        else if(numerator > denominator){
            if(numerator % denominator == 0)
                return "" + numerator/denominator;
            return "" + numerator/denominator + "'" + numerator%denominator +"/" + denominator;
        }else if(numerator == denominator){
            return "" + numerator;
        }
            return "" + numerator + "/" + denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }
}
