package main;

import entity.ResultMap;
import service.CheckService;
import service.GeneratingService;

import java.io.*;
import java.util.*;

/**
 * @author Red Date.
 * @date 2020/3/23 20:13
 */
public class Main {

    public static void main(String[] args) throws IOException {
        if(args.length!=4){
            System.out.println("【输入的参数不够，请输入正确的参数】");
            return;
        }
        Set<String> argsSet = new HashSet<String>();
        argsSet.add(args[0]);
        argsSet.add(args[2]);
        String[] all = {"-n","-r","-e","-a"};
        Set<String> allSet = new HashSet<String>(Arrays.asList(all));
        argsSet.removeAll(allSet);
        if(argsSet.size()>0){
            System.out.println("【参数错误，请输入正确的参数】");
        }
        int number = 0;
        int bound = 0;
        int index = 0;
        List<String> list = Arrays.asList(args);
        //储存每一次运算的运算顺序
        List<List<String>> resultList = new ArrayList<List<String>>();
        if(list.contains("-n") && list.contains("-r")){
            if(args[0].equals("-n"))
                number = Integer.parseInt(args[1]);
            else if (args[2].equals("-n")){
                number = Integer.parseInt(args[3]);
            }
            if(args[0].equals("-r")){
                bound = Integer.parseInt(args[1]);
            }else if(args[2].equals("-r")){
                bound = Integer.parseInt(args[3]);
            }
            File exercises = new File("Exercises.txt");
            File answers = new File("Answers.txt");
            FileOutputStream exercisesStream = new FileOutputStream(exercises);
            FileOutputStream answersStream = new FileOutputStream(answers);
            OutputStreamWriter exercisesWriter = new OutputStreamWriter(exercisesStream, "UTF-8");
            OutputStreamWriter answersWriter = new OutputStreamWriter(answersStream, "UTF-8");
            while (index<number){
                ResultMap resultMap = GeneratingService.generateFormula(bound,resultList);
                if(resultMap!=null){
                    index++;
                    exercisesWriter.append(index+"."+resultMap.getExpression()+" "+"=");
                    exercisesWriter.append("\n");
                    answersWriter.append(index+"."+resultMap.getResult());
                    answersWriter.append("\n");
                }
            }
            exercisesWriter.close();
            answersWriter.close();
        }else if(args[0].equals("-e")&&args[2].equals("-a")){
            CheckService.check(args[1],args[3]);
        }else{
            System.out.println("【参数错误，请重新输入正确的参数】");
        }
    }
}
