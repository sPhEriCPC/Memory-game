
package MemoryGame;

import java.util.Random;

public class Memory {
    
     int score;
     boolean scoreAdder;
     int currentNum;
     int currentGuess;
     int level;
    
    public Memory( int sc, boolean add, int cuNum, int cuGue, int lvl) {
    score= sc;
    scoreAdder= add;
    currentNum= cuNum;
    currentGuess= cuGue;
    level= lvl;
    }
    
     
     
      public int numGenerator (int numOfDigits ){
        Random random = new Random();
        int num2guess= random.nextInt(9)+1;
        for (int i=1;i<numOfDigits;i++){
        num2guess= num2guess*10+random.nextInt(10);
    }
        return num2guess;
    }
    
    public boolean check (int guess, int answer){
        return guess==answer;
    }
    
    
    
}
