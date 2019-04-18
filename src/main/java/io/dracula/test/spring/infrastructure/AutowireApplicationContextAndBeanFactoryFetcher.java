package io.dracula.test.spring.infrastructure;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * 试验在ApplicationContext和BeanFactory类型属性上用@Autowired
 * @author dk
 */
@Component
public class AutowireApplicationContextAndBeanFactoryFetcher {

    @Autowired
    private ApplicationContext applicationContext;

    @Autowired
    private BeanFactory beanFactory;

    public Derived1 getDerived1FromApplicationContext(){
        return applicationContext.getBean(Derived1.class);
    }

    public Derived2 getDerived2FromBeanFactory(){
        return beanFactory.getBean(Derived2.class);
    }

}
