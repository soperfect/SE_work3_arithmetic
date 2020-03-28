package service;

import entity.ResultMap;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Red Date.
 * @date 2020/3/24 16:26
 */
public class GeneratingServiceTest {

    @Test
    public void generateFormula() {


        List<List<String>> listList = new ArrayList<List<String>>();
        int i = 0;
        while (i<10000){
            ResultMap resultMap = GeneratingService.generateFormula(50,listList);
            if(resultMap!=null){
                System.out.println(resultMap.getExpression()+" "+"="+" "+resultMap.getResult());
                i++;
            }

        }



    }
}