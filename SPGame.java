/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_phase1;

/**
 * Η κλάση Game επιλέγει τυχαία έναν τύπο γύρου και ξεκινάει το παιχνίδι
 * δημιουργώντας το αντικείμενο Round
 * μέσω του οποίου δημιουργείται και το αντικείμενο User.
 * @author Μαργαρίτα Σαράντη & Αναστασία-Κασσιανή Μπλίτση
 */
import java.io.IOException;
import java.util.Random;

public class SPGame {
    private final String[] rounds;
    private final SPRound selectedRound;
    public SPGame(User player) throws IOException{
        rounds= new String[2];
        rounds[0]="Σωστή Απάντηση";
        rounds[1]="Ποντάρισμα";
        int random= new Random().nextInt(rounds.length);
        selectedRound= new SPRound(rounds[random],player);
    }
    /**
    *@return το τρέχον αντικείμενο SPRound
    */
    public SPRound getRound() {return selectedRound;}
    
}
