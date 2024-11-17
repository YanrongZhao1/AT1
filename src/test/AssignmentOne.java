package test;

import java.util.ArrayList;
import java.util.List;

public class AssignmentOne {
    public List<Appointment> ArrayList = new ArrayList<>();
    public void createAppointment(Appointment param) {
        if(param.Name.isEmpty() || param.Phone.isEmpty() || param.Time.isEmpty() || param.Doctor.isEmpty()){
            System.out.println("Incomplete information");
        } else {
            this.ArrayList.add(param);
        }
    }
    public void printExistingAppointments() {
        if(this.ArrayList.isEmpty()){
            System.out.println("no appointments!");
        } else {
            for(int i=0;i<this.ArrayList.size();i++)
            {
                System.out.println("Appointments " + (i+1) + ": " + this.ArrayList.get(i));
            }
        }
    }
    public void cancelBooking(String phone) {
        if(this.useList(this.ArrayList, phone) != null){
            this.ArrayList.remove(this.useList(this.ArrayList, phone));
            System.out.println("Cancel an appointment for a record !!");
        } else {
            System.out.println("phone is not found !!");
        }
    }

    public static Object useList(List<Appointment> arr, String targetValue) {
        for(Appointment obj: arr){
            if(obj.Phone.equals(targetValue)){
                return obj;
            }
        }
        return null;
    }


    public static void main(String[] args){
        // Part 3 – Using classes and objects
        GeneralPractitioner newGeneralPractitioner= new GeneralPractitioner();
        newGeneralPractitioner.createGeneralPractitioner();
        dietitians newDietitians = new dietitians();
        newDietitians.createSurgeonsList();
        for(int i=0;i<newGeneralPractitioner.ArrayList.size();i++)
        {
            System.out.println("The General Practitioner " + (i+1) + " details are: " + newGeneralPractitioner.ArrayList.get(i));
        }
        for(int i = 0; i< newDietitians.ArrayList.size(); i++)
        {
            System.out.println("The Specialists " + (i+1) + " details are: " + newDietitians.ArrayList.get(i));
        }

        //Part 5 – Collection of appointments
        AssignmentOne myAssignmentOne= new AssignmentOne();
        Appointment Appointment1 = new Appointment("Carter","18007845444", "14:00", "Tony");
        myAssignmentOne.createAppointment(Appointment1);
        Appointment Appointment2 = new Appointment("Kori","18007556444", "14:00", "Tony");
        myAssignmentOne.createAppointment(Appointment2);
        Appointment Appointment3 = new Appointment("Kent","18044445444", "10:00", "Mr Wu");
        myAssignmentOne.createAppointment(Appointment3);
        Appointment Appointment4 = new Appointment("Mark","18007999444", "10:00", "Mr Kong");
        myAssignmentOne.createAppointment(Appointment4);
        myAssignmentOne.printExistingAppointments();
        myAssignmentOne.cancelBooking("18007999444");
        myAssignmentOne.printExistingAppointments();
    }
}
