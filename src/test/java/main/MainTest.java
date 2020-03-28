package main;

import org.junit.Test;
import service.CheckService;

import java.io.IOException;

/**
 * @author Red Date.
 * @date 2020/3/24 21:25
 */
public class MainTest {

    @Test
    public void main() throws IOException {
        String[] args = {"-r","20","-n","10"};
        Main.main(args);
        CheckService.check("check.txt","Answers.txt");

    }
}