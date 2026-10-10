// Online Java Compiler (Editor)
// Write and run Java online using this editor.

import java.util.Scanner;
public class hospitalmanagement{
    Scanner sc = new Scanner(System.in);
    int[] Patientid = new int[100];
    String[] PatienName = new String[100];
    int[] PatienAge = new int[100];
    String[] PatientGender = new  String[100];
    String[] PatientDisease = new  String[100];
    String[] Doctorname = new  String[100];
    int[] Patientpriority = new int[100];
    int count =0;
    void searchPatient(int id)
    {
        for(int i =0;;i<count ;i++)
            {
            if(patientId[i]==id)
            {
                System.out.println("Patient Found:");
                 System.out.println("Patient ID:" +PatientId[i]);
                 System.out.println("Patient Name:" +PatientName[i]);
                 System.out.println("Patient Age:" +PatientAge[i]);
                 System.out.println("Patient Gender:" +PatientGender[i]);
                 System.out.println("Patient Priority:" +PatientPriority[i]);
                 System.out.println("Patient Disease:" +PatientDisease[i]);
                 System.out.println("Patient Doctor Name:" +PatientDoctorName[i]);
            }
            else{
                System.out.println("Patient not found");
            }
               
        }
    }
    
                               
    void viewAllPatients()
    {
        if(count ==0)
        {
            System.out.println("No patient in the queue.");
            return;
        }
        System.out.println("Patient List.");
        for(int i =0 ; i < count; i++)
            {
                System.out.println("Patient ID:" +PatientId[i]);
                 System.out.println("Patient Name:" +PatientName[i]);
                 System.out.println("Patient Age:" +PatientAge[i]);
                 System.out.println("Patient Gender:" +PatientGender[i]);
                 System.out.println("Patient Priority:" +PatientPriority[i]);
                 System.out.println("Patient Disease:" +PatientDisease[i]);
                 System.out.println("Patient Doctor Name:" +PatientDoctorName[i]);
                System.out.println("------------------------");
            }
    }
    
                
    void addPatient()
    {
        if(count<100)
        System.out.println("Enter patient Id :");
        Patientid[count]=sc.next();
        System.out.println("Enter patient Name :");
        PatientName[count]=sc.next();
        System.out.println("Enter patient Age :");
        PatientAge[count]=sc.next();
        System.out.println("Enter patient Gender :");
        PatientGender[count]=sc.next();
        System.out.println("Enter patient Disease:");
        PatientDisease[count]=sc.next();
        System.out.println("Enter patient Doctor Name :");
        Doctorname[count]=sc.next();
        System.out.println("Enter patient priority 1 = emergency ,2 = normal");
        Patientpriority[count]=sc.next();
        count++; 
    }    else{
        System.out.println("Queue is full");
    }
}
    
    
  void mainmenu ()
    {
        System.out.println("===Library Management System===");
         System.out.println("1. Add Patient");
         System.out.println("2.View all patients");
         System.out.println("3.Search Patient ");
         System.out.println("4.Call next Patient");
         System.out.println("5.View waiting queue");
         System.out.println("6.Sort patients");
         System.out.println("7.Update patient");
         System.out.println("8.Remove patient");
         System.out.println("9.Hospital report");
         System.out.println("10.Exit");
        System.out.println("================");

        
    }
    public static void main (String[] args)
    {
       hospitalmanagement obj = new hospitalmanagement();
        int choice;
        do {
            obj.mainmenu();
            System.out.println("Enter your choice:");
            choice = obj.sc.nextInt();
            switch(choice){
                case 10:
                    System.out.println("Exit");
                    break;   
            }
        }
            while(choice!=10);
        }
    
            
}
