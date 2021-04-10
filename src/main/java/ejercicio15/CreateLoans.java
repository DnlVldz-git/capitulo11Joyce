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
public class CreateLoans {
    
    public static void main(String[] args) {
        Loan[] loans = new Loan[5];
        
        loans[0] = new BussinessLoan("01", "Juan", 3000, 1);
        loans[1] = new BussinessLoan("02", "Jose", 4000, 3);
        loans[2] = new BussinessLoan("03", "Miguel", 23423, 1);
        loans[3] = new PersonalLoan("04", "asdasd", 100001, 3);
        loans[4] = new PersonalLoan("05", "Chale", 2202, 5);
        
        
        for (int i = 0; i < 5; i++) {
            System.out.println(loans[i].toString());
        }
    }
    
}
