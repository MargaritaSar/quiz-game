/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_phase1;

/**
 * Η Round περιέχει τον τύπο γύρου που παίζεται κάθε φορά, ένα αντικείμενο της Question queen
 * μέσω του οποίου αποκτάται πρόσβαση στις συναρτήσεις της Question και το αντικείμενο p
 * που κάνει την αντίστοιχη δουλειά με την User. 
 * @author Μαργαρίτα Σαράντη & Αναστασία-Κασσιανή Μπλίτση
 */
import java.io.IOException;
import java.util.Scanner;

public class SPRound{
    private final String typeOfRound;
    private final Question queen;
    private final User p;
    public SPRound(String type,User player) throws IOException{
        typeOfRound=type;
        queen=new Question();
        p=player;
    }
    /**
    * @return String με τον τύπο του γύρου που παίζει ο χρήστης
    */
    public String getTypeOfRound(){return typeOfRound;}
    /**
    *@return αντικείμενο Question 
    */
    public Question getQueen(){return queen;}
    
    }

