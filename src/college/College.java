/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package college;

/**
 *
 * @author CHRISTIAN
 */
public class College {

    /**
     * @param args the command line arguments
     */
    
    private final int NUMBER_OF_CLASSROOMS = 4;
    private final int NUMBER_OF_TEACHERS = 6;
    private final int NUMBER_OF_STUDENTS = 170;
    
       Classroom[] classrooms = new Classroom[NUMBER_OF_CLASSROOMS];
       Teacher[] teachers = new Teacher[NUMBER_OF_TEACHERS];
       Student[] students = new Student[NUMBER_OF_STUDENTS];
       
       public College(){
           
          initializeVars();
       }
       
    public static void main(String[] args) {
        // TODO code application logic here
    }

    private void initializeVars() {
        
         teachers[0] = new Teacher("Osama");
           teachers[1] = new Teacher("Barry");
           teachers[2] = new Teacher("Faheem");
           teachers[3] = new Teacher("Alex");
           teachers[4] = new Teacher("Aqueel");
           teachers[1] = new Teacher("Barry");
           teachers[1] = new Teacher("Waseem");
           
           classrooms[0] = new Classroom("W201", 60); //Creating the class
           classrooms[1] = new Classroom("W202", 60);
           classrooms[2] = new Classroom("W101", 20);
           classrooms[3] = new Classroom("JS101", 30);
           
           int i=0;
           while(i < NUMBER_OF_STUDENTS){
               students[i] = new Student(++i+"");
               
               // Adding the students directly to a classroom
               if(i<60) 
                   classrooms[0].getStudents().add(students[i]);
               else if(i>=60 && i<120)
                   classrooms[1].getStudents().add(students[i]);
               else if(i>=120 && i<140)
                   classrooms[2].getStudents().add(students[i]);
               else
                   classrooms[3].getStudents().add(students[i]);
               
           }
           
    }
    
}
