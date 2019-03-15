package io.dracula.test.spring.infrastructure;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author dk
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Main.class)
public class MainTest {

    @Autowired
    private Container container;

    @Test
    public void testMap(){
        System.out.println("map = " + container.getBaseBeanMap());
        System.out.println("list = " + container.getBaseList());
        System.out.println("another list = " + container.getAnotherBaseList());
    }

}
