package test;


import org.junit.Assert;
import org.junit.Test;

/**
 * Created by ktkwon on 2019. 11. 26..
 */

public class StaticTest {
    @Test
    public void testDebug(){
        String strDebu = new String("토비");

        System.out.println("테스트 디버그");
        System.out.println("=========");
        System.out.println("Resume Test");
        do {
            System.out.println("ㅇㄷ");
            if(strDebu.equals("cor"))
                break;
            strDebu = new String("cor");
        }while(true);

    }

    @Test
    public void Evaluate() {
        System.out.println("Evaluate Debug");
    }
}
