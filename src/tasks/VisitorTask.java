/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tasks;

import college.Classroom;

/**
 *
 * @author CHRISTIAN
 */
public class VisitorTask implements Runnable{

    private final int NUMBER_OF_CLASSES = 4;
    private Classroom[] classrooms;
    
    public VisitorTask(Classroom[] classes){
        classrooms = classes;
    }
    
    @Override
    public void run() {
        
         while(true){
            int i=0;
            while(i < NUMBER_OF_CLASSES){            
                enter(classrooms[i]);
                sitDown();
                leave();
                
                i++;
            }
        }
    }

    private void sitDown() {
        
    }

    private void leave() {
        
    }

    public Classroom[] getClassrooms() {
        return classrooms;
    }

    public void setClassrooms(Classroom[] classrooms) {
        this.classrooms = classrooms;
    }

    private void enter(Classroom classroom) {
        
    }
    
    
    
}
