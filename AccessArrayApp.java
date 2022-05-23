//app to read in text file and store data items within a traditional array

import java.util.*;
import java.io.File;
import java.io.IOException;

public class AccessArrayApp{       
    static StudentTxt[] tradArr = new StudentTxt[5000];
    public static int opCount=0; 
    
public static void getCount(){
 System.out.println(opCount);

}

//constructor    
public AccessArrayApp(){
   
    try {
      File file = new File("data/oklist.txt");
      Scanner scan = new Scanner (file);      
      int i=0;
      StudentTxt ST;
    while (scan.hasNextLine())
        { 
        String str = scan.nextLine();
        int index = str.indexOf(' ');
        String ID = str.substring(0, index);
        String Name = str.substring(index+1);
        ST = new StudentTxt(Name, ID); 
                
        tradArr[i] = ST;
        i++;
        }
        scan.close();
        } catch (Exception exception){
         System.out.println("File not found");
        }   
     }
           
//method to print out the student name of matching ID, or say access denied
  
    /**
    * Returns the Name of a corresponding student ID, if they are registered,
    * ie their ID exists in the file
    *
    *@param studentID the ID of the student which we try to search for in array of Students
    *@return the name of that student if they are registered, or "Access Denied" printed out if they arent registered
    */
    
    public static void printStudent(String studentID)
    {
    
    int i=0;
    int x=0;
    while (i != tradArr.length){
      opCount++;
      if ((studentID).equals((tradArr[i]).getID())){
        System.out.println((tradArr[i]).getName());
        x++;
        break;
        }  
      i++;
      }          
    if (i == tradArr.length || x==0){    
        System.out.println("Access Denied");
      }   
   }
    
//method to print out student numbers and names in any order    
   
   /**
   *Prints out all students registered (names and ID's within list)
   *@param there arent any
   *@return the names and IDs of the student in the traditional array
   */

    public static void printAllStudents()
    {
    for (int i=0;i<tradArr.length;i++)
       {
       System.out.println(tradArr[i].getID() + " " + tradArr[i].getName());
       }
    }
    
    /**
    * General main method used for input from command line
    * If the program is invoked only, use printAllStudents method to print out all names and ids of students in array
    * If the program is invoked with an ID, use the printStudent method to print out the name of that student or "Access Denied" if the name isnt there
    */
    public static void main(String [] args)  
    {
     AccessArrayApp A = new AccessArrayApp();
     
     if ( args.length != 0){ 
      opCount++;
      A.printStudent(args[0]);
      System.out.println("Number of operations within AccessArrayApp : "+opCount);      
     }
     else {
     A.printAllStudents();
     System.out.println("Number of operations within AccessArrayApp :" +opCount);
     
     }
     
    }
    }
