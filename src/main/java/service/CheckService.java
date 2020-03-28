package service;

import java.io.*;
import java.util.List;

/**
 * 用于检查生成的式子是否重复，检查传入的答案是否正确
 *
 * @author Red Date.
 * @date 2020/3/23 20:16
 */
public class CheckService {

    /**
     * 判断是否重复,不重复则将表达式加入已有集合中
     *
     * @param list           要判断的运算式拆分后的list集合
     * @param expressionList 已经生成的运算式的集合
     * @return boolean，true为重复
     */
    public static boolean isRepeat(List<String> list, List<List<String>> expressionList) {
        for (List<String> expression : expressionList) {
            if (expression.size() == list.size()) {
                int length = list.size();
                int num = -2;    //用于累计符合条件的运算符
                int index1 = 0;
                //运算符和数字一致，判断运算顺序是否一致
                for (int index = 1; index < length; index += 3) {
                    if (expression.get(index).equals(list.get(index))) {
                        //运算符相同时，前后数字是否一致
                        if ((expression.get(index - 1).equals(list.get(index - 1))
                                && expression.get(index + 1).equals(list.get(index + 1)))
                                || (expression.get(index - 1).equals(list.get(index + 1))
                                && expression.get(index + 1).equals(list.get(index - 1)))) {
                            num += 3;
                        }

                    }
                    index1 = index;
                }
                if (num == index1) {
                    return true;
                } else {
                    expressionList.add(list);
                    return false;
                }
            }
        }
        expressionList.add(list);
        return false;
    }

    //
    public static void check(String checkFile ,String answersFile) throws IOException {
        BufferedReader readerCheck = new BufferedReader(new InputStreamReader(new FileInputStream(checkFile)));
        BufferedReader answerCheck = new BufferedReader(new InputStreamReader(new FileInputStream(answersFile)));
        String checkLine ="";
        String answerLine ="";
        String correct = "";
        String wrong = "";
        int correctNum = 0;
        int wrongNum = 0;
        while ((checkLine = readerCheck.readLine()) != null && (answerLine = answerCheck.readLine()) != null){
            String[] checkString = checkLine.split("\\.");
            String[] answerString = answerLine.split("\\.");
            if(checkString[1].equals(answerString[1])){
                if (correct.equals("")){
                    correct = answerString[0];
                    correctNum++;
                }
                else{
                    correct = correct+","+answerString[0];
                    correctNum++;
                }
            }else{
                if (wrong.equals("")){
                    wrong = answerString[0];
                    wrongNum++;
                }
                else{
                    wrong = wrong+","+answerString[0];
                    wrongNum++;
                }
            }
        }
        readerCheck.close();
        answerCheck.close();
        OutputStreamWriter resultWriter = new OutputStreamWriter(new FileOutputStream(new File("Grade.txt")), "UTF-8");
        resultWriter.append("Correct:"+correctNum+"("+correct+")");
        resultWriter.append("\n");
        resultWriter.append("Wrong:"+wrongNum+"("+wrong+")");
        resultWriter.close();
        System.out.println("Correct:"+correctNum+"("+correct+")");
        System.out.println("Wrong:"+wrongNum+"("+wrong+")");
    }
}
