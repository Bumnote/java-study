package classpart.ex3;

public class PhoneStoreTest {

    public static void main(String[] args) {
        Phone phone = new Phone("아이폰", 100_0000);
        PhoneStore store = new PhoneStore(phone);
        Customer customer = new Customer("김용범", 100_0000);
        customer.buyPhone(store);
    }
}
