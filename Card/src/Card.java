/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author test
 */
public class Card {

    private String suit;
    //Hearts,Spades,Diamonds,Clubs

        private int value;
        
    private String aaaa;

    /**
     * Get the value of aaaa
     *
     * @return the value of aaaa
     */
    public String getAaaa() {
        return aaaa;
    }

    /**
     * Set the value of aaaa
     *
     * @param aaaa new value of aaaa
     */
    public void setAaaa(String aaaa) {
        this.aaaa = aaaa;
    }

        public Card(String givenSuit,int givenValue)
        {
            suit=givenSuit;
            value=givenValue;
        }
    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        if(suit.equals("Hearts")||suit.equals("Spades")||suit.equals("Diamonds")||suit.equals("Clubs"))
        {
        this.suit = suit;
        }
        else
        {
            System.out.println("Not valid Suit");
        }
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        if(value<1 || value>13)
        {
            System.out.println("Not in range 1-13");
        }
        else
        {
            this.value = value;
        }
    }
    

    
}
