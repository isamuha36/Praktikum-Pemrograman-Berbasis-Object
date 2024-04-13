import java.util.ArrayList;

public class Bank {
    ArrayList<Card> cardList = new ArrayList<Card>();
    private String bankName;


    public boolean checkCard (Integer card){
        boolean cek = true;
        for (int i = 0; i < cardList.size(); i++){
            if(cardList.get(i).getCardNumber().equals(card)){
                System.out.println("Card number already exist");
                cek = false;
                break;
            }
        }
        return cek;
    }
    public void addCard(Card card){
        cardList.add(card);
    }


    public void takeMoney()

    public  int withdraw(Integer id, Integer pin, Integer nominal){
        Card card = sear
    }

    private int takeMoney(Card card, int nominal){
        if(isa)
    }
}
