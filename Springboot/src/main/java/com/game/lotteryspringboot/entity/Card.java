package com.game.lotteryspringboot.entity;

public class Card {

    private Suit suit;
    private Rank rank;
    private String back;

// Initialization
    public Card() {
    }

    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public Card(String back) {
        this.back = back;
    }
// Getters and Setters

    public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    public Rank getRank() {
        return rank;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }
}
