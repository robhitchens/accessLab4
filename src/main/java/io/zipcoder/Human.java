package io.zipcoder;
import java.util.ArrayList;

/**
 * Created by roberthitchens3 on 1/24/16.
 */
public class Human {
    private int id;
    private ArrayList<Card> hand;
    private boolean aceFound;
    private int score;
    public Human(int id){
        this.id =id;
        aceFound = false;
        hand = new ArrayList<Card>();
        score = 0;
    }
    public int getId(){
        return id;
    }
    public void addCard(Card card){
        hand.add(card);
    }
    public int getScore(){
        return score;
    }
    public void calcScore(){
        score = 0;
        Card temp = null;
        for(int i = 0; i<hand.size(); i++){
            temp = hand.get(i);
            if(temp.getRank().equals("Jack") && (temp.getSuit().equals("Spades") || temp.getSuit().equals("Clubs"))){
                score+=10;
            }else if(temp.getRank().equals("Jack") && (temp.getSuit().equals("Hearts")||temp.getSuit().equals("Diamonds"))){
                score+=15;
            }else if(temp.getRank().equals("Queen") && (temp.getSuit().equals("Clubs")||temp.getSuit().equals("Spades"))){
                score+=14;
            }else if(temp.getRank().equals("Queen")&&(temp.getSuit().equals("Hearts")||temp.getSuit().equals("Diamonds"))){
                score+=18;
            }else if(temp.getRank().equals("King")&& (temp.getSuit().equals("Clubs")||temp.getSuit().equals("Spades"))){
                score+=20;
            }else if(temp.getRank().equals("King") && (temp.getSuit().equals("Hearts")||temp.getSuit().equals("Diamonds"))){
                score+=20;
            }
        }

    }
    public boolean getAceStatus(){
        return aceFound;
    }
    public void changeAceFound(){
        aceFound = true;
    }
}
