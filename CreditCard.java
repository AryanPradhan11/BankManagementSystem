package CourseWork;


/**
 * Write a description of class CreditCard here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CreditCard extends BankCard
{
    private int cvc;
    private double creditLimit;
    private double interestRate;
    private String expirationDate;
    private int gracePeriod;
    private boolean isGranted;

    public CreditCard(int cardId, String clientName, String issuerBank, String bankAccount, int balanceAmount, int cvc, double interestRate, String expirationDate) {
        super(balanceAmount, cardId, bankAccount, issuerBank);
        setClientName(clientName);
        this.cvc = cvc;
        this.interestRate = interestRate;
        this.expirationDate = expirationDate;
        this.isGranted = false;
    }

    public int getCVC() {
        return cvc;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public int getGracePeriod() {
        return gracePeriod;
    }

    public boolean getIsGranted() {
        return isGranted;
    }

    public void setCreditLimit(double creditLimit, int gracePeriod) {
        if (creditLimit <= 2.5 * getbalanceAmount()) {
            this.creditLimit = creditLimit;
            this.gracePeriod = gracePeriod;
            this.isGranted = true;
        } else {
            System.out.println("Credit cannot be issued.");
        }
    }

    public void cancelCreditCard() {
        if (isGranted) {
            cvc = 0;
            creditLimit = 0;
            gracePeriod = 0;
            isGranted = false;
        } else {
            System.out.println("Invalid Operation");
        }
    }

    public void display() {
        super.display();
        if (isGranted) {
            System.out.println("CVC: " + cvc);
            System.out.println("Credit Limit: " + creditLimit);
            System.out.println("Interest Rate: " + interestRate);
            System.out.println("Expiration Date: " + expirationDate);
            System.out.println("Grace Period: " + gracePeriod);
        } else {
            System.out.println("Credit not granted");
        }
    }
}
