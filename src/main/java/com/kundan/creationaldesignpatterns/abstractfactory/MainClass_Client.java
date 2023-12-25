package com.kundan.creationaldesignpatterns.abstractfactory;
import java.util.Optional;
public class MainClass_Client {
	public static void main(String[] args) {
		AbstractFactory abstractFactory = AbstractFactoryProducer.getProfession(false);
		Profession engg = abstractFactory.getProfession("Engineer");
		engg.print();

	}

}
