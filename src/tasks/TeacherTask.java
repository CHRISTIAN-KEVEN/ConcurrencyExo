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
public class TeacherTask implements Runnable{

    private final int NUMBER_OF_CLASSES = 4;
    Classroom[] classrooms = new Classroom[NUMBER_OF_CLASSES];
    
    public TeacherTask(Classroom[] classes){
        
        classrooms = classes; //Pass classes available in school to Teacher object when creating it
    }
    
    @Override
    public void run() {
        
        int rand = (int) (NUMBER_OF_CLASSES*Math.random());
        while(true){
            int i=0;
            while(i < NUMBER_OF_CLASSES){            
                enter(classrooms[i]);
                startLecture();
                leave();
                
                i++;
            }
        }
    }
    
    public void enter(Classroom classroom){
        
       
    }

    private void startLecture() {
       
    }

    private void leave() {
       
    }
}
