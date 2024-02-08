public class Customer {

    private String name;
    private double wallet;

    public Customer(String inputName, double inputWallet){
        this.name = inputName;
        this.wallet = inputWallet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWallet() {
        return wallet;
    }

    public void setWallet(double wallet) {
        this.wallet = wallet;
    }
}
