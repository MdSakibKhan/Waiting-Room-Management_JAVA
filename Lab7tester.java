import java.util.*;
public class Lab7tester {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter capaticy of the Waiting room");
    int cp = input.nextInt();
    WaitingRoom w = new WaitingRoom(cp);
    System.out.println("Read the instructions carefully");
    System.out.println("Enter 1 to register patient");
    System.out.println("Enter 2 to serve a patient");
    System.out.println("Enter 3 to see a patient");
    System.out.println("Enter 4 to show all the patient");
    System.out.println("Enter 5 to know can doctor go home");
    System.out.println("Enter 6 to cancell all");
    int num;
    while(true){
      num = input.nextInt();
      if(num==1){
        try{
          w.registerPatient();
        }
        catch(outOfCapacityException e){
          System.out.println("You cant register more patient, the waiting room is full"); 
        }
      }
      else if(num==2){
        try{
          w.ServePatient();
        }
        catch(NoPatientException e){
         System.out.println("There is no patient to serve");
        }
      }
      else if(num==3){
        try{
          w.see();
        }
        catch(NoPatientException e){
         System.out.println("There is no patient to peek");
        }
      }
      else if(num==4){
        try{
          w.showAll();
        }
        catch(NoPatientException e){
         System.out.println("There is no patient");
        }
      }
      else if(num==5){
      System.out.println(w.canDoctorGoHome());
      }
      else if(num==6){
      System.out.println("Operation ends");
      break;
      }
      System.out.println("\nEnter which action do you want to take next");
    }

  }
  
}
