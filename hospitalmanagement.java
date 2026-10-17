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
    void removePatient()
    {
        System.outy.println("Enter patient ID to remove");
        int id = sc.nextInt();
        for(int i =0;i< vcount;i++)
            {
            if(patient==id)
            {
                for(intj=1;j<count-1;j++)
                    {
                        Patientid[j] = Patientid[j+1];
                        PatientName[j] = PatientName[j+1];
                        PatientAge[j] = PatientGender[j+1];
                        PatientGender[j] = PatientName[j+1];
                        Patientpriority[j] = Patientpriority[j+1];
                        PatientDisease[j] = PatientDisease[j+1];
                        PatientDoctorname[j] = Doctorname[j+1];
                    }
                count--;
                System.out.println("Patient removed Successfully..."};
        return;
    }
}
System.out.println("Patient not found....");
}
void UpdatePatient(int id )
    {
    for (int i=0;i< count;i++)
        {
            if(PatientId[i] ==id)
            {
                System.out.println("Enter Patient Name:");
                PatientName[i] = sc.nextLine();
                sc.next();
                 System.out.println("Enter Patient Age:");
                PatientAge[i] = sc.nextLine();
                sc.next();
                System.out.println("Enter Patient Gender:");
                PatientGender[i] = sc.nextLine();
                System.out.println("Enter Patient Age:");
                PatientAge[i] = sc.nextLine(); 
                System.out.println("Enter patient priority 1 = emergency ,2 = normal");
                Patientpriority[count]=sc.nextInt();
                 System.out.println("Enter patient Disease:");
                PatientDisease[count]=sc.nextLine();
                System.out.println("Enter patient Doctor Name :");
                Doctorname[count]=sc.nextLine();
                System.out.println("Patient Details update successfull...");
            }
        }
}

    void searchPatient()
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
        Patientid[count]=sc.nextLine();
        sc.nextline();
        System.out.println("Enter patient Name :");
        PatientName[count]=sc.nextLine();
        sc.nextLine();
        System.out.println("Enter patient Age :");
        PatientAge[count]=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter patient Gender :");
        PatientGender[count]=sc.nextLine();
        System.out.println("Enter patient Disease:");
        PatientDisease[count]=sc.nextLine();
        System.out.println("Enter patient Doctor Name :");
        Doctorname[count]=sc.nextLine();
        System.out.println("Enter patient priority 1 = emergency ,2 = normal");
        Patientpriority[count]=sc.nextInt();
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
void hospitalReport()
    {
    System.out.println("Hospital report");
    System.out.println("Total patients :" + count);
    int emergencyCount =0;
    int normalCount =0;
    for(int i = 0;i< count;i++)
        {
            if(PatientPriority[i] ==1)
            {
                emergency count++;
            }
            else {
                normal count ++;
            }
        }
    System.out.println("Emergency PAtients:" +emergencyCount);
    System.out.println("Normal Patients:"+normalCount);
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
                case 1:
                    obj.addPatient();
                    break;
                case 2:
                    obj.viewAllPatients();
                    break;
                    case3:
                    if(obj.count==0)
                    {
                        System.out.println(Please Add patient..");
                    }
                    else{
                        System.out.println("Enter Patient Id:");
                        int id =obj.sc.nextInt();
                        obj.searchPatient(id);
                    }
                    break;
                case 7;
                    if(obj.count == 0)
                    {
                        System.out.println("Please Add patient...");
                    }
                    else {
                        System.out.println("Enter patient id:");
                        int id = obj.sc.nextInt();
                        obj.UpdatePatient(id);
                    }
                    break;
                case 8:
                    obj.removePatient();
                    break;
                case 9:
                    obj.hospitalReport();
                    break;
                case 10:
                    System.out.println("Exit");
                    break;   
            }
        }
            while(choice!=10);
    }         
}
