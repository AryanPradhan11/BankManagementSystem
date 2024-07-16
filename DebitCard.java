package CourseWork;

public class DebitCard extends BankCard
{
    private int pin;
    private int withdrawalamount;
    private String dateofwithdrawal;
    private boolean haswithdrawn;

    public DebitCard(double balanceAmount, int cardId, String bankAccount, String issuerBank, String clientName, int pin) {
        super(balanceAmount,cardId, bankAccount, issuerBank);
        setClientName(clientName);
        super.getclientName();
        this.pin = pin;
        this.haswithdrawn = false;
    }

    public int getpin() {
        return pin;
    }

    public int getwithdrawalamount() {
        return withdrawalamount;
    }

    public String getdateofwithdrawal() {
        return dateofwithdrawal;
    }

    public boolean gethaswithdrawn() {
        return haswithdrawn;
    }

    public void setWithdrawalAmount(int withdrawalAmount) {
        this.withdrawalamount = withdrawalamount;
    }

    public void withdraw(int withdrawalamount, String dateofwithdrawal, int pin) {
        if (this.pin == pin) {
            if (super.getbalanceAmount() >= withdrawalamount) {
                setBalanceAmount(super.getbalanceAmount() - withdrawalamount);
                this.withdrawalamount = withdrawalamount;
                this.dateofwithdrawal = dateofwithdrawal;
                this.haswithdrawn = true;
            } else {
                System.out.println("Insufficient balance.");
            }
        } else {
            System.out.println("Invalid PIN.");
        }
    }

    public void display() {
        super.display();
        System.out.println("PIN: " + pin);
        if (haswithdrawn) {
            System.out.println("Withdrawal Amount: " + withdrawalamount);
            System.out.println("Date of Withdrawal: " + dateofwithdrawal);
        } else {
            System.out.println("Transaction not carried out yet.");
        }
    }
}