package io.zipcoder;

/**
 * Created by roberthitchens3 on 1/24/16.
 */
public class Card {
    private String suit;
    private String rank;
    public Card(String suit, String rank){
        this.suit = suit;
        this.rank = rank;
    }
    public void printCard(){
        System.out.println("suit: "+suit+"    rank: "+rank);
    }
    public String getSuit(){
        return suit;
    }
    public String getRank(){
        return rank;
    }
}
