/**
 * It is a subclass of BankCard class which have four attributes int pinNumber, int withdrawalAmount, String dateOfWithdrawal 
 * and boolean hasWithdrawn.The class has a constructor that takes six parameters including double balanceAmount, int cardId,
 * String bankAccount, String issuerBank, String clientName, int pinNumber It calls the parent class constructor using super keyword.
 * the class has a number of accessor and mutator methods to altering the attribute's values. It has methods for money withdraw
 * which verify the validity of the pinNumber and determine if the withdrawalAmount is less than or equal to the balanceAmount.
 * Additionally, the class has a display method that calls parent class display method and prints information about withdrawal. 
 *
 * @author (22067585 Aryan Gurung)
 * @version (5.1.0)
 */
public class DebitCard extends BankCard
{
    //attribute for pin number
    private int pinNumber;
    //attribute for withdrawal amount
    private int withdrawalAmount;
    //attribute for date of withdrawal
    private String dateOfWithdrawal;
    //attribute for has withdrawan
    private boolean hasWithdrawn;
    
    /*This is a constructor method which accepts six parameters: double balanceAmount, int cardId, int pinNumber
     * and String bankAccount, String issuerBank, String clientName. using "super" keyword it calls the parent class
     * constructor. client name is set by using setter method of parent class. The pinNumber is assigned with its parameter
     * value and hasWithdrawn property is changed to false.
     */
    public DebitCard(double balanceAmount, int cardId, String bankAccount, String issuerBank, String clientName, int pinNumber)
    {
        //call made to a parent class constructor
        super(balanceAmount, cardId,bankAccount, issuerBank);
        //make a call to the superclass setter method
        super.setClientName(clientName);
        this.pinNumber = pinNumber;
        this.hasWithdrawn = false;
    }
    
    //This is a getter used to return the value of pinNumber
    public int getPinNumber()
    {
        return this.pinNumber;
    }

    // This is a getter used to return the value of withdrawalAmount
    public int getWithdrawalAmount()
    {
        return this.withdrawalAmount;
    }

    // This is a getter used to return the value of dateOfWithdrawal
    public String getDateOfWithdrawal()
    { 
        return this.dateOfWithdrawal;
    }

    // This is a getter used to return the value of hasWithdrawan
    public boolean getHasWithdrawn()
    {
        return this.hasWithdrawn;
    }

    // This is a setter used to assign the value of withdrawalAmount
    public void setWithdrawalAmount(int withdrawalAmount)
    { 
        this.withdrawalAmount = withdrawalAmount;
    }
    
    
    /*This is a void withdraw method that allow user to withdraw amount from debit card. It accepts three parameters:
     *int withdrawalAmount, int pinNumber and String dateOfWithdrawal. It checks whether the entered pinNumber matches
     *the card pinNumber first then determines if the withdrawalAmount is less than or equal to the current balanceAmount. 
     *if both conditon valid then it assign instance variable withdrawalAmount and dateOfWithdrawal to it's prarameter value
     *and deduct the withdrawalAmount from balanceAmount and set hasWithdrawn property to true. it also print suitable error 
     *message if pinNumber is not valid or have insufficient balance.
     */
    public void withdraw(int withdrawalAmount, String dateOfWithdrawal, int pinNumber)
    {
        if (this.pinNumber == pinNumber) {
            if (withdrawalAmount <= super.getBalanceAmount()) {
                this.withdrawalAmount = withdrawalAmount;
                this.dateOfWithdrawal = dateOfWithdrawal;
                super.setBalanceAmount(super.getBalanceAmount() - withdrawalAmount);
                this.hasWithdrawn = true;
                System.out.println("Withdrawal successful. New balance: " + super.getBalanceAmount());//documentation remaining
            }
            else{
                System.out.println("Insufficient funds.");
            }
        }
        else{
            System.out.println("Invalid PIN.");
        }
    }
    
    
    /*This is a method name display which first calls display method of super class using "super" keyword.
     *it checks whether the value of hasWithdrawn attribut is set to true, if so then prints the value of
     *withdrawalAmount, dateOfWithdrawal and pinNumber. if the value of hasWithdrawn attribute set to other than true
     *it calls getter method getBalanceAmount() of super class to print balancAmount.
     */
    public void display()
    {
        super.display();
        if (this.hasWithdrawn == true)
        {
            System.out.println("Withdrawal Amount: " + this.withdrawalAmount);
            System.out.println("Date of Withdrawal: " + this.dateOfWithdrawal);
            System.out.println("PIN Number: " + this.pinNumber);
        } 
        else {
            System.out.println("Your Balance Amount: "+ super.getBalanceAmount());
        }
    }
}