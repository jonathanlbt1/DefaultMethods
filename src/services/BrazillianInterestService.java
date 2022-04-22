package services;

public class BrazillianInterestService implements InterestService{

    private double interestRate;

    public BrazillianInterestService(double interestRate){
        this.interestRate = interestRate;
    }

    @Override
    public double getInterestRate(){
        return interestRate;
    }
}
