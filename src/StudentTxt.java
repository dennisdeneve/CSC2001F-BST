public class StudentTxt implements Comparable<StudentTxt>{
    String Name;
    String id;

    StudentTxt (String name, String ID){
        this.Name = name;
        this.id = ID;
    }    
    StudentTxt(String ID){
        this.id=ID;
    }
    
    /**
    * Gets the name, accessor method
    * @param none
    * return the Name of student object
    */
    public String getName()
    {
    return this.Name; 
    }
    /**
    * Gets the Id, accessor method
    * @param none
    * return the ID of a student object
    */
    public String getID()
    {
    return this.id;
    }
    /**
    * Prints out name of student object, ID not needed for the purposes of the assignment
    * @param none
    * @return the name of a student object
    */
    public String toString()
    {
        return this.id+" "+this.Name;
    }
    public String toString(int a)
    {
        return this.Name;
    }
    /**
    * Compares two student objects, used more in BST implementation
    * @param another student type object
    * @return 1 if they are the same student or -1 if not
    */
    public int compareTo (StudentTxt other)
    {
        if ((this.id).equals(other.id)){
          //  return "This is the same student";
            return 0;
        } else { 
         //   return "They are different students";
            return -1;
        }
       
    }
    
}