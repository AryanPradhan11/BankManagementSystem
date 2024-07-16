package CourseWork;

public class BankCard
{
    // class attributes
    private int cardId;
    private String clientName;
    private String issuerBank;
    private String bankAccount;
    private double balanceAmount;

    // constructor
    public BankCard(double balanceAmount, int cardId, String bankAccount, String issuerBank) {
        this.balanceAmount = balanceAmount;
        this.cardId = cardId;
        this.bankAccount = bankAccount;
        this.issuerBank = issuerBank;
        this.clientName = "";  // initialize clientName to an empty string
    }
    
    //accessor method
    public int getcardId()
    {
        return this.cardId;
    }
    
    public String getclientName()
    {
        return this.clientName;
    }
    
    public String getissuerBank()
    {
        return this.issuerBank;
    }
    
    public String getbankAccount()
    {
        return this.bankAccount;
    }
    
    public double getbalanceAmount()
    {
        return this.balanceAmount;
    }
    
    //method to set the client name
    public void setClientName(String newClientName)  {
        this.clientName = newClientName;
    }
    
    //method to set the balance amount
    public void setBalanceAmount(double newBalanceAmount)  {
        this.balanceAmount = newBalanceAmount;
    }
    
    //method to display card details
    public void display()  {
        if (clientName.isEmpty())  {
            System.out.println("Client name has not been set");
        } else {
            System.out.println("Card ID: "+ cardId);
            System.out.println("Client Name: "+ clientName);
            System.out.println("Issuer bank: "+ issuerBank);
            System.out.println("Bank account: "+ bankAccount);
            System.out.println("Balance amount: "+ balanceAmount);
        }
    }
}

