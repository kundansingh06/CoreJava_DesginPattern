package com.kundan.creationaldesignpatterns.abstractfactory;

public class TraineeProfessionAbstractFactory extends AbstractFactory{
	@Override
	public Profession getProfession(String typeOfProfession){
		  if(typeOfProfession == null){
	         return null;
	      }
		  else if(typeOfProfession.equalsIgnoreCase("Engineer")){
	         return new EngineerTrainee();
	         
	      } else if(typeOfProfession.equalsIgnoreCase("Teacher")){
	         return new TeacherTrainee();
	      }
	      return null;
	   }

}
