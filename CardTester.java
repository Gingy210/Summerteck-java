public class CardTester {
    public static void main(String[]arrgs){
        
Card card=new Card(5, "Spades");
System.out.println(card.valueGet());
System.out.println(card.suitGet());
System.out.println(card);
card.setValue(4);
card.setSuit("Politoeds");
System.out.println(card);
CardDeck.print();
}
    
}
