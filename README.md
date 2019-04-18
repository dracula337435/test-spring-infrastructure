# 试验spring

基础设施

几个类的继承关系
```
        Base
       /    \
Derived1    Derived2
```

在```Container```中  
试验了```@Autowired```用于Map和List属性上  
试验了```@Autowired```用于有Map和List参数的函数上  
测试在```MainTest```中

在```AutowireApplicationContextAndBeanFactoryFetcher```中，试验了```@Autowired```用于```ApplicationContext```和```BeanFactory```类型的属性上