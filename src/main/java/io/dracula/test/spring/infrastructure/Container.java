package io.dracula.test.spring.infrastructure;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * @author dk
 */
@Component
public class Container {

    @Autowired
    private List<Base> baseList;

    @Autowired
    private Map<String, Base> baseBeanMap;

    public List<Base> getBaseList() {
        return baseList;
    }

    public void setBaseList(List<Base> baseList) {
        this.baseList = baseList;
    }

    public Map<String, Base> getBaseBeanMap() {
        return baseBeanMap;
    }

    public void setBaseBeanMap(Map<String, Base> baseBeanMap) {
        this.baseBeanMap = baseBeanMap;
    }

    private List<Base> anotherBaseList = new LinkedList<>();

    @Autowired
    public void addList(List<Base> baseList){
        anotherBaseList.addAll(baseList);
    }

    public List<Base> getAnotherBaseList() {
        return anotherBaseList;
    }

    public void setAnotherBaseList(List<Base> anotherBaseList) {
        this.anotherBaseList = anotherBaseList;
    }
}
