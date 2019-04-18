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
public class AutowireApplicationContextAndBeanFactoryFetcherTest {

    @Autowired
    private AutowireApplicationContextAndBeanFactoryFetcher autowireApplicationContextAndBeanFactoryFetcher;

    @Test
    public void testGetDerived1(){
        System.out.println(autowireApplicationContextAndBeanFactoryFetcher.getDerived1FromApplicationContext());
    }

    @Test
    public void testGetDerived2(){
        System.out.println(autowireApplicationContextAndBeanFactoryFetcher.getDerived2FromBeanFactory());
    }

}
