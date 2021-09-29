/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_phase1;

import java.io.IOException;
import java.util.Random;

/**
 *
 * @author Μαργαρίτα
 */
public class MPGame {
    private final String[] rounds;
    private final MPRound selectedRound;
    public MPGame(User player1,User player2) throws IOException{
        rounds= new String[5];
        rounds[0]="Σωστή Απάντηση";
        rounds[1]="Ποντάρισμα";
        rounds[2]="Σταματήστε το χρονόμετρο";
        rounds[3]="Γρήγορη απάντηση";
        rounds[4]="Θερμόμετρο";
        int random= new Random().nextInt(rounds.length);
        selectedRound= new MPRound(rounds[random],player1,player2);
    }
    /**
    *@return το τρέχον αντικείμενο SPRound
    */
    public MPRound getRound() {return selectedRound;}
    
}
