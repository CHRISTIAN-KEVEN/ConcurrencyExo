package college;


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
    private boolean running;
    
    private List<Student> students;
    
    
    private final Semaphore visitorSemaphore = new Semaphore(5);
    private final Semaphore studentsSemaphore = new Semaphore(capacity);
    
    public Classroom(String name, int capacity){
        this.name = name;
        this.capacity = capacity;
       
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
    
    
    
    public synchronized void enter(Person p){
        
        if(p instanceof Teacher){
            currentTeacher = (Teacher)p;
            ((Teacher) p).setInClass(true);
        }
        else if(p instanceof Student){
            
        }
    }
    
    public synchronized void leave(Person p){
       
        if(p instanceof Teacher){
            currentTeacher = null;
            ((Teacher) p).setInClass(false);
        }
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
    
    
}
