/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio15;

/**
 *
 * @author dani
 */
public class Loan implements LoanConstants{
    private String loanNum;
    private String customerName;
    public double amountLoan;
    public double interestRate;
    public int term;
    
    public Loan(String loanNum, String customerName, double amountLoan, int term){
        this.loanNum = loanNum;
        this.customerName = customerName;
        setLoan(amountLoan);
        setTerm(term);
    }
    
    public void setTerm(int term){
        if ((term!=SHORT_TERM)&&(term!=MEDIUM_TERM)&&(term!=LONG_TERM)) {
            System.out.println("Término incorrecto");
            term = SHORT_TERM;
        }else{
            this.term = term;
        }
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }   
    
    public String getLoanNum() {
        return loanNum;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getAmountLoan() {
        return amountLoan;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public int getTerm() {
        return term;
    }
    
    
    public void setLoan(double loan){
        if (loan > TOP_LOAN) {
            System.out.println("Monto de préstamo incorrecto");
        }else{
            this.amountLoan = loan;
        }
    }

    @Override
    public String toString() {
        return "Name: "+NAME+"Loan{" + "loanNum=" + loanNum + ", customerName=" + customerName + ", amountLoan=" + amountLoan + ", interestRate=" + interestRate + ", term=" + term + '}';
    }
    
    
    
    
}
