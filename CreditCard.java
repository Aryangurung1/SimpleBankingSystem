/**
 * It is a subclass of BankCard class which have six attribute int cvcNumber, double creditLimit, double interestRate, 
 * String expirationDate, int gracePeriod and boolean isGranted. The class has constructor that accepts eight parameters:
 * int cardId, String clientName, String issuerBank, String bankAccount, double balanceAmount, int cvcNumber, double 
 * interestRate, String expirationDate.It calls parent class constructor method using "super" keyword. To access and 
 * return the values of attributes, the class has six getter methods of each attribute and setter method for setting
 * the creditLimit, gracePeriod which checks if the creditLimit is less than or equal to 2.5 times the balanceAmount.
 * The class also includes a method to cancel the credit card, which sets the value of cvcNumber, creditLimit, gracePeirod to 
 * zero and isGranted variable to false and prints "credit card cancelled." It has a display method that calls the parent
 * class display method and prints information about the credit limit if isGranted is true
 *
 * @author (22067585 Aryan Gurung)
 * @version (5.1.0)
 */
public class CreditCard extends BankCard
{
    //attribute for cvcNumber
    private int cvcNumber;
    //attribute for creditLimit
    private double creditLimit;
    //attribute for interestRate
    private double interestRate;
    //attribute for expirationDate
    private String expirationDate;
    //attribute for gracePeriod
    private int gracePeriod;
    //attribute for isGranted
    private boolean isGranted;

    /*This is a constructor method. It accepts string expirationDate, String issuerBank, String clientName, String bankAccount
     * int cvcNumber, int cardId double interestRate double balanceAmount as parameters. it calls parent class constructor.
     * it calls setter method setClientName of superclass to set client name. it assign the attribute value isGranted to false.
     * it assigns the values of the instance variables for cvcNumber, interestRate, and expirationDate with its parameter value.
     */
    public CreditCard(int cardId, String clientName, String issuerBank, String bankAccount, double balanceAmount, 
    int cvcNumber, double interestRate, String expirationDate)
    {
        //call made to superclass constructor method
        super(balanceAmount, cardId, bankAccount, issuerBank);
        //call made to superclass setter method
        super.setClientName(clientName);
        this.cvcNumber = cvcNumber;
        this.interestRate = interestRate;
        this.expirationDate = expirationDate;
        this.isGranted = false;
    }

    //This is a getter method and used to return the value of cvcNumber
    public int getCvcNumber()
    {
        return this.cvcNumber;
    }

    //This is a getter method and used to return the value of creditLimit
    public double getCreditLimit()
    {
        return this.creditLimit;
    }

    //This is a getter method and used to return the value of interestRate
    public double getInterestRate()
    {
        return this.interestRate;
    }

    //This is a getter method and used to return the value of expirationDate
    public String getExpirationDate()
    {
        return this.expirationDate;
    }

    //This is a getter method and used to return the value of gracePeriod
    public int getGracePeriod()
    {
        return this.gracePeriod;
    }

    //This is a getter method and used to return the value of isGranted
    public boolean getIsGranted()
    {
        return this.isGranted;
    }

    /*This is a setter method named setCreditLimit() which accepts two parameters double creditLimit, int gracePeriod.
     *The creditLimit attribute is checked to see if it is less than or equal to 2.5 times the value of the 
     *balanceAmount attribute. if the condition is true display "credit limit granted" and sets the variables
     *creditLimit, gracePeriod with its parameter value. and set attribute is granted to true also print "Credit limit granted".
     *prints "Credit limit not granted" if condition is false
     */
    public void setCreditLimit(double creditLimit, int gracePeriod)
    {
        if (creditLimit <= (super.getBalanceAmount() * 2.5)) {
            this.creditLimit = creditLimit;
            this.gracePeriod = gracePeriod;
            this.isGranted = true;
            System.out.println("Credit limit granted.");
        } else {
            System.out.println("Credit limit not granted.");
        }
    }
    
    /*This is a void cancelCreditCard() method which sets the values of instance variable cvcNumber,
     *creditLimit, gracePeriod" to zero and set attribute isGranted to false. It also prints "Credit card cancelled".
     */
    public void cancelCreditCard()
    {
        this.cvcNumber = 0;
        this.creditLimit = 0;
        this.gracePeriod = 0;
        this.isGranted = false;
        System.out.println("Credit card cancelled.");
    }

    /*This is void display method which checks isGranted attribute is true. if so, then display method of
     * superclass is called and the values of creditLimit and gracePeriod attribute are printed. The values of cvcNumber, 
     * interestRate, expirationDate" are displayed and "Credit not granted yet." is printed as well as called display method
     * of super class if isGranted attribute is set other than true.
     */
    public void display()
    {
        if (this.isGranted == true) {
            super.display();
            System.out.println("Credit Limit: " + this.creditLimit);
            System.out.println("Grace Period: " + this.gracePeriod);
        } else {
            super.display();
            System.out.println("cvcNumber: "+ this.cvcNumber);
            System.out.println("interestRate: "+ this.interestRate);
            System.out.println("expirationDate: "+ this.expirationDate);
            System.out.println("Credit not granted yet.");
        }
    }
}
