public class IncomeCalculator{
    private double monthlySalary;
    private int months;
    private double taxableAmount;
    
    
    public IncomeCalculator(double mSalary){
        monthlySalary = mSalary;
        months = 12;
    }
    
    public double calculateTax(){
        double as = monthlySalary * months;
        double temp = 0;
        //tax first 50 million
        if(as<=50000000){
            taxableAmount=as*0.05;
        }
        //up to 250 million
        if(as>50000000 && as<=250000000){
            taxableAmount=(50000000*0.05);
            temp = as - 50000000;
            taxableAmount+=(temp*0.15);
        }
        //up to 500 million
        if(as>250000000 && as<=500000000){
            taxableAmount=(50000000*0.05);
            taxableAmount+=(200000000*0.15);
            temp = as - 250000000;
            taxableAmount+=(temp*0.25);
        }
        //above 500 million
        if(as>500000000){
            temp = as - 500000000;
            System.out.println(temp);
            taxableAmount+=(temp*0.30);
            taxableAmount+= (50000000*0.05)+(200000000*0.15)+(250000000*0.25); 
        }
         
        return taxableAmount;
    }
    
}