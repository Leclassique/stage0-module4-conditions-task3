package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        if (salary <= 10000){
            double taxes = 0.15;
            salary = (int) (salary * taxes);
        } else if (20000>=salary && salary>10000) {
            double taxes = 0.18;
            salary = (int) (salary * taxes);
        } else if (salary>20000) {
            double taxes = 0.2;
            salary = (int) (salary * taxes);
        } else if (salary<0){
            System.out.println("wrong input!");
        }
    }
}
