package com.skilldistillery.cards.players;

import java.util.ArrayList;
import java.util.List;

import com.skilldistillery.cards.*;

public abstract class Player {
	protected List<Card> hand = new ArrayList<>();
	protected double money;
	protected int total;
	
	public int getTotal() {
		int total = 0;
		for (int i = 0; i < this.hand.size(); i++){
			total += this.hand.get(i).getRank().value();
		}
		return total;
	}
	
	public int getNewTotal(){
		return total;
	}
	
	public void setTotal(int total) {
		this.total = total;
	}
	
	public abstract void stay();
	public List<Card> getHand() {
		return hand;
	}
	public void setHand(Card card) {
		this.hand.add(card);
	}
	
	public void resetHand() {
		this.hand.removeAll(hand);
	}
	
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		this.money = money;
	}
	
}
