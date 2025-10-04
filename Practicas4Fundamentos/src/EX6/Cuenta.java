package EX6;

public class Cuenta {
    private String accountNumber;
    private double balance;

    public Cuenta(String accountNumber, double balance) {
        //Validacion del numero de cuenta

        if (accountNumber == null || accountNumber.isEmpty()) {
            throw new IllegalArgumentException("Error. El numero de cuenta no puede ser nulo o estar vacio");
        }

        if (balance < 0) {
            throw new IllegalArgumentException("Error. El balance no puede ser negativo");
        }
        //Inicializacion del numero de cuenta y balance
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public static void main(String[] args) {
        Cuenta c1 = new Cuenta("1066V", 900.125);
        System.out.println(c1.accountNumber);
        System.out.println(c1.balance);

        Cuenta c2 = new Cuenta("", -15);
        System.out.println(c2.accountNumber);
        System.out.println(c2.balance);
    }
}
