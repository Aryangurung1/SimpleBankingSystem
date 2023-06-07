/**
 * This is a parent class named BankCard which has five attributes : int cardId, String clientName, String issuerBank,
 * String bankAccount and double balanceAmount. The class has a constructor that accepts four parameters : double 
 * balanceAmount,int cardId, String bankAccount and String issuerBank, and assigns these with corresponding attributes.
 * Each attribute has accessor methods and setter methods for the clientName and balanceAmount attributes. It has display 
 * method that checks if the clientName is empty string or not. if not then all the value of attributes of BankCard class 
 * are printed.
 *
 * @author (22067585 Aryan Gurung)
 * @version (5.1.0)
 */
public class BankCard
{
    //attribute for card id 
   private int cardId;
   // attribute for client name
   private String clientName; 
   //attribute for issuer bank
   private String issuerBank;
   // attribute for bank account
   private String bankAccount;
   // attribute for balance amount
   private double balanceAmount;

   /*This is a constructor which acceps four parameters: double balanceAmount, int cardId, 
    *String bankAccount, and String issuerBank. It sets the clientName instance variable 
    *to be an empty string. It assign the instance variable balanceAmount, cardId, bankAccount, issuerBank
    *with its respective parameters.
    */
   public BankCard(double balanceAmount, int cardId, String bankAccount, String issuerBank)
   {
       //Assign instance variable:balannceAmount, cardId, bankAccount, issuerBank with its parameter value
       this.balanceAmount = balanceAmount;
       this.cardId = cardId;
       this.bankAccount = bankAccount;
       this.issuerBank = issuerBank;
       this.clientName = "";
   }
   
   //This is a getter method and used to return the value of cardId
   public int getCardId()
   {
       return this.cardId;
   }
   
   //This is a getter method and used to return the value of clientName
   public String getClientName()
   {
       return this.clientName;
   }
   
   //This is a getter method and used to return the value of issuerBank
   public String getIssuerBank()
   { 
       return this.issuerBank;
   }
   
   //This is a getter method and used to return the value of bankAccount
   public String getBankAccount()
   {
       return this.bankAccount;
   }
   
   //This is a getter method and used to return the valaue of balanceAmount
   public double getBalanceAmount()
   {
       return this.balanceAmount;
   }
   
   //This is a setter method and used to assign the valaue of clientName
   public void setClientName(String clientName)
   { 
       this.clientName = clientName;
   }
   
   //This is a setter method and used to assign the valaue of balanceAmount
   public void setBalanceAmount(double balanceAmount)
   {
       this.balanceAmount = balanceAmount;
   }
   
   /*This is void display method that checks that the clientName attribute does not contain an empty string.
    * If so, then display "Client name not assigned." If the clientName attribue contains a value other than
    * empty string then display the values of the attributes cardId, clientName, issuerBank, bankAccount, balanceAmount.
    */
   public void display()
   {
       if(clientName.equals("")){
           System.out.println("Client name not assigned.");
       }
        else{
            //display the value of instance variable cardId, clientName, issuerBank, bankAccount, balanceAmount
           System.out.println("The card Id is: " + this.cardId);
           System.out.println("The client name is: " + this.clientName);
           System.out.println("The issuer bank is: " + this.issuerBank);
           System.out.println("The bank account is: " + this.bankAccount);
           System.out.println("The balance amount is: " + this.balanceAmount);
        }
    }
}