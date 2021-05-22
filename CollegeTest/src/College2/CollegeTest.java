
package College2;

import collegetest.Clgint;
import collegetest.College;
import collegetest.Faculty;
import collegetest.Management;
import collegetest.Student;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileOutputStream;
//import java.io.IOException;
import java.io.*;
import java.util.Formatter;
import java.util.Random;
public class CollegeTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //FileOutputStream out=new FileOutputStream("CollegeFile.txt");
        Clgint ci = null;
        College[] clg=new College[7];
        Student[] st=new Student[3];
        Faculty[] f=new Faculty[3];
        System.out.println();
        System.out.println("------------------------");
        System.out.println("\033[31;1m WELCOME \033[0m\033[32;1;2mTO \033[0m\033[31;1mTHE\033[0m \033[0m\033[32;1;2mCOLLEGE");
        System.out.println("------------------------");
        System.out.println();

        College c1=new College("Asif");
        College c2=new College("Kashif");
        College c3=new College("Abdullah");
        Scanner f1=new Scanner(System.in);
        System.out.printf("Ënter Name of faculty Member 1 : ");
        String n1=f1.nextLine();
        Scanner f2=new Scanner(System.in);
        System.out.printf("Ënter Name of faculty Member 2 : ");
        String n2=f2.nextLine();
        Scanner f3=new Scanner(System.in);
        System.out.printf("Ënter Name of faculty Member 3 : ");
        String n3=f3.nextLine();
        College c4=new College(n1);
        College c5=new College(n2);
        College c6=new College(n3);
        College c7=new College("Adil");

//        College c8=new College("Moiz");
//        College c9=new College("Ubaid");
        Management m=new Management(c7.getname(),"Accounts",6);
        
        int []Randomclass=new int[3];
        int []Randomrn=new int[3];  
        int []Randomnoofclasses=new int[3];
        
        for(int i=0;i<3;i++)
        {
            Random rand = new Random();
            int min = 50;
            int max = 100;
            Randomrn[i]=(int)(Math.random() * (max - min + 1) + min);
            int min1 = 11;
            int max1 = 12;
            Randomclass[i]=(int)(Math.random() * (max1 - min1 + 1) + min1);
            int randomclass = (int)(Math.random() * (max1 - min1 + 1) + min1);
        }
        st[0]=new Student(c1.getname(),"Science",Randomclass[0],Randomrn[0]);
        st[1]=new Student(c2.getname(),"Arts",Randomclass[1],Randomrn[1]);
        st[2]=new Student(c3.getname(),"Science",Randomclass[2],Randomrn[2]);
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<=i;j++)
            {
                clg[i]=st[i];
            }
        }
        
        for(int i=0;i<3;i++)
        {
            Random rand = new Random();
            int min2 = 1;
            int max2 = 6;
            Randomnoofclasses[i]=(int)(Math.random() * (max2 - min2 + 1) + min2);
        }
        f[0]=new Faculty(c4.getname(),Randomnoofclasses[0],"Teacher");
        f[1]=new Faculty(c5.getname(),Randomnoofclasses[1],"HOD");
        f[2]=new Faculty(c6.getname(),Randomnoofclasses[2],"Teacher");
//        for(int i=4;i<=6;i++)
//        {
//            for(int j=0;j<j+1;j++)
//            {
//                clg[i]=f[j];
//            }
//        }
        clg[3]=f[0];
        clg[4]=f[1];
        clg[5]=f[2];
        //clg[3]=f;
        clg[6]=m;
        int choice=0;
        do{
            System.out.println();
            System.out.println("Press 0 for Student 1");
            System.out.println("Press 1 for Student 2");
            System.out.println("Press 2 for Student 3");
            System.out.println("Press 3 for Faculty Member 1");
            System.out.println("Press 4 for Faculty Member 2");
            System.out.println("Press 5 for Faculty Member 3");
            System.out.println("Press 6 for Member of Management");
            System.out.println();
            Scanner sc=new Scanner(System.in);
            System.out.printf("Ënter whose data you want to print and press <0 or >6 to Escape : ");
            choice=sc.nextInt();
            if(choice==0)
            {
                System.out.printf("\n%s%s\n",st[0].toString(),ci.Unit);
            }
            else if(choice==1)
            {
                System.out.printf("\n%s%s\n",st[1].toString(),ci.Unit);
            }
            else if(choice==2)
            {
                System.out.printf("\n%s%s\n",st[2].toString(),ci.Unit);
            }
            else if(choice==3)
            {
                System.out.printf("\n%s%s\n",f[0].toString(),ci.Unit);
            }
            else if(choice==4)
            {
                System.out.printf("\n%s%s\n",f[1].toString(),ci.Unit);
            }
            else if(choice==5)
            {
                System.out.printf("\n%s%s\n",f[2].toString(),ci.Unit);
            }
            else if(choice==6)
            {
                System.out.printf("\n%s%s\n",m.toString(),ci.Unit);
            }
        }while(choice>=0  && choice<=6);
        System.out.println();
        for(int i=0;i<3;i++)
        {
            System.out.println("       \033[31m-------\033[32mEXIT\033[34m-------\033[0m");
        }
        System.out.println();
        System.out.println("----------------------------------------------------------------");
        int i;
        for(College current:clg)
        {
            System.out.printf("%s%s\n",current,ci.Unit);
            
            if(current instanceof Student)
            {
                Student s2=(Student) current;
                if(s2.getclasss()==12)
                {
                    if(s2.getrollnum()%2==0)
                    {
                        System.out.println("Marks of 11th class are : 487/550");
                    }
                    else
                    {
                        System.out.println("Marks of 11th class are : 505/550");
                    }
                }
            }
        }
        File fff=new File("CollegeFile.txt");
        try
        {
            if(fff.createNewFile())
            {
                System.out.println("File Created successfully");
            }
            else
            {
                System.out.println("File Already Created");
            }
        }
        catch (IOException e)
        {
            System.out.println("---ERROR---");
        }
        try
        {
            try(FileWriter b=new FileWriter(fff);
            Formatter form= new Formatter(fff))
            {
                for(College current1:clg)
                {
                    form.format("%s%s\n",current1,ci.Unit);
                }
            }
        }
        catch(IOException e)
        {
            System.out.println("---ERROR---");
        }
        System.out.println("EVERYONE's DATA IS PRINTED IN FILE");
        System.out.println();
        System.out.println("----------------------");
        System.out.println("DATA READING FROM FILE");
        System.out.println("----------------------");
        System.out.println();
        try
        {
            FileInputStream fin=new FileInputStream("CollegeFile.txt");
            int store;
            String store_in_arr="";
            while((store=fin.read())!=-1)
            {
                store_in_arr = store_in_arr + (char)store;
            }
            System.out.println(store_in_arr);
        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
        }
    }   
}