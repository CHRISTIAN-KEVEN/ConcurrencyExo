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
    
       Classroom[] classrooms = new Classroom[4];
       Teacher[] teachers = new Teacher[6];
       
       public College(){
          
           teachers[0] = new Teacher("Osama");
           teachers[1] = new Teacher("Barry");
           teachers[2] = new Teacher("Faheem");
           teachers[3] = new Teacher("Alex");
           teachers[4] = new Teacher("Aqueel");
           teachers[1] = new Teacher("Barry");
           teachers[1] = new Teacher("Waseem");
           
           classrooms[0] = new Classroom("W201", 60);
           classrooms[1] = new Classroom("W202", 60);
           classrooms[2] = new Classroom("W101", 20);
           classrooms[3] = new Classroom("JS101", 30);
       }
       
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
