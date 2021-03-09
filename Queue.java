public class Queue{
   patient first;
   patient last;
   public void enqueue(String n, int p,int sz){
     if(sz==0){
       first = new patient(n,p);
       last = first;
     }
     else{
       patient t = new patient(n,p);
       last.next=t;
       last = last.next;
     }
   }
   public String getName(patient p){
     return p.name;
   }
   public int getId(patient p){
     return p.id;
   }
   
   public void show(){
     int i = 1;
     for(patient p = first ; p!=null; p=p.next){
       System.out.println();  
       System.out.println("Patient No : "+i);
       System.out.println("Name: "+getName(p));
       System.out.println("Identifying Number : "+getId(p));
       i++;
     }
   }
   public void dequeue(){
     System.out.println("Served Patient Name : "+getName(first));
     System.out.println("Identifying Number : "+getId(first));
     first = first.next;
   }
   public void peek(){
     System.out.println("Patient Name : "+getName(first));
     System.out.println("Identifying Number : "+getId(first));
   }
   
   
 }