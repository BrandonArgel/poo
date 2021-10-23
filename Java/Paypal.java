package Java;

class PayPal extends Payment {

    String email;

    public PayPal(int id, String email) {
        super(id);
        this.email = email;
    }
}