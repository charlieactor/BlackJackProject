package com.skilldistillery.cards.players;

import java.util.Collections;

import com.skilldistillery.cards.Card;
import com.skilldistillery.cards.Deck;

public class Dealer extends Player {

	Deck deck;

	public Dealer() {
		deck = new Deck();
	}
	
	public void newDeck() {
		this.deck = new Deck();
	}

	public String determineWhatToDo() {
		String decision;
			if (this.getTotal() > 16) {
				decision = "stay";
			} else {
				decision = "hit";
			}
		return decision;
	}

	public void Shuffle() {
		Collections.shuffle(deck.getDeck());
	}

	public Card hit() {
		return deck.getDeck().remove(0);
	}

	public void deal(Player user, Player dealer) {
		user.setHand(this.deck.getDeck().remove(0));
		dealer.setHand(this.deck.getDeck().remove(0));
		user.setHand(this.deck.getDeck().remove(0));
		dealer.setHand(this.deck.getDeck().remove(0));
	}

	@Override
	public void stay() {
		// TODO Auto-generated method stub
	}

	public Deck getDeck() {
		return deck;
	}

	public void setPlayingDeck(Deck deck) {
		this.deck = deck;
	}

}
