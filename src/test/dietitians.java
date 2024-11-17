package test;

import java.util.ArrayList;
import java.util.List;

public class dietitians extends HealthProfessional{
    public String ServiceLocation;
    public List<dietitians> ArrayList = new ArrayList<>();

    @Override
    public String toString() {
        return "ID:" + ID +", name:"+name +", sex:"+ sex +", ServiceLocation:"+ ServiceLocation;
    }

    public dietitians(){}

    public dietitians(int ID, String name, String sex, String ServiceLocation){
        this.ID = ID;
        this.name = name;
        this.sex = sex;
        this.ServiceLocation = ServiceLocation;
    }

    public void createSurgeonsList() {
        dietitians dietitians1 = new dietitians(4,"Mr Wu","female", "Home");
        this.ArrayList.add(dietitians1);
        dietitians dietitians2 = new dietitians(5,"Mr Kong","female", "Home");
        this.ArrayList.add(dietitians2);
    }

    public void PrintlnSurgeons(){
        System.out.println("The Surgeons details are: " + "ID:" + ID +" ,name:"+ name +" ,sex:"+ sex +" ,ServiceLocation:"+ ServiceLocation);
    }
}
