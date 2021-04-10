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
public class BussinessLoan extends Loan{
    
    public BussinessLoan(String loanNum, String customerName, double amountLoan, int term){
        super(loanNum, customerName, amountLoan, term);
        super.setInterestRate(1);
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
    
}
