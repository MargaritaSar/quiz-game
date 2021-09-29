/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_phase1;

/**
 * Περιλαμβάνει τρισδιάστατο πίνακα q,στον οποίο η 1η διάσταση είναι οι κατηγορίες των ερωτήσεων,
 * η 2η διάσταση είναι οι ερωτήσεις κάθε κατηγορίας και η 3η τις ερωτήσεις και τις απαντήσεις τους.
 * Ο δισδιάστατος πίνακας qca έχει τα ζεύγη των ερωτήσεων και των σωστών απαντήσεων.
 * @author Μαργαρίτα Σαράντη & Αναστασία-Κασσιανή Μπλίτση
 */
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Question{
    private final String[][][] q;
    private final String[][] qca;
    
    public Question() throws IOException{
        
        q=new String[3][10][6];
        try {
            BufferedReader in1=new BufferedReader(new FileReader("questions.txt"));
            for (int i=0;i<3;i++){
               for (int j=0;j<10;j++){
                  for (int k=0;k<6;k++){
                      q[i][j][k]=in1.readLine();
                  }
            }
        }
        in1.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Question.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        qca=new String[30][2];
        BufferedReader in2=new BufferedReader(new FileReader("qca.txt"));
        for (int i=0;i<30;i++){
            for (int j=0;j<2;j++){
                qca[i][j]=in2.readLine();
            }
        }
        in2.close();
}
 
    /**
    *@return τον τρισδιάστατο πίνακα q.
    */
    public String[][][] getQuestion(){return q;}
    /**
    *@return τον δισδιάστατο πίνακα qca.
    */
    public String[][] getQCA(){return qca;}
   
    /**
    * @param q πίνακας τρισδιάστατος με όλες τις ερωτήσεις.
    * Επιλέγει τυχαία δύο θέσεις, μία για την κατηγορία και μία για την ερώτηση που θα παίξει ο χρήστης.
    * @return έναν μονοδιάστατο πίνακα ο οποίος είναι η ερώτηση που επιλέχθηκε για τον χρήστη
    * μαζί με τις απαντήσεις της. Προκύπτει κρατώντας σταθερές τις 2 πρώτες θέσεις του τρισδιάστατου
    * με τις μεταβλητές που επιλέχθηκαν τυχαία.
    */
    public String[] getRandomQues(String[][][] q){
        int[] array1={0,1,2};
        int[] array2 = new int[10];
        for (int i=0;i<10;i++){
            array2[i]=i;
        }
        int rnd1= new Random().nextInt(array1.length);
        int rnd2= new Random().nextInt(array2.length);
        return q[rnd1][rnd2];
    }
  
    /**
     *   Η printQues τυπώνει τις ερωτήσεις και τις απαντήσεις 
     * τις οποίες επιλέγει random και τις τοποθετεί σε ένα πίνακα shuffledAnswers.
     * @param q μονοδιάστατος πίνακας
     * @return τον πίνακα shuffledAnswers
     */
    public String[] getAnswers(String[] q){
        
        String[] newArray=new String[4];
        int l=4;
        for (int i=0;i<4;i++){
           newArray[i]=q[i+2];  
        }
        String[] shuffledAnswers= new String[4];
        int j=0;
        do
        {
         int rnd= new Random().nextInt(l);
         shuffledAnswers[j]=newArray[rnd];
         j=j+1;
         for (int i=rnd;i<l-1;i++){
             newArray[i]=newArray[i+1];
         }
        
         l=l-1;
        }while (l>0);
        return shuffledAnswers;
    }
        /**
         * Η checkAnswer συγκρίνει την απάντηση του χρήστη με την θέση που βρίσκεται
         * η σωστή απάντηση χρησιμοποιώντας τους ques και qca
         * @param ques
         * @param answer
         * @param qca
         * @return true εαν η απάντηση του χρήστη είναι σωστή και false αν όχι 
         */
    
}
