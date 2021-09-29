/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_phase1;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Μαργαρίτα
 */
public class MPRound {
    private final String typeOfRound;
    private final Question queen;
    private final User p1,p2;
    public MPRound(String type,User player1,User player2) throws IOException{
        typeOfRound=type;
        queen=new Question();
        p1=player1;
        p2=player2;
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
