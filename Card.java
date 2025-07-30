public class Card {
    private int value;
    private String suit;
    public Card(int value, String suit){
this.value=value;
this.suit=suit;
    }
    public int valueGet(){
        return value;
    }
    public String suitGet(){
        return suit;
    }
    public String toString(){
        String svalue="J";
        if(value==11){
            return svalue+" of "+suit;
        }
String vvalue="Q";
        if(value==12){
            return vvalue+" of "+suit;
        }
        String dvalue="K";
        if(value==13){
            return dvalue+" of "+suit;
        }
        String uvalue="A";
        if(value==1){
            return uvalue+" of "+suit;
        }
        else{
            return value+" of "+suit;
        }

    }
    public void setValue(int a){
value=a;
    }
    public void setSuit(String b){
suit=b;
    }
}
