//App to also read in a text file but store the data items using a 
//Binary Search Tree (BST) instead of an array 
//The same construct as the AccessArrayApp, but using a binary search tree

import java.util.*;
import java.io.FileNotFoundException;
import java.io.File;

public class AccessBSTApp
{

static BinarySearchTree<StudentTxt> S = new BinarySearchTree<StudentTxt> ();

    public AccessBSTApp()
    {
    try{
        File file = new File("../data/oklist.txt");
        Scanner scan = new Scanner (file);
        while (scan.hasNextLine()){ 
            String str = scan.nextLine();
            
            int index = str.indexOf(' ');
            String ID = str.substring(0,index);
            String Name = str.substring(index+1);
            
            StudentTxt ST = new StudentTxt(Name, ID);
            S.insert(ST);
            }
            scan.close();
        }catch (Exception exception){
            System.out.println("File not found");
            }    
    }
    /**
    * Finds the ID of a student object if they are in BST, returns "Access denied" if they arent
    *
    * @param a string ID, thats used as a key to search for the student object in BST (using find method predefined by Proffessor)
    * @return the name of student if they are in the list, or "Access Denied" if they arent
    */
    
    public static void printStudent (String ID){
        if (S.find(new StudentTxt((ID)))==null){
            System.out.println("Denied Access");
            }
            else{  
          System.out.println( (((S.find(new StudentTxt(ID))).data).toString(5)) );     
            }                  
    }
    /**
    * Prints out all students in txt file to screen
    *
    * @param none
    * @return the BST using the inOrder method predefined by proffessor
    */
    public static void printAllStudents(){
        //use inOrder()
        S.inOrder();          
    }
    
    /**
    * Main method that uses input from command line
    *
    * @param the string array called args from user when invoked via command line
    * @return the student name if the ID of that student is entered (use the printStudent method) or returns the entire list of students if the user doesnt input an ID or anything after invoking the class
    *    
    */
    public static void main ( String[] args)
    {
        AccessBSTApp BST = new AccessBSTApp();    
            if (args.length != 0){
                String ID= args[0];
                //print out only studentname, if it exsts
                BST.printStudent(ID);
                int opCounter = BinarySearchTree.opCount ;
                
                System.out.println("Number of comparison operations = "+opCounter);
                }
            else{
                //print out all students 
                BST.printAllStudents();
                int opCounter = BinarySearchTree.opCount ;
                System.out.println("Number of comparison operations = "+opCounter);
                }
    }
}

        
        
        
        
    
    