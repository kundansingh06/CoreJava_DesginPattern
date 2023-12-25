package com.kundan.creationaldesignpatterns.factorypattern;
public class MainClass_Client {
    public static void main(String args[]){
        FactoryClass planFactory = new FactoryClass();
        Plan p1 = planFactory.getPlan("DOMESTICPLAN");
        Plan p2 = planFactory.getPlan("COMMERCIALPLAN");
        Plan p3 = planFactory.getPlan("INSTITUTIONALPLAN");
        p1.getRate();
        p2.getRate();
        p3.getRate();

    }
}
