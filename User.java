/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_phase1;

/**
 * Η κλάση User περιλαμβάνει τα στοιχεία του κάθε παίκτη, δηλαδή το όνομα του 
 * που ζητείται στην αρχή και τους πόντους του. 
 * @author Μαργαρίτα Σαράντη & Αναστασία-Κασσιανή Μπλίτση
 */
public class User{
    private String name;
    private int score;
    private int bet;
    public User(){
    }
    /**
    * Αρχικοποιεί το σκορ του παίκτη
    */
    public void setInitialScore(){score=0;}
    /**
     * Αποθηκεύει το όνομα που έδωσε ο χρήστης
     * @param aName String με το όνομα του χρήστη
     */
    public void setName(String aName){name=aName; }
    /**
    *@return το σκορ του χρήστη
    */
    public int getScore(){return score;}
    /**
    *@return το όνομα του χρήστη
    */
    public String getName(){return name;}
    /**
     * Η setScore υπολογίζει το συνολικό σκορ του χρήστη
     * @param b οι πόντοι που παίρνει ο χρήστης σε κάθε ερώτηση
     */
    public void setScore(int b){score=score+b;}
    public void setBet(int b){bet=b;}
    public int getBet(){return bet;}
}
    
