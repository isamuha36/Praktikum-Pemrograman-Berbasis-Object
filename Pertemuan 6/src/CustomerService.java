import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Random;

public class CustomerService {

    private static Bank bank = new Bank();

    public static Card createCard(String name,
                                  String addres,
                                  Integer nik,
                                  String job,
                                  String gender,
                                  String dateOfBirthInString,
                                  Card.TYPE type,
                                  Integer saldo,
                                  Integer pin) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy",
                Locale.ENGLISH);
        Date date ;
        try {
            date = dateFormat.parse(dateOfBirthInString);
        }
        catch (Exception e) {
            date = new Date();
        }

        // Buat object ownernya
        Owner owner = new Owner(name, addres, nik, job, gender, date);

        Random rand = new Random();

        Integer newCardNumber = rand.nextInt(999999);
        while (!bank.checkCard(newCardNumber)) {
            newCardNumber = rand.nextInt(999999);
        }

        Card card = new Card(newCardNumber, saldo,true, owner, pin,type);
        bank.addCard(card);
        return card;


        // newCardNumber harus dicek dulu valid tidaknya oleh bank
        // jika tidak valid, newCardNumber harus digenerate ulang terus
        // jika valid, maka card bisa dicreate kemudian harus dimasukkan ke bank


        //return cardnya
    }
}
