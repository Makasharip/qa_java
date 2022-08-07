package com.example;

import java.util.List;

public class Lion {

    boolean hasMane;

    public Lion(String sex) throws Exception {
        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самец или самка");
        }
    }

    public boolean doesHaveMane() {
        return hasMane;
    }

    private FelineInterface felineInterface;
    public Lion(FelineInterface felineInterface) {
        this.felineInterface = felineInterface;
    }
    public int getKittens() {
        return felineInterface.getKittens();
    }

    public List<String> getFood() throws Exception {
        return felineInterface.getFood();
    }
}
