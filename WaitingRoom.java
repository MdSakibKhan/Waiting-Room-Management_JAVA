import java.util.Scanner;

public class WaitingRoom{
  int capacity;
  int size;
  Queue q = new Queue();
  public WaitingRoom(int c){
    capacity = c;
    size=0;
  }
  public void registerPatient()throws outOfCapacityException{
    Scanner input = new Scanner(System.in);
    if(size<capacity){
      System.out.println("Enter Patient Name");
      String nm = input.nextLine();
      System.out.println("Enter Patient's Identifying Number");
      int n = input.nextInt();
      q.enqueue(nm,n,size);
      size++;
      
    }
    else throw new outOfCapacityException();
  }
  public void showAll()throws NoPatientException{
    if(size==0) throw new NoPatientException();
    else{ 
      q.show();
    }
  }
  public void ServePatient()throws NoPatientException{
    if(size!=0){
      q.dequeue();
      size--;
    }
    else throw new NoPatientException();  
  }
  public void see()throws NoPatientException{
    if(size==0) throw new NoPatientException();
    else q.peek();
  }
  public boolean canDoctorGoHome(){
    if(size==0) return true;
    else return false;
  }
}
