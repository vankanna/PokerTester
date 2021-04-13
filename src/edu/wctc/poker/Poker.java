package edu.wctc.poker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Poker {

    public Poker(){

    }


    /**
     * Checks to see if a poker hand is a "Straight" ( 5 cards in sequential order ), you must pass in a valid hand of poker cards
     *
     * @param  hand  a list of playing cards
     * @return      a boolean signaling if the hand is "Straight" or not
     */
    public boolean isStraight(List<Card> hand) {
        boolean isTheHand = true;
        int prevScore = 0;
        int score = 0;
        for(int i=0; i<5; i++){
            Card card = hand.get(i);
            score = card.getScore();
            if ((score != prevScore+1) && (i != 0)) isTheHand = false;
            prevScore = score;
        }
        return isTheHand;


    }
    /**
     * Checks to see if a poker hand is a "Straight Flush" ( Cards 10, Jack, Queen, King, Ace ), you must pass in a valid hand of poker cards
     *
     * @param  hand  a list of playing cards
     * @return      a boolean signaling if the hand is "Straight Flush" or not
     */
    public boolean isStraightFlush(List<Card> hand) {
        boolean isTheHand = true;
        int prevScore = 0;
        String prevSuit ="";
        int score = 0;
        String suit ="";

        for(int i=0; i<5; i++){
            Card card = hand.get(i);
            score = card.getScore();
            if (((score != prevScore+1) && (i != 0)) || ! suit.equalsIgnoreCase(prevSuit) && i != 0) {
                isTheHand = false;
            }

            prevScore = score;
            prevSuit = suit;
        }
        return isTheHand;


    }

    /**
     * Checks to see if a poker hand is a "Three of a Kind" ( Three matching cards ), you must pass in a valid hand of poker cards
     *
     * @param  hand  a list of playing cards
     * @return      a boolean signaling if the hand is "Three of a Kind" or not
     */
    public boolean isThreeOfAKind(List<Card> hand) {
        boolean isTheHand = false;
        for(int i=0; i<5; i++){
            Card card = hand.get(i);
            int matches = 0;
            for(int j=0; j<5; j++){
                if(card.getScore() == hand.get(j).getScore()) {
                    matches++;
                }
            }
            if(matches == 3) {
                isTheHand = true;
            }
        }
        return isTheHand;
    }

    /**
     * Checks to see if a poker hand is a "Four of a Kind" ( Four matching Cards ), you must pass in a valid hand of poker cards
     *
     * @param  hand  a list of playing cards
     * @return      a boolean signaling if the hand is "Four of a Kind" or not
     */
    public boolean isFourOfAKind(List<Card> hand) {
        boolean isTheHand = false;
        for(int i=0; i<5; i++){
            Card card = hand.get(i);
            int matches = 0;
            for(int j=0; j<5; j++){
                if(card.getScore() == hand.get(j).getScore()) {
                    matches++;
                }
            }
            if(matches == 4) {
                isTheHand = true;
            }
        }
        return isTheHand;
    }

    /**
     * Checks to see if a poker hand is a "Pair" ( A pair of matching cards) , you must pass in a valid hand of poker cards
     *
     * @param  hand  a list of playing cards
     * @return      a boolean signaling if the hand is "Pair" or not
     */
    public boolean isOnePair(List<Card> hand) {
        boolean isTheHand = false;
        for(int i=0; i< hand.size(); i++){
            Card card = hand.get(i);
            int matches = 0;
            for(int j=0; j<hand.size(); j++){
                if(card.getScore() == hand.get(j).getScore()) {
                    matches++;
                }
            }
            if(matches == 2) {
                isTheHand = true;
            }
        }
        return isTheHand;
    }

    /**
     * Checks to see if a poker hand is a "Two Pair" ( Two pairs of matching cards ), you must pass in a valid hand of poker cards
     *
     * @param  hand  a list of playing cards
     * @return      a boolean signaling if the hand is "Two Pair" or not
     */
    public boolean isTwoPair (List<Card> hand) {
        boolean isTheHand = false;
        hand.sort(Comparator.comparingInt(Card::getScore));

        int pairs = 0;
        if((hand.get(0) == hand.get(1)) && ( hand.get(0) != hand.get(2))) {
            pairs++;
        }
        if((hand.get(1) == hand.get(2)) && ( hand.get(1) != hand.get(3))) {
            pairs++;
        }
        if((hand.get(2) == hand.get(3)) && ( hand.get(2) != hand.get(4))) {
            pairs++;
        }
        if((hand.get(3) == hand.get(4))) {
            pairs++;
        }

        if(pairs == 2) {
            isTheHand = true;
        }

        return isTheHand;
    }

    /**
     * Checks to see if a poker hand is a "High Card" ( Ace ), you must pass in a valid hand of poker cards
     *
     * @param  hand  a list of playing cards
     * @return      a boolean signaling if the hand is "High Card" or not
     */
    public boolean isHighCard(List<Card> hand) {
        boolean isTheHand = false;
        for(int i = 0; i < 5; i++){
            Card card = hand.get(i);
            if (card.getScore() == 14) {
                isTheHand = true;
                break;
            }
        }

        return isTheHand;
    }
}
