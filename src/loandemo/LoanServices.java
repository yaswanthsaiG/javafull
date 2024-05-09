package loandemo;

import java.util.UUID;

public class LoanServices {
    public Loan getloan(User user){
        Loan loan=new Loan();
        loan.firstName=user.firstName;
        loan.lastName=user.lastName;
        loan.amount=50000.00;
        loan.EMI= "500";
        loan.tenure="7months";
        loan.loanId= UUID.randomUUID().toString();
        loan.intrest=0.02;

        return loan;
    }
}