package college;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CHRISTIAN
 */
public class Teacher extends Person{

    private String teacherName;
    private boolean inClass;
    
    public Teacher(String name){
        this.teacherName = name;
    } 

    public String getTeacherName() {
        return teacherName;
    }

    public boolean isInClass() {
        return inClass;
    }

    public void setInClass(boolean inClass) {
        this.inClass = inClass;
    }
    

    public void setTeacherName(String name) {
        this.teacherName = name;
    }
    
    public void enter(Classroom classroom){
        
    }
    
    public void startLecture(){
        
    }
    
    public void leave(){
        
    }
}
