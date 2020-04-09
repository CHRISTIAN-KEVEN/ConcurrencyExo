/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tasks;

/**
 *
 * @author CHRISTIAN
 */
public class StudentTask implements Runnable{

    @Override
    public void run() {
        
        while(true){           
            enter();
            sitDown();
            leave();
        }
        
    }

    private void enter() {
        
    }

    private void sitDown() {
        
    }

    private void leave() {
        
    }
    
}
