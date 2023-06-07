/**
 * Write a description of class BankGui here.
 *
 * @author (22067585 Aryan Gurung)
 * @version (5.1.0)
 */
import javax.swing.*;
import java.awt.Color;
import java.awt.event.*;
import java.awt.Font;
import java.util.ArrayList;
public class BankGUI implements ActionListener
{
    // declare all the components here
    private JFrame frame, debitFrame, creditFrame;
    private JPanel headerPanel, footerPanel, debitHeaderPanel, debitFooterPanel, creditHeaderPanel,
    creditFooterPanel;
    
    private JLabel nicAsiaLabel,nicAsiaLabel2, contactLabel, atmLabel, branchLabel, welcomeLabel,
    selectAccountLabel, greetingPhoto, namasteLabel, debitPhoto, creditPhoto, logoLabel, contactLabel2,
    atmLabel2, branchLabel2, fillDetailsLabel, clientNameLabel, cardIdLabel, issuerBankLabel, bankAccountLabel,
    balanceAmountLabel, pinNumberLabel, asterixClientLabel, asterixCardIdLabel, asterixIssuerBankLabel,
    asterixBankAccountLabel, asterixBalanceLabel,asterixPinNumberLabel, withdrawMoneyLabel, cardIdLabel2, 
    asterixCardIdLabel2, withdrawalAmountLabel, asterixWithdrawalAmountLabel,withdrawalDateLabel,
    asterixWithdrawalDateLabel, pinNumberLabel2, asterixPinNumberLabel2, logoLabel2, nicAsiaLabel3,
    contactLabel3, atmLabel3, branchLabel3, fillDetailsLabel2, clientNameLabel2, asterixClientLabel2, 
    issuerBankLabel2, asterixIssuerBankLabel2, bankAccountLabel2, asterixBankAccountLabel2,balanceAmountLabel2, 
    asterixBalanceLabel2, expirationDateLabel, asterixExpirationDateLabel, cvcNumberLabel, asterixCVCLabel,
    interestRateLabel, asterixInterestLabel, setCreditLimitLabel, cardIdLabel3, asterixCardIdLabel3, creditLimitLabel, 
    asterixCreditLimitLabel,gracePeriodLabel, asterixGracePeriodLabel, logoLabel3, cardIdLabel4, asterixCardIdLabel4;
    
    //attirbute of JTextField
    private JTextField clientNameField, cardIdField, issuerBankField, bankAccountField,
    balanceAmountField, pinNumberField, cardIdField2, withdrawalAmountField, withdrawalDateField,
    pinNumberField2, clientNameField2, issuerBankField2, bankAccountField2, balanceAmountField2, cvcNumberField,
    interestRateField, cardIdField3, creditLimitField, gracePeriodField, cardIdField4;
    
    private JButton debitButton, creditButton, addDebitButton, withdrawalButton, displayButton, clearButton,
    backButton, addCreditButton, setButton, displayButtonTwo, clearButton2, backButton2, cancelCreditButton;
    
    private JComboBox dayComboBox, monthComboBox, yearComboBox, dayComboBox2, monthComboBox2, yearComboBox2;
    private Color white, black, red;
    
    //attribute for Font
    private Font logoFont, myFont, welcomeFont, selectAccountFont, detailFont,
    asterixFont;
    
    //attribute for Image Icon
    ImageIcon greetingMan = new ImageIcon("Greeting.png");
    ImageIcon debitCardPhoto = new ImageIcon("Debit-Card.jpg");
    ImageIcon creditCardPhoto = new ImageIcon("Credit-Card.jpg");

    //making the Array List
    ArrayList<BankCard> bankCards = new ArrayList<BankCard>();
    public BankGUI(){
        //call made to method of this class which have the main GUI interface
        mainInterface();
    }
    
    public void mainInterface(){
        //create a JFrame
        frame = new JFrame("NIC ASIA");
        
        //color
        white = Color.WHITE;
        black = Color.BLACK;
        red = new Color(255, 56, 35);
        
        //navigation panel
        headerPanel = new JPanel();
        headerPanel.setLayout(null);
        headerPanel.setBounds(0, 0, 600, 63);
        headerPanel.setBackground(red);
        frame.add(headerPanel);
        
        //bottom pannel
        footerPanel = new JPanel();
        footerPanel.setLayout(null);
        footerPanel.setBounds(0, 600, 600, 63);
        footerPanel.setBackground(red);
        frame.add(footerPanel);
        
        //font
        logoFont = new Font("Helvetica", Font.PLAIN, 16);
        myFont = new Font("Helvetica", Font.PLAIN, 14);
        welcomeFont = new Font("Helvetica", Font.BOLD, 20);
        selectAccountFont = new Font("Helvetica", Font.PLAIN, 20);
        
        //make nicAsia Label for Header
        nicAsiaLabel = new JLabel("NIC ASIA");
        nicAsiaLabel.setBounds(80, 20, 71, 22);
        nicAsiaLabel.setFont(logoFont);
        nicAsiaLabel.setForeground(white);
        headerPanel.add(nicAsiaLabel);
        

        //make contact Label
        contactLabel = new JLabel("Contact");
        contactLabel.setBounds(323, 21, 50, 20);
        contactLabel.setFont(myFont);
        contactLabel.setForeground(white);
        headerPanel.add(contactLabel);
        
        //make atm Label
        atmLabel = new JLabel("Atm");
        atmLabel.setBounds(406, 21, 25, 20);
        atmLabel.setFont(myFont);
        atmLabel.setForeground(white);
        headerPanel.add(atmLabel);
        
        //make branch Label
        branchLabel = new JLabel("Branch");
        branchLabel.setBounds(466, 21, 46, 20);
        branchLabel.setFont(myFont);
        branchLabel.setForeground(white);
        headerPanel.add(branchLabel);
        
        //make welcome Label
        welcomeLabel = new JLabel("Welcome to Nic Asia");
        welcomeLabel.setBounds(196, 87, 207, 23);
        welcomeLabel.setFont(welcomeFont);
        welcomeLabel.setForeground(red);
        //make frame.add cause it out of panel
        frame.add(welcomeLabel);
        
        //make select account Label
        selectAccountLabel = new JLabel("Please select your account type");
        selectAccountLabel.setBounds(231, 154, 287, 26);
        selectAccountLabel.setFont(selectAccountFont);
        selectAccountLabel.setForeground(black);
        //make frame.add cause it out of panel
        frame.add(selectAccountLabel);
        
        //gretting man photo
        greetingPhoto = new JLabel(greetingMan);
        greetingPhoto.setBounds(80, 180, 175, 350);
        frame.add(greetingPhoto);
        
        //namaste Label
        namasteLabel = new JLabel("Namaste");
        namasteLabel.setBounds(111, 521, 67, 25);
        namasteLabel.setFont(new Font("Helvetica", Font.BOLD, 16));
        namasteLabel.setForeground(red);
        frame.add(namasteLabel);
        
        //photo of Debit Card
        debitPhoto = new JLabel(debitCardPhoto);
        debitPhoto.setBounds(269, 200, 204, 122);
        frame.add(debitPhoto);
        
        //button of Debit Card
        debitButton = new JButton("Debit Card");
        debitButton.setBounds(311, 330, 120, 32);
        debitButton.setBackground(red);
        //set the border color around the button
        debitButton.setBorder(BorderFactory.createLineBorder(red));
        //remove the border around the text of the button when clicked
        debitButton.setFocusPainted(false);
        debitButton.setForeground(white);
        frame.add(debitButton);
        
        //photo of Credit Card
        creditPhoto = new JLabel(creditCardPhoto);
        creditPhoto.setBounds(264, 394, 214, 117);
        frame.add(creditPhoto);
        
        //button of Credit Card
        creditButton = new JButton("Credit Card");
        creditButton.setBounds(311, 520, 120, 32);
        creditButton.setBackground(red);
        creditButton.setForeground(white);
        //set the border color around the button
        creditButton.setBorder(BorderFactory.createLineBorder(red));
        //remove the border around the text of the button when clicked
        creditButton.setFocusPainted(false);
        frame.add(creditButton);
        
        //make nic asia footer 
        logoLabel = new JLabel("NIC ASIA");
        logoLabel.setBounds(80, 20, 72, 22);
        logoLabel.setFont(logoFont);
        logoLabel.setForeground(white);
        footerPanel.add(logoLabel);
        
        //button actionListener
        debitButton.addActionListener(this);
        creditButton.addActionListener(this);
        
        //add footer phot
        
        //set the size of the frame
        frame.setSize(600, 700);
        //getContentPane you have to know
        frame.getContentPane().setBackground(Color.WHITE);
        //make frame unresizable
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
    public void debitCardInterface(){
        //make Frame for Debit Card
        debitFrame = new JFrame("Debit Card");
        
        //Font
        detailFont = new Font("Helvetica", Font.BOLD, 15);
        asterixFont = new Font("Helvetica", Font.BOLD, 16);
        
        //header navigation panel
        debitHeaderPanel = new JPanel();
        debitHeaderPanel.setLayout(null);
        debitHeaderPanel.setBounds(0, 0, 700, 63);
        debitHeaderPanel.setBackground(red);
        debitFrame.add(debitHeaderPanel);
        
        //bottom navigation panel
        debitFooterPanel = new JPanel();
        debitFooterPanel.setLayout(null);
        debitFooterPanel.setBounds(0, 755, 700, 63);
        debitFooterPanel.setBackground(red);
        debitFrame.add(debitFooterPanel);
        
        //header text nic asia
        nicAsiaLabel2 = new JLabel("NIC ASIA");
        nicAsiaLabel2.setFont(logoFont);
        nicAsiaLabel2.setForeground(white);
        nicAsiaLabel2.setBounds(94, 20, 71, 22);
        debitHeaderPanel.add(nicAsiaLabel2);
        
        //header Contact text
        contactLabel2 = new JLabel("Contact");
        contactLabel2.setBounds(392, 21, 50, 20);
        contactLabel2.setFont(myFont);
        contactLabel2.setForeground(white);
        debitHeaderPanel.add(contactLabel2);
        
        //header Atm Text
        atmLabel2 = new JLabel("Atm");
        atmLabel2.setBounds(480, 21, 25, 20);
        atmLabel2.setForeground(white);
        atmLabel2.setFont(myFont);
        debitHeaderPanel.add(atmLabel2);
        
        //header Branch Text
        branchLabel2 = new JLabel("Branch");
        branchLabel2.setBounds(543, 21, 46, 20);
        branchLabel2.setFont(myFont);
        branchLabel2.setForeground(white);
        debitHeaderPanel.add(branchLabel2);
        
        //details of Debit Card Text
        fillDetailsLabel = new JLabel("Fill out your Debit Card Details");
        fillDetailsLabel.setBounds(119, 95, 196, 20);
        fillDetailsLabel.setForeground(black);
        fillDetailsLabel.setFont(myFont);
        debitFrame.add(fillDetailsLabel);
        
        //Client Name Text
        clientNameLabel = new JLabel("Client Name");
        clientNameLabel.setBounds(119, 123, 91, 22);
        clientNameLabel.setFont(detailFont);
        clientNameLabel.setForeground(black);
        debitFrame.add(clientNameLabel);
        
        //asterix for clientNameText
        asterixClientLabel = new JLabel("*");
        asterixClientLabel.setBounds(208, 124, 14, 22);
        asterixClientLabel.setForeground(red);
        asterixClientLabel.setFont(asterixFont);
        debitFrame.add(asterixClientLabel);
        
        //Text Field for ClientName Text
        clientNameField = new JTextField();
        clientNameField.setBounds(119, 152, 182, 32);
        debitFrame.add(clientNameField);
        
        //Label for CardId
        cardIdLabel = new JLabel("Card Id");
        cardIdLabel.setBounds(399, 124, 54, 22);
        cardIdLabel.setFont(detailFont);
        cardIdLabel.setForeground(black);
        debitFrame.add(cardIdLabel);
        
        //asterix for card Id Label
        asterixCardIdLabel = new JLabel("*");
        asterixCardIdLabel.setBounds(453, 124, 9, 22);
        asterixCardIdLabel.setForeground(red);
        asterixCardIdLabel.setFont(asterixFont);
        debitFrame.add(asterixCardIdLabel);
        
        //Text Field for card Id Label
        cardIdField = new JTextField();
        cardIdField.setBounds(399, 152, 182, 32);
        //cardIdField.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        debitFrame.add(cardIdField);
        
        
        //Label for Issuer Bank
        issuerBankLabel = new JLabel("Issuer Bank");
        issuerBankLabel.setBounds(119, 200, 89, 22);
        issuerBankLabel.setFont(detailFont);
        issuerBankLabel.setForeground(black);
        debitFrame.add(issuerBankLabel);
        
        //asterix for Issuer Bank
        asterixIssuerBankLabel = new JLabel("*");
        asterixIssuerBankLabel.setBounds(208, 199, 12, 22);
        asterixIssuerBankLabel.setForeground(red);
        asterixIssuerBankLabel.setFont(asterixFont);
        debitFrame.add(asterixIssuerBankLabel);
        
        //Text Field for Issuer Bank
        issuerBankField = new JTextField();
        issuerBankField.setBounds(119, 227, 182, 32);
        debitFrame.add(issuerBankField);
        
        //Label for Bank Account
        bankAccountLabel = new JLabel("BankAccount");
        bankAccountLabel.setBounds(399, 199, 100, 22);
        bankAccountLabel.setFont(detailFont);
        bankAccountLabel.setForeground(black);
        debitFrame.add(bankAccountLabel);
        
        //asterix for Bank Account
        asterixBankAccountLabel = new JLabel("*");
        asterixBankAccountLabel.setBounds(501, 199, 9, 22);
        asterixBankAccountLabel.setForeground(red);
        asterixBankAccountLabel.setFont(asterixFont);
        debitFrame.add(asterixBankAccountLabel);
        
        //Text Field for Bank Account
        bankAccountField = new JTextField();
        bankAccountField.setBounds(399, 226, 182, 32);
        debitFrame.add(bankAccountField);
        
        //Label for Balance Amount
        balanceAmountLabel = new JLabel("Balance Amount");
        balanceAmountLabel.setBounds(119, 275, 122, 22);
        balanceAmountLabel.setFont(detailFont);
        balanceAmountLabel.setForeground(black);
        debitFrame.add(balanceAmountLabel);
        
        //asterix for Balance Amount
        asterixBalanceLabel = new JLabel("*");
        asterixBalanceLabel.setBounds(242, 275,12, 22);
        asterixBalanceLabel.setForeground(red);
        asterixBalanceLabel.setFont(asterixFont);
        debitFrame.add(asterixBalanceLabel);
        
        //Text Field for Balance Amount
        balanceAmountField = new JTextField();
        balanceAmountField.setBounds(119, 302, 182, 32);
        debitFrame.add(balanceAmountField);
        
        //Label for Pin Number
        pinNumberLabel = new JLabel("Pin Number");
        pinNumberLabel.setBounds(399, 274, 86, 22);
        pinNumberLabel.setFont(detailFont);
        pinNumberLabel.setForeground(black);
        debitFrame.add(pinNumberLabel);
        
        //asterix for Pin Number
        asterixPinNumberLabel = new JLabel("*");
        asterixPinNumberLabel.setBounds(487, 275, 8, 22);
        asterixPinNumberLabel.setForeground(red);
        asterixPinNumberLabel.setFont(asterixFont);
        debitFrame.add(asterixPinNumberLabel);
        
        //Text Field for Pin Number
        pinNumberField = new JTextField();
        pinNumberField.setBounds(399, 302, 182, 32);
        debitFrame.add(pinNumberField);
        
        //Add Debit Card Button
        addDebitButton = new JButton("Add Debit Card");
        addDebitButton.setBounds(456, 357, 125, 35);
        addDebitButton.setBackground(red);
        addDebitButton.setBorder(BorderFactory.createLineBorder(red));
        addDebitButton.setFocusPainted(false);
        addDebitButton.setForeground(white);
        debitFrame.add(addDebitButton);
        
        //make withdraw Money Label
        withdrawMoneyLabel = new JLabel("Withdraw Money:");
        withdrawMoneyLabel.setBounds(119, 416, 115, 20);
        withdrawMoneyLabel.setFont(myFont);
        withdrawMoneyLabel.setForeground(black);
        debitFrame.add(withdrawMoneyLabel);
        
        //make second cardId Label
        cardIdLabel2 = new JLabel("Card Id");
        cardIdLabel2.setBounds(119, 449, 54, 22);
        cardIdLabel2.setFont(detailFont);
        cardIdLabel2.setForeground(black);
        debitFrame.add(cardIdLabel2);
        
        // make second asterix for secon card Id
        asterixCardIdLabel2 = new JLabel("*");
        asterixCardIdLabel2.setBounds(175, 449, 9, 22);
        asterixCardIdLabel2.setForeground(red);
        asterixCardIdLabel2.setFont(asterixFont);
        debitFrame.add(asterixCardIdLabel2);
        
        //make second Text Field for second Card Id
        cardIdField2 = new JTextField();
        cardIdField2.setBounds(119, 476, 182, 32);
        debitFrame.add(cardIdField2);
        
        //make withdrawal Amount Label
        withdrawalAmountLabel = new JLabel("Withdrawal Amount");
        withdrawalAmountLabel.setBounds(399, 449, 143, 22);
        withdrawalAmountLabel.setFont(detailFont);
        withdrawalAmountLabel.setForeground(black);
        debitFrame.add(withdrawalAmountLabel);
        
        // make asterix for withdrawal Amount
        asterixWithdrawalAmountLabel = new JLabel("*");
        asterixWithdrawalAmountLabel.setBounds(545, 449, 9, 22);
        asterixWithdrawalAmountLabel.setForeground(red);
        asterixWithdrawalAmountLabel.setFont(asterixFont);
        debitFrame.add(asterixWithdrawalAmountLabel);
        
        //make text field for withdrawal Amount
        withdrawalAmountField = new JTextField();
        withdrawalAmountField.setBounds(399, 476, 182, 32);
        debitFrame.add(withdrawalAmountField);
        
        //make withdrawal Date Label
        withdrawalDateLabel = new JLabel("Withdrawal Date");
        withdrawalDateLabel.setBounds(119, 527, 120, 22);
        withdrawalDateLabel.setFont(detailFont);
        withdrawalDateLabel.setForeground(black);
        debitFrame.add(withdrawalDateLabel);
        
        // make asterix for withdrawal Date
        asterixWithdrawalDateLabel = new JLabel("*");
        asterixWithdrawalDateLabel.setBounds(239, 527, 9, 22);
        asterixWithdrawalDateLabel.setForeground(red);
        asterixWithdrawalDateLabel.setFont(asterixFont);
        debitFrame.add(asterixWithdrawalDateLabel);
        
        //make day loop
        Integer[] day = new Integer[31];
        for(int i=0; i<31; i++){
            day[i] = i+1;
        }
        
        //make combo Box for withdrawal Date
        dayComboBox = new JComboBox(day);
        dayComboBox.setBounds(119, 556, 63, 30);
        dayComboBox.setBackground(white);
        debitFrame.add(dayComboBox);
        
        //make month loop
        String[] month = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "July",
            "Aug", "Step", "Oct", "Nov", "Dec"};
        monthComboBox = new JComboBox(month);
        monthComboBox.setBounds(191, 556, 83, 30);
        monthComboBox.setBackground(white);
        debitFrame.add(monthComboBox);
        
        //make year loop
        //ask report check
        int currentYear = 2023;
        Integer[] year = new Integer[100];
        for(int j=0; j<100; j++)
        {
            year[j]=currentYear;
            currentYear--;
        }
        
        yearComboBox = new JComboBox(year);
        yearComboBox.setBounds(283, 556, 83, 30);
        yearComboBox.setBackground(white);
        debitFrame.add(yearComboBox);
        
        //Label for second Pin Number
        pinNumberLabel2 = new JLabel("Pin Number");
        pinNumberLabel2.setBounds(399, 527, 86, 22);
        pinNumberLabel2.setFont(detailFont);
        pinNumberLabel2.setForeground(black);
        debitFrame.add(pinNumberLabel2);
        
        //asterix for second Pin Number
        asterixPinNumberLabel2 = new JLabel("*");
        asterixPinNumberLabel2.setBounds(488, 528, 8, 22);
        asterixPinNumberLabel2.setForeground(red);
        asterixPinNumberLabel2.setFont(asterixFont);
        debitFrame.add(asterixPinNumberLabel2);
        
        //Text Field for second Pin Number
        pinNumberField2 = new JTextField();
        pinNumberField2.setBounds(399, 554, 182, 32);
        debitFrame.add(pinNumberField2);
        
        //Add withdrawal Button
        withdrawalButton = new JButton("Withdrawal");
        withdrawalButton.setBounds(456, 610, 125, 35);
        withdrawalButton.setBackground(red);
        withdrawalButton.setBorder(BorderFactory.createLineBorder(red));
        withdrawalButton.setFocusPainted(false);
        withdrawalButton.setForeground(white);
        debitFrame.add(withdrawalButton);
        
        //make display button   
        displayButton = new JButton("Display");
        displayButton.setBounds(404, 675, 80, 30);
        displayButton.setBackground(red);
        displayButton.setBorder(BorderFactory.createLineBorder(red));
        displayButton.setFocusPainted(false);
        displayButton.setForeground(white);
        debitFrame.add(displayButton);
        
        // make clear Button
        clearButton = new JButton("Clear");
        clearButton.setBounds(501, 675, 80, 30);
        clearButton.setBackground(red);
        clearButton.setBorder(BorderFactory.createLineBorder(red));
        clearButton.setFocusPainted(false);
        clearButton.setForeground(white);
        debitFrame.add(clearButton);
        
        //make Back Button
        backButton = new JButton("Back");
        backButton.setBounds(100, 700, 71, 30);
        backButton.setBackground(red);
        backButton.setBorder(BorderFactory.createLineBorder(red));
        backButton.setFocusPainted(false);
        backButton.setForeground(white);
        debitFrame.add(backButton);
        
        //make footer nic asia
        logoLabel2 = new JLabel("NIC ASIA");
        logoLabel2.setBounds(90, 20, 72, 22);
        logoLabel2.setFont(logoFont);
        logoLabel2.setForeground(white);
        debitFooterPanel.add(logoLabel2);
        
        //add action listener to the button
        backButton.addActionListener(this);
        addDebitButton.addActionListener(this);
        withdrawalButton.addActionListener(this);
        displayButton.addActionListener(this);
        clearButton.addActionListener(this);
        
        debitFrame.setSize(700, 850);
        debitFrame.getContentPane().setBackground(Color.WHITE);
        debitFrame.setResizable(false);
        debitFrame.setLayout(null);
        debitFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        debitFrame.setVisible(true);
        
    }
    
    public void creditCardInterface(){
        //make Frame for Debit Card
        creditFrame = new JFrame("Credit Card");
        
        //Font
        detailFont = new Font("Helvetica", Font.BOLD, 15);
        asterixFont = new Font("Helvetica", Font.BOLD, 16);
        
        //header navigation panel
        creditHeaderPanel = new JPanel();
        creditHeaderPanel.setLayout(null);
        creditHeaderPanel.setBounds(0, 0, 700, 63);
        creditHeaderPanel.setBackground(red);
        creditFrame.add(creditHeaderPanel);
        
        //bottom navigation panel
        creditFooterPanel = new JPanel();
        creditFooterPanel.setLayout(null);
        creditFooterPanel.setBounds(0, 755, 700, 63);
        creditFooterPanel.setBackground(red);
        creditFrame.add(creditFooterPanel);
        
        //header text nic asia
        nicAsiaLabel3 = new JLabel("NIC ASIA");
        nicAsiaLabel3.setFont(logoFont);
        nicAsiaLabel3.setForeground(white);
        nicAsiaLabel3.setBounds(94, 20, 71, 22);
        creditHeaderPanel.add(nicAsiaLabel3);
        
        //header Contact text
        contactLabel3 = new JLabel("Contact");
        contactLabel3.setBounds(392, 21, 50, 20);
        contactLabel3.setFont(myFont);
        contactLabel3.setForeground(white);
        creditHeaderPanel.add(contactLabel3);
        
        //header Atm Text
        atmLabel3 = new JLabel("Atm");
        atmLabel3.setBounds(480, 21, 25, 20);
        atmLabel3.setForeground(white);
        atmLabel3.setFont(myFont);
        creditHeaderPanel.add(atmLabel3);
        
        //header Branch Text
        branchLabel3 = new JLabel("Branch");
        branchLabel3.setBounds(543, 21, 46, 20);
        branchLabel3.setFont(myFont);
        branchLabel3.setForeground(white);
        creditHeaderPanel.add(branchLabel3);
        
        //details of Debit Card Text
        fillDetailsLabel2 = new JLabel("Fill out your Credit Card Details");
        fillDetailsLabel2.setBounds(119, 95, 200, 20);
        fillDetailsLabel2.setForeground(black);
        fillDetailsLabel2.setFont(myFont);
        creditFrame.add(fillDetailsLabel2);
        
        // Second Client Name Text
        clientNameLabel2 = new JLabel("Client Name");
        clientNameLabel2.setBounds(119, 123, 91, 22);
        clientNameLabel2.setFont(detailFont);
        clientNameLabel2.setForeground(black);
        creditFrame.add(clientNameLabel2);
        
        //asterix for second clientNameText
        asterixClientLabel2 = new JLabel("*");
        asterixClientLabel2.setBounds(208, 124, 14, 22);
        asterixClientLabel2.setForeground(red);
        asterixClientLabel2.setFont(asterixFont);
        creditFrame.add(asterixClientLabel2);
        
        //Text Field for second ClientName Text
        clientNameField2 = new JTextField();
        clientNameField2.setBounds(119, 152, 182, 32);
        creditFrame.add(clientNameField2);
        
        //Label for third CardId
        cardIdLabel3 = new JLabel("Card Id");
        cardIdLabel3.setBounds(399, 124, 54, 22);
        cardIdLabel3.setFont(detailFont);
        cardIdLabel3.setForeground(black);
        creditFrame.add(cardIdLabel3);
        
        //asterix for third card Id Label
        asterixCardIdLabel3 = new JLabel("*");
        asterixCardIdLabel3.setBounds(453, 124, 9, 22);
        asterixCardIdLabel3.setForeground(red);
        asterixCardIdLabel3.setFont(asterixFont);
        creditFrame.add(asterixCardIdLabel3);
        
        //Text Field for third card Id Label
        cardIdField3 = new JTextField();
        cardIdField3.setBounds(400, 152, 182, 32);
        creditFrame.add(cardIdField3);
        
        
        //Label for  second Issuer Bank
        issuerBankLabel2 = new JLabel("Issuer Bank");
        issuerBankLabel2.setBounds(119, 200, 89, 22);
        issuerBankLabel2.setFont(detailFont);
        issuerBankLabel2.setForeground(black);
        creditFrame.add(issuerBankLabel2);
        
        //asterix for second Issuer Bank
        asterixIssuerBankLabel2 = new JLabel("*");
        asterixIssuerBankLabel2.setBounds(208, 199, 12, 22);
        asterixIssuerBankLabel2.setForeground(red);
        asterixIssuerBankLabel2.setFont(asterixFont);
        creditFrame.add(asterixIssuerBankLabel2);
        
        //Text Field for second Issuer Bank
        issuerBankField2 = new JTextField();
        issuerBankField2.setBounds(119, 227, 182, 32);
        creditFrame.add(issuerBankField2);
        
        //Label for second Bank Account
        bankAccountLabel2 = new JLabel("BankAccount");
        bankAccountLabel2.setBounds(399, 199, 100, 22);
        bankAccountLabel2.setFont(detailFont);
        bankAccountLabel2.setForeground(black);
        creditFrame.add(bankAccountLabel2);
        
        //asterix for second Bank Account
        asterixBankAccountLabel2 = new JLabel("*");
        asterixBankAccountLabel2.setBounds(501, 199, 9, 22);
        asterixBankAccountLabel2.setForeground(red);
        asterixBankAccountLabel2.setFont(asterixFont);
        creditFrame.add(asterixBankAccountLabel2);
        
        //Text Field for second Bank Account
        bankAccountField2 = new JTextField();
        bankAccountField2.setBounds(399, 226, 182, 32);
        creditFrame.add(bankAccountField2);
        
        //Label for second Balance Amount
        balanceAmountLabel2 = new JLabel("Balance Amount");
        balanceAmountLabel2.setBounds(119, 275, 122, 22);
        balanceAmountLabel2.setFont(detailFont);
        balanceAmountLabel2.setForeground(black);
        creditFrame.add(balanceAmountLabel2);
        
        //asterix for second Balance Amount
        asterixBalanceLabel2 = new JLabel("*");
        asterixBalanceLabel2.setBounds(242, 275,12, 22);
        asterixBalanceLabel2.setForeground(red);
        asterixBalanceLabel2.setFont(asterixFont);
        creditFrame.add(asterixBalanceLabel2);
        
        //Text Field for second Balance Amount
        balanceAmountField2 = new JTextField();
        balanceAmountField2.setBounds(119, 302, 182, 32);
        creditFrame.add(balanceAmountField2);
        
        //make withdrawal Date Label
        expirationDateLabel = new JLabel("Expiration Date");
        expirationDateLabel.setBounds(400, 267, 114, 22);
        expirationDateLabel.setFont(detailFont);
        expirationDateLabel.setForeground(black);
        creditFrame.add(expirationDateLabel);
        
        // make asterix for withdrawal Date
        asterixExpirationDateLabel = new JLabel("*");
        asterixExpirationDateLabel.setBounds(516, 268, 8, 22);
        asterixExpirationDateLabel.setForeground(red);
        asterixExpirationDateLabel.setFont(asterixFont);
        creditFrame.add(asterixExpirationDateLabel);
        
        //make day loop
        Integer[] day = new Integer[31];
        for(int i=0; i<31; i++){
            day[i] = i+1;
        }
        
        //make combo Box for withdrawal Date
        dayComboBox2 = new JComboBox(day);
        dayComboBox2.setBounds(400, 295, 63, 28);
        dayComboBox2.setBackground(white);
        creditFrame.add(dayComboBox2);
        
        //make month loop
        String[] month = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "July",
            "Aug", "Step", "Oct", "Nov", "Dec"};
        monthComboBox2 = new JComboBox(month);
        monthComboBox2.setBounds(472, 295, 83, 28);
        monthComboBox2.setBackground(white);
        creditFrame.add(monthComboBox2);
        
        //make year loop
        int currentYear = 2023;
        Integer[] year = new Integer[100];
        for(int j=0; j<100; j++)
        {
            year[j]=currentYear;
            currentYear++;
        }
        
        yearComboBox2 = new JComboBox(year);
        yearComboBox2.setBounds(564, 294, 74, 28);
        yearComboBox2.setBackground(white);
        creditFrame.add(yearComboBox2);
        
        // make CVC Number Label
        cvcNumberLabel = new JLabel("CVC Number");
        cvcNumberLabel.setBounds(120, 344, 98, 22);
        cvcNumberLabel.setFont(detailFont);
        cvcNumberLabel.setForeground(black);
        creditFrame.add(cvcNumberLabel);
        
        //asterix for CVC Number
        asterixCVCLabel = new JLabel("*");
        asterixCVCLabel.setBounds(216, 343, 12, 22);
        asterixCVCLabel.setForeground(red);
        asterixCVCLabel.setFont(asterixFont);
        creditFrame.add(asterixCVCLabel);
        
        //Text Field for CVC Number
        cvcNumberField = new JTextField();
        cvcNumberField.setBounds(120, 371, 182, 32);
        creditFrame.add(cvcNumberField);
        
        // make Interest Rate Label
        interestRateLabel = new JLabel("Interest Rate");
        interestRateLabel.setBounds(400, 344, 98, 22);
        interestRateLabel.setFont(detailFont);
        interestRateLabel.setForeground(black);
        creditFrame.add(interestRateLabel);
        
        //asterix for Interest Rate
        asterixInterestLabel = new JLabel("*");
        asterixInterestLabel.setBounds(493, 343, 12, 22);
        asterixInterestLabel.setForeground(red);
        asterixInterestLabel.setFont(asterixFont);
        creditFrame.add(asterixInterestLabel);
        
        //Text Field for Interest Rate
        interestRateField = new JTextField();
        interestRateField.setBounds(400, 371, 182, 32);
        creditFrame.add(interestRateField);
        
        //Add Credit Card Button
        addCreditButton = new JButton("Add Credit Card");
        addCreditButton.setBounds(457, 423, 125, 35);
        addCreditButton.setBackground(red);
        addCreditButton.setBorder(BorderFactory.createLineBorder(red));
        addCreditButton.setFocusPainted(false);
        addCreditButton.setForeground(white);
        creditFrame.add(addCreditButton);
        
        //make set Credit Limit Label
        setCreditLimitLabel = new JLabel("Set Credit Limit:");
        setCreditLimitLabel.setBounds(120, 479, 105, 20);
        setCreditLimitLabel.setFont(myFont);
        setCreditLimitLabel.setForeground(black);
        creditFrame.add(setCreditLimitLabel);
        
        //make third cardId Label
        cardIdLabel4 = new JLabel("Card Id");
        cardIdLabel4.setBounds(120, 505, 54, 22);
        cardIdLabel4.setFont(detailFont);
        cardIdLabel4.setForeground(black);
        creditFrame.add(cardIdLabel4);
        
        // make third asterix for secon card Id
        asterixCardIdLabel4 = new JLabel("*");
        asterixCardIdLabel4.setBounds(175, 505, 6, 22);
        asterixCardIdLabel4.setForeground(red);
        asterixCardIdLabel4.setFont(asterixFont);
        creditFrame.add(asterixCardIdLabel4);
        
        //make third Text Field for second Card Id
        cardIdField4 = new JTextField();
        cardIdField4.setBounds(120, 532, 182, 32);
        creditFrame.add(cardIdField4);
        
        //make Credit Limit Label
        creditLimitLabel = new JLabel("Credit Limit");
        creditLimitLabel.setBounds(398, 505, 90, 22);
        creditLimitLabel.setFont(detailFont);
        creditLimitLabel.setForeground(black);
        creditFrame.add(creditLimitLabel);
        
        // make asterix for Credit Limit
        asterixCreditLimitLabel= new JLabel("*");
        asterixCreditLimitLabel.setBounds(485, 505, 6, 22);
        asterixCreditLimitLabel.setForeground(red);
        asterixCreditLimitLabel.setFont(asterixFont);
        creditFrame.add(asterixCreditLimitLabel);
        
        //make Text Field for Credit Limit
        creditLimitField = new JTextField();
        creditLimitField.setBounds(398, 532, 182, 32);
        creditFrame.add(creditLimitField);
        
        //make Grace Period Label
        gracePeriodLabel = new JLabel("Grace Period");
        gracePeriodLabel.setBounds(120, 579, 98, 22);
        gracePeriodLabel.setFont(detailFont);
        gracePeriodLabel.setForeground(black);
        creditFrame.add(gracePeriodLabel);
        
        // make asterix for Grace Period
        asterixGracePeriodLabel= new JLabel("*");
        asterixGracePeriodLabel.setBounds(218, 579, 6, 22);
        asterixGracePeriodLabel.setForeground(red);
        asterixGracePeriodLabel.setFont(asterixFont);
        creditFrame.add(asterixGracePeriodLabel);
        
        //make Text Field for Grace Period
        gracePeriodField = new JTextField();
        gracePeriodField.setBounds(120, 606, 182, 32);
        creditFrame.add(gracePeriodField);
        
        //add cancel credit Card
        cancelCreditButton = new JButton("Cancel Credit Card");
        cancelCreditButton.setBounds(340, 604, 132, 35);
        cancelCreditButton.setBackground(red);
        cancelCreditButton.setBorder(BorderFactory.createLineBorder(red));
        cancelCreditButton.setFocusPainted(false);
        cancelCreditButton.setForeground(white);
        creditFrame.add(cancelCreditButton);
        
        //Add set Button
        setButton = new JButton("Set Credit Limit");
        setButton.setBounds(490, 604, 108, 35);
        setButton.setBackground(red);
        setButton.setBorder(BorderFactory.createLineBorder(red));
        setButton.setFocusPainted(false);
        setButton.setForeground(white);
        creditFrame.add(setButton);
        
        //
        //make second display button   
        displayButtonTwo = new JButton("Display");
        displayButtonTwo.setBounds(391, 667, 80, 30);
        displayButtonTwo.setBackground(red);
        displayButtonTwo.setBorder(BorderFactory.createLineBorder(red));
        displayButtonTwo.setFocusPainted(false);
        displayButtonTwo.setForeground(white);
        creditFrame.add(displayButtonTwo);
        
        // make second clear Button
        clearButton2 = new JButton("Clear");
        clearButton2.setBounds(498, 667, 80, 30);
        clearButton2.setBackground(red);
        clearButton2.setBorder(BorderFactory.createLineBorder(red));
        clearButton2.setFocusPainted(false);
        clearButton2.setForeground(white);
        creditFrame.add(clearButton2);
        
        //make Back Button
        backButton2 = new JButton("Back");
        backButton2.setBounds(97, 700, 75, 31);
        backButton2.setBackground(red);
        backButton2.setBorder(BorderFactory.createLineBorder(red));
        backButton2.setFocusPainted(false);
        backButton2.setForeground(white);
        creditFrame.add(backButton2);
        
        //make footer nic asia
        logoLabel3 = new JLabel("NIC ASIA");
        logoLabel3.setBounds(90, 19, 72, 22);
        logoLabel3.setFont(logoFont);
        logoLabel3.setForeground(white);
        creditFooterPanel.add(logoLabel3);
        
        addCreditButton.addActionListener(this);
        cancelCreditButton.addActionListener(this);
        setButton.addActionListener(this);
        displayButtonTwo.addActionListener(this);
        clearButton2.addActionListener(this);
        backButton2.addActionListener(this);
        
        creditFrame.setSize(700, 850);
        creditFrame.getContentPane().setBackground(Color.WHITE);
        creditFrame.setResizable(false);
        creditFrame.setLayout(null);
        creditFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        creditFrame.setVisible(true);
    }
    //implements the method of the 
    // ActionListener
    public void actionPerformed(ActionEvent e){
                    
        if(e.getSource()==debitButton)
        {
            debitCardInterface();
            frame.dispose();
        }
        
        if(e.getSource()==backButton)
        {
            mainInterface();
            debitFrame.dispose();
        }
        
        if(e.getSource()==creditButton){
            creditCardInterface();
            frame.dispose();
        }
        
        if (e.getSource()==backButton2){
            mainInterface();
            creditFrame.dispose();
        }
        
        if(e.getSource() == addDebitButton){
            //get all the value from the of UI
            String issuerBank = issuerBankField.getText();
            String clientName = clientNameField.getText();
            String bankAccount = bankAccountField.getText();
            
            // check if the parameters are empty or not
            if(pinNumberField.getText().isEmpty() || balanceAmountField.getText().isEmpty() || cardIdField.getText().isEmpty() || 
            clientName.isEmpty() || issuerBank.isEmpty() || bankAccount.isEmpty())
            {
               JOptionPane.showMessageDialog(debitFrame, "Please fill all required fields.", "Error", JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                try
                {
                    //try catch for cardId, pinNumber, balanceAmount
                    int cardId = Integer.parseInt(cardIdField.getText());
                    int pinNumber = Integer.parseInt(pinNumberField.getText());
                    double balanceAmount = Double.parseDouble(balanceAmountField.getText());
                    boolean isAdded = false;
                     //check if ArrayList is Empty
                    if(bankCards.size() == 0)
                    {
                        //create object of DebitCard Using Constructor
                        DebitCard debitCard = new DebitCard(balanceAmount, cardId, bankAccount, 
                        issuerBank, clientName, pinNumber);
                        //add to the arrayList
                        bankCards.add(debitCard);
                        //show message
                        JOptionPane.showMessageDialog(debitFrame, "Debit Card added successfully!", "success", 
                        JOptionPane.INFORMATION_MESSAGE);
                    }
                    else
                    {
                        //check if card is already present
                        //loop through array list and check Card Id
                        for(BankCard card : bankCards)
                        {
                            if(card instanceof DebitCard)
                            {
                                //perform downcasting
                                DebitCard debitObj = (DebitCard) card;
                                //if card Id match dont add Debit Button
                                if(debitObj.getCardId()==cardId)
                                {
                                    isAdded = true;
                                }
                            }
                        }
                        
                        if(isAdded == false)
                        {
                            //create object of DebitCard Using Constructor
                            DebitCard debitCard = new DebitCard(balanceAmount, cardId, bankAccount,
                            issuerBank, clientName, pinNumber);
                            //add to the arrayList
                            bankCards.add(debitCard);
                            //show Message
                            JOptionPane.showMessageDialog(debitFrame, "Debit Card added successfully!", "success",
                            JOptionPane.INFORMATION_MESSAGE);
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(debitFrame, "Card with same ID already exist.", "Error", 
                            JOptionPane.ERROR_MESSAGE);
                        }
                    }
                }catch(NumberFormatException ex){
                    //show error message if it catch number format exception
                    JOptionPane.showMessageDialog(debitFrame, "Invalid input. Pleasse enter valid value.", "Error",
                    JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        
        if(e.getSource()==withdrawalButton)
        {
            //get the value of combo box from the user thourgh UI
            String withdrawalDate = dayComboBox.getSelectedItem()+"/"+monthComboBox.getSelectedItem()+"/" +yearComboBox.getSelectedItem();
            //check if the text field is empty or not
            if(cardIdField2.getText().isEmpty()|| pinNumberField2.getText().isEmpty()|| withdrawalAmountField.getText().isEmpty())
            {
                //show erorr message
                JOptionPane.showMessageDialog(debitFrame, "Please fill all required fields.", "Error", 
                JOptionPane.ERROR_MESSAGE);
            }
            else{
                try{
                    //try catch for cardId, pinNumber, withdrawalAmount
                    int cardId = Integer.parseInt(cardIdField2.getText());
                    int pinNumber = Integer.parseInt(pinNumberField2.getText());
                    int withdrawalAmount = Integer.parseInt(withdrawalAmountField.getText());
                    
                    boolean isCardId = false;
                    
                    //DebitCard debitObj = null;
                    //check if the Array list is emtpy or not
                    if(bankCards.size() == 0)
                    {
                        //show message
                        JOptionPane.showMessageDialog(debitFrame, "Please add Debit Card First", "ERROR", 
                        JOptionPane.ERROR_MESSAGE);
                    }
                    else
                    {
                        //loop through Array List
                        for(BankCard card : bankCards)
                        {
                            if(card instanceof DebitCard)
                            {
                                //perform downcasting
                                DebitCard debitObj = (DebitCard) card;
                                //check if the card id match or not
                                if(debitObj.getCardId()==cardId)
                                {
                                    isCardId = true;
                                    if(debitObj.getPinNumber() == pinNumber)
                                    {
                                        if(debitObj.getBalanceAmount() >= withdrawalAmount)
                                        {
                                            //call the withdraw method of DebitCard
                                            debitObj.withdraw(withdrawalAmount, withdrawalDate, pinNumber);
                                            //store the value of balance amount by calling getter method of balance amount
                                            String newBalance = String.valueOf(debitObj.getBalanceAmount());
                                            String values ="Card Id: " + cardId + "\nNew Balance: "+ newBalance + "\nWithdrawal Amount: "
                                            + withdrawalAmount + "\nWithdrawal Date: " + withdrawalDate + "\nPin Number: "+ pinNumber;
                                            JOptionPane.showMessageDialog(debitFrame, "Withdrawal Successful!\n" + values, "Success",
                                            JOptionPane.INFORMATION_MESSAGE);
                                        }
                                        else
                                        {
                                            //store the value of balance amoiunt by calling getter method of balance amount
                                            String newBalance = String.valueOf(debitObj.getBalanceAmount());
                                            String values = "Your Balance: "+ newBalance + "\nWithdrawal Amount: "
                                            + withdrawalAmount;
                                            JOptionPane.showMessageDialog(debitFrame, "InSufficient Balance!\n"+ values , "Error",
                                            JOptionPane.ERROR_MESSAGE);
                                        }
                                    }
                                    else
                                    {
                                        JOptionPane.showMessageDialog(debitFrame, "Invalid Pin Number!", "Error", JOptionPane.ERROR_MESSAGE);
                                    }
                                }
                            }
                        }
                        
                        if(isCardId == false)
                        {
                                JOptionPane.showMessageDialog(debitFrame, "Invalid Card Id!", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                }catch(NumberFormatException ex){
                    //show error message if number format exception occur
                    JOptionPane.showMessageDialog(debitFrame, "Invalid input. Pleasse enter valid value.", "Error",
                    JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        
        if(e.getSource()==displayButton)
        {  
            //check if the Array List is empty or not
            if(bankCards.size() == 0)
            {
                //show error message if array list empty
                JOptionPane.showMessageDialog(debitFrame, "Please Add Debit Card First", "ERROR", 
                JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                //loop through Araya list
                for(BankCard card : bankCards)
                {
                    if(card instanceof DebitCard)
                    {
                        //perform downcasting
                        DebitCard debitObj = (DebitCard) card;
                        //call the display method of DebitCard class
                        debitObj.display();
                                
                        String clientName = debitObj.getClientName();
                        String issuerBank = debitObj.getIssuerBank();
                        String bankAccount = debitObj.getBankAccount();
                        String withdrawalDate = debitObj.getDateOfWithdrawal();
                        
                        int cardId = debitObj.getCardId();
                        int pinNumber = debitObj.getPinNumber();
                        double balanceAmount = debitObj.getBalanceAmount();
                        
                        String allValues = "Card Id: " + cardId + "\nClient Name: " + clientName + "\nIssuer Bank: " + issuerBank + 
                        "\nBank Account: " + bankAccount + "\nBalance Amount: " + balanceAmount + "\nPin Number: " + pinNumber +
                        "\nWithdrawal Date: " + withdrawalDate + "\nWithdrawal Amount: " + debitObj.getWithdrawalAmount() + "\n";
                        
                        String specificValues = "Card Id: " + cardId + "\nClient Name: " + clientName + "\nIssuer Bank: " + issuerBank + 
                        "\nBank Account: " + bankAccount + "\nBalance Amount: " + balanceAmount + "\nPin Number: " + pinNumber + "\n";
                        
                        if(debitObj.getHasWithdrawn() == true)
                        {
                            JOptionPane.showMessageDialog(debitFrame, allValues, "Details of Debit Card",
                            JOptionPane.INFORMATION_MESSAGE);
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(debitFrame, specificValues, "Details of Debit Card",
                            JOptionPane.INFORMATION_MESSAGE);
                        }
                    }
                }
            }
        }
        
        if(e.getSource() == clearButton)
        {
            //clear all the value above add debitCard button
            cardIdField.setText("");
            clientNameField.setText("");
            issuerBankField.setText("");
            bankAccountField.setText("");
            balanceAmountField.setText("");
            pinNumberField.setText("");
            
            //clear all the value below the debitCard Button
            cardIdField2.setText("");
            withdrawalAmountField.setText("");
            dayComboBox.setSelectedIndex(0);
            monthComboBox.setSelectedIndex(0);
            yearComboBox.setSelectedIndex(0);
            pinNumberField2.setText("");
        }
    
        if(e.getSource() == addCreditButton){
            //get the value of text field from user through UI
            String creditIssuerBank = issuerBankField2.getText();
            String creditClientName = clientNameField2.getText();
            String creditBankAccount = bankAccountField2.getText();
            String expirationDate = dayComboBox2.getSelectedItem()+ "/"+monthComboBox2.getSelectedItem() +"/"+yearComboBox2.getSelectedItem();
            
            // check if the value of text field are empty or not
            if(balanceAmountField2.getText().isEmpty() || cardIdField3.getText().isEmpty() || creditClientName.isEmpty() || 
            creditIssuerBank.isEmpty() || creditBankAccount.isEmpty() || cvcNumberField.getText().isEmpty() || 
            interestRateField.getText().isEmpty())
            {
               JOptionPane.showMessageDialog(creditFrame, "Please fill all required fields.", "Error", JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                try
                {
                    //try catch for cardId, pinNumber, balanceAmount, cvcNumber, interestRate
                    int creditCardId = Integer.parseInt(cardIdField3.getText());
                    double creditBalanceAmount = Double.parseDouble(balanceAmountField2.getText());
                    int cvcNumber = Integer.parseInt(cvcNumberField.getText());
                    double interestRate = Double.parseDouble(interestRateField.getText());
                    
                    boolean isAdded = false;

                     //check if ArrayList is Empty
                    if(bankCards.size() == 0){
                        //create object of DebitCard Using Constructor
                        CreditCard creditCard = new CreditCard(creditCardId, creditClientName, creditIssuerBank, creditBankAccount,
                        creditBalanceAmount, cvcNumber, interestRate, expirationDate);
                        //add to the arrayList
                        bankCards.add(creditCard);
                        //show successful message
                        JOptionPane.showMessageDialog(creditFrame, "Credit Card added successfully!", "success", 
                        JOptionPane.INFORMATION_MESSAGE);
                    }
                    else
                    {
                        //loop through Array list
                        for(BankCard card : bankCards)
                        {   
                            if(card instanceof CreditCard)
                            {
                                //perform downcasting
                                CreditCard creditObj = (CreditCard) card;
                                //check the card ID is not matched to value of attribute 
                                if(creditObj.getCardId() == creditCardId)
                                {
                                    isAdded = true;
                                }
                            }
                        }
                        
                        if (isAdded == false)
                        {
                            //create object of CreditCard class Using Constructor
                            CreditCard creditCard = new CreditCard(creditCardId, creditClientName, creditIssuerBank,
                            creditBankAccount, creditBalanceAmount, cvcNumber, interestRate, expirationDate);
                            //add to the arrayList
                            bankCards.add(creditCard);
                            //show successful Message
                            JOptionPane.showMessageDialog(creditFrame, "Credit Card added successfully!", "success",
                            JOptionPane.INFORMATION_MESSAGE);
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(creditFrame, "Card with same Card Id already exist.", "Error", 
                            JOptionPane.ERROR_MESSAGE);
                        }
                    }
                }catch(NumberFormatException ex){
                    //show the error message if number format exception occur
                    JOptionPane.showMessageDialog(creditFrame, "Invalid input. Pleasse enter valid value.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        
        if(e.getSource()==setButton)
        {
            //check if the the text field is empty or not
            if(cardIdField4.getText().isEmpty()|| creditLimitField.getText().isEmpty() || 
            gracePeriodField.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(creditFrame, "Please fill all required fields.", "Error", 
                JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                try
                {
                    //try catch for cardId, credit limit, grace period
                    int cardId = Integer.parseInt(cardIdField4.getText());
                    double creditLimit = Double.parseDouble(creditLimitField.getText());
                    int gracePeriod = Integer.parseInt(gracePeriodField.getText());
                    
                    boolean isCardId = false;
                
                    //check if the Array list is empty or not
                    if(bankCards.size() == 0)
                    {
                        //show error message
                        JOptionPane.showMessageDialog(creditFrame, "Please Add Credit Card First", "ERROR", 
                        JOptionPane.ERROR_MESSAGE);
                    }
                    else
                    {
                        //loop through Array list
                        for(BankCard card : bankCards)
                        {
                            if(card instanceof CreditCard)
                            {
                                //performing downcasting
                                CreditCard creditObj = (CreditCard) card;
                                if(creditObj.getCardId()==cardId)
                                {
                                    isCardId = true;
                                    if(creditObj.getIsGranted() == false)
                                    {
                                        if(creditLimit <= (creditObj.getBalanceAmount() * 2.5))
                                        {
                                            //call the setCreditLimit method of Credit Card class
                                            creditObj.setCreditLimit(creditLimit, gracePeriod);
                                            String value = "Card Id: " + cardId + "\nCredit Limit: " + creditLimit + "\nGrace Period: " 
                                            + gracePeriod + "\n\n" + "";
                                            JOptionPane.showMessageDialog(creditFrame, "Credit limit granted!\n\n"+ value, "Success",
                                            JOptionPane.INFORMATION_MESSAGE);
                                        }
                                        else
                                        {
                                            String stringCreditLimit = String.valueOf(creditLimitField.getText());
                                            String stringBalanceAmount = String.valueOf(balanceAmountField2.getText());
                                            String newValue = "Your Credit Limit should be less or equal to Balance Amount\n" + 
                                            "Credit Limit: " + stringCreditLimit + "\n" + "Balance Amount: " + stringBalanceAmount;
                                            JOptionPane.showMessageDialog(creditFrame, "Credit limit not granted!\n" + newValue, "Error", 
                                            JOptionPane.ERROR_MESSAGE);
                                        }
                                    }
                                    else
                                    {
                                        JOptionPane.showMessageDialog(creditFrame, "Your Credit Limit already Granted", "Warrning", 
                                        JOptionPane.WARNING_MESSAGE);
                                    }
                                }
                            }
                        }
                        
                        if(isCardId = false)
                        {
                            JOptionPane.showMessageDialog(creditFrame, "Invalid Card Id!", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                }catch(NumberFormatException ex){
                    //try to catch number format exception
                    JOptionPane.showMessageDialog(creditFrame, "Invalid input. Pleasse enter valid value.", "Error",
                    JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        
        if(e.getSource()== displayButtonTwo)
        {
            //check if the array list is empty or not
            if(bankCards.size() == 0)
            {
                //show error message
                JOptionPane.showMessageDialog(creditFrame, "Please Add Credit Card First", "ERROR", 
                JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                //lopping thourgh arraylist
                for(BankCard card : bankCards)
                {
                    if(card instanceof CreditCard)
                    {
                        //performing downcasting
                        CreditCard creditObj = (CreditCard) card;
                        //call made to display method of Credit Card class
                        creditObj.display();
                                
                        String issuerBank = creditObj.getIssuerBank();
                        String clientName = creditObj.getClientName();
                        String bankAccount = creditObj.getBankAccount();
                        String expirationDate = creditObj.getExpirationDate();
                                
                        int cvcNumber = creditObj.getCvcNumber();
                        int cardId = creditObj.getCardId();
                        double interestRate = creditObj.getInterestRate();
                        double balanceAmount = creditObj.getBalanceAmount();
                        
                        String allValues = "Card Id: " + cardId + "\nClient Name: " + clientName + "\nIssuer Bank: " + issuerBank +
                        "\nBank Account: " + bankAccount + "\nBalance Amount: " + balanceAmount + "\nInterest Rate: " + interestRate
                        + "\nCVC Number: " + cvcNumber + "\nExpiration Date: " + expirationDate + "\nCredit Limit: " +
                        creditObj.getCreditLimit() + "\nGrace Period: " + creditObj.getGracePeriod() + "\nCredit Limit Granted!\n";
                        
                        String specificValues = "Card Id: " + cardId + "\nClient Name: " + clientName + "\nIssuer Bank: " + issuerBank +
                        "\nBank Account: " + bankAccount + "\nBalance Amount: " + balanceAmount + "\nInterest Rate: " + interestRate
                        + "\nCVC Number: " + cvcNumber + "\nExpiration Date: " + expirationDate + "\nCredit Limit not Granted yet!\n";
                                
                        if(creditObj.getIsGranted() == true)
                        {
                            JOptionPane.showMessageDialog(creditFrame, allValues, "Success",
                            JOptionPane.INFORMATION_MESSAGE);
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(creditFrame, specificValues, "Success",
                            JOptionPane.INFORMATION_MESSAGE);       
                        }
                    }
                }
            }
        }
    
        if (e.getSource() == cancelCreditButton)
        {
            if(cardIdField4.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(creditFrame, "Please fill CardId! to\nCancel Credit Card! ", "Error", 
                JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                try
                {
                    int cardId = Integer.parseInt(cardIdField4.getText());
                    
                    boolean isCardId = false;
                    
                    //check if the array list is empty or not
                    if(bankCards.size() == 0)
                    {
                        //show message
                        JOptionPane.showMessageDialog(creditFrame, "Please Add Credit Card First", "ERROR", 
                        JOptionPane.ERROR_MESSAGE);
                    }
                    else
                    {
                        //looping through Array list
                        for(BankCard card : bankCards)
                        {
                            if(card instanceof CreditCard)
                            {
                                //performing downcasting
                                CreditCard creditObj = (CreditCard) card;
                                if(creditObj.getCardId() == cardId)
                                {
                                    isCardId = true;
                                    if(creditObj.getIsGranted() == true)
                                    {
                                        creditObj.cancelCreditCard();
                                        JOptionPane.showMessageDialog(creditFrame, "Credit card cancelled!", "Success",
                                        JOptionPane.INFORMATION_MESSAGE);
                                    }
                                    else
                                    {
                                        JOptionPane.showMessageDialog(creditFrame, "You don't have Credit Limit to Cancel", "Warning",
                                        JOptionPane.WARNING_MESSAGE);
                                    }
                                }
                            }
                        }
                        
                        if (isCardId == false)
                        {
                            JOptionPane.showMessageDialog(creditFrame, "Card Id didnot Match!", "Error", 
                            JOptionPane.ERROR_MESSAGE);
                        }
                    }
                }catch(NumberFormatException ex){
                    //show the error message if number format exception occur
                    JOptionPane.showMessageDialog(creditFrame, "Invalid input. Pleasse enter valid value.", "Error",
                    JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        
        if(e.getSource() == clearButton2)
        {
            //clear all the value above add Credit Card button
            cardIdField3.setText("");
            clientNameField2.setText("");
            issuerBankField2.setText("");
            bankAccountField2.setText("");
            balanceAmountField2.setText("");
            cvcNumberField.setText("");
            interestRateField.setText("");
            dayComboBox2.setSelectedIndex(0);
            monthComboBox2.setSelectedIndex(0);
            yearComboBox2.setSelectedIndex(0);
            
            //clear all the value below the Credit Card Button
            cardIdField4.setText("");
            creditLimitField.setText("");
            gracePeriodField.setText("");
        }
    }
    
    public static void main(String[] args){
        //call made to object of BankGUI class i.e will call to constructor of BankGUI class
        new BankGUI();
    }
}