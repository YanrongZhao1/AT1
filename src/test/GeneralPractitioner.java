package test;

import java.util.ArrayList;
import java.util.List;

public class GeneralPractitioner extends HealthProfessional{
    public String ServiceLocation;
    public List<GeneralPractitioner> ArrayList = new ArrayList<>();
    @Override
    public String toString() {
        return "ID:" + ID +", name:"+name +", sex:"+ sex +", ServiceLocation:"+ ServiceLocation;
    }

    public GeneralPractitioner(){}
    public GeneralPractitioner(int ID,String name,String sex, String ServiceLocation){
        this.ID = ID;
        this.name = name;
        this.sex = sex;
        this.ServiceLocation = ServiceLocation;
    }

    public void createGeneralPractitioner() {
        GeneralPractitioner GeneralPractitioner1= new GeneralPractitioner(1,"Bob","male", "hospital");
        this.ArrayList.add(GeneralPractitioner1);
        GeneralPractitioner GeneralPractitioner2= new GeneralPractitioner(2,"Tony","male", "hospital");
        this.ArrayList.add(GeneralPractitioner2);
        GeneralPractitioner GeneralPractitioner3= new GeneralPractitioner(3,"Alice","male", "hospital");
        this.ArrayList.add(GeneralPractitioner3);
    }

    public void PrintlnFun(int num){
        System.out.println("The General Practitioner details are: " + "ID:" + ID +", name:"+ name +", sex:"+ sex +", ServiceLocation:"+ ServiceLocation);
    }

}
