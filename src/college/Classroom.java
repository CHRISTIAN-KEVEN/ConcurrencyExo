package college;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Semaphore;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CHRISTIAN
 */
public class Classroom {
    
    private String name;
    private int capacity;
    private Teacher currentTeacher;
    private boolean running; // Class is going on
    private int studentCount;
    
    
    private Student[] students;
    
    
    private final Semaphore visitorSemaphore = new Semaphore(5);
    private final Semaphore teacherSemaphore = new Semaphore(1);
  //  private final Semaphore studentsSemaphore = new Semaphore(capacity); // Not Needed since I have associated each student to its class already
    
    public Classroom(String name, int capacity){
        this.name = name;
        this.capacity = capacity;
        this.students = new Student[capacity];
        studentCount = 0;
       
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Teacher getCurrentTeacher() {
        return currentTeacher;
    }

    public void setCurrentTeacher(Teacher teacher) {
        this.currentTeacher = teacher;
    }

    public boolean isRunning() {
        return running;
    }

    public void setRunning(boolean running) {
        this.running = running;
    }
    
    
    
    public void enter(Person p){
        
        if(p instanceof Teacher){
            try {
                teacherSemaphore.acquire();  // After this no other teacher can enter
                
                currentTeacher = (Teacher) p;
                ((Teacher) p).setInClass(true);

            } catch (InterruptedException exc) {
                
            }

        }
        else if(p instanceof Student){
            
            if( ((Student) p).getClassroom().getName().equals(this.getName()) && !this.running){
                      
                ((Student)p).setInClass(true); // Student should know he/she is in class
                studentCount++;
            }
        }
        
        else if(p instanceof Visitor){
            
            try{
                visitorSemaphore.acquire();
                ((Visitor) p).setInClass(true);
            }catch(InterruptedException exc){
                
            }
        }
    }
    
    public void startLecture(Teacher teacher){
        
        if( teacher==this.currentTeacher && teacher.isInClass() && studentCount==capacity && allStudentsSeated(this.students)){
            
        }
    }
    public synchronized void leave(Person p){
       
        if(p instanceof Teacher){
            currentTeacher = null;
            ((Teacher) p).setInClass(false);
            running = false;
            
            teacherSemaphore.release();
        }
        else if(p instanceof Student){
            
            if (!running) {
                studentCount--;
                ((Student) p).setInClass(false);
            }

        }
        else if(p instanceof Visitor){
            
        }
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public int getStudentCount() {
        return studentCount;
    }

    public void setStudentCount(int studentCount) {
        this.studentCount = studentCount;
    }
    
    
    public boolean allStudentsSeated(Student[]students){
        for (Student student : students) {
            if(!student.isSeated())
                return false;
        }
        return true;
    }
}
