package entity;

/**
 * 用于存放算术表达式以及结果
 * @author Red Date.
 * @date 2020/3/22 23:17
 */
public class ResultMap {

    //表达式
    private String expression;
    //结果
    private String result;

    public String getExpression() {
        return expression;
    }

    public void setExpression(String expression) {
        this.expression = expression;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public ResultMap(String expression, String result) {
        this.expression = expression;
        this.result = result;
    }

    public ResultMap(){

    }
}
