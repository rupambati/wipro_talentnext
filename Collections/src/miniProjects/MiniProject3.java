package miniProjects;

import java.util.*;

class Card {
    private String symbol;
    private int number;

    public Card(String symbol, int number) {
        this.symbol = symbol;
        this.number = number;
    }

    public String getSymbol() {
        return symbol;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Card)) return false;
        Card c = (Card) obj;
        return symbol.equals(c.symbol) && number == c.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(symbol, number);
    }

    @Override
    public String toString() {
        return symbol + " " + number;
    }
}

public class MiniProject3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        Set<Card> cardSet = new LinkedHashSet<>();
        Set<String> symbolSet = new HashSet<>();
        int cardCount = 0;

        while (symbolSet.size() < 4) {
            System.out.println("Enter a card :");
            String symbol = sc.nextLine().trim().toLowerCase();  
            int number = Integer.parseInt(sc.nextLine().trim());

            Card card = new Card(symbol, number);
            cardSet.add(card);
            symbolSet.add(symbol);
            cardCount++;
        }

        System.out.println("Four symbols gathered in " + cardCount + " cards.");
        System.out.println("Cards in Set are :");

        TreeMap<String, Card> firstOccurrenceMap = new TreeMap<>();
        for (Card card : cardSet) {
            if (!firstOccurrenceMap.containsKey(card.getSymbol())) {
                firstOccurrenceMap.put(card.getSymbol(), card);
            }
        }

        for (Card card : firstOccurrenceMap.values()) {
            System.out.println(card);
        }
	}

}