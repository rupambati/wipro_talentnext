package miniProjects;
import java.util.*;

class Cardp {
    private String symbol;
    private int number;

    public Cardp(String symbol, int number) {
        this.symbol = symbol.toLowerCase(); 
        this.number = number;
    }

    public String getSymbol() {
        return symbol;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return symbol + " " + number;
    }
}

public class MiniProject4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        Map<String, List<Cardp>> cardMap = new TreeMap<>(); 

        System.out.print("Enter Number of Cards: ");
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 1; i <= n; i++) {
            System.out.println("Enter card " + i + ":");
            String symbol = sc.nextLine().trim().toLowerCase();
            int number = Integer.parseInt(sc.nextLine().trim());

            Cardp card = new Cardp(symbol, number);

            cardMap.putIfAbsent(symbol, new ArrayList<>());
            cardMap.get(symbol).add(card);
        }

        System.out.println("Distinct Symbols are :");
        for (String symbol : cardMap.keySet()) {
            System.out.print(symbol + " ");
        }
        System.out.println();

        for (String symbol : cardMap.keySet()) {
            List<Cardp> cards = cardMap.get(symbol);
            System.out.println("Cards in " + symbol + " Symbol");
            int sum = 0;
            for (Cardp card : cards) {
                System.out.println(card);
                sum += card.getNumber();
            }
            System.out.println("Number of cards : " + cards.size());
            System.out.println("Sum of Numbers : " + sum);
        }

	}

}