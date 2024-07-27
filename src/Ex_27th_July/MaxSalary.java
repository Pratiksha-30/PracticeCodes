package Ex_27th_July;

public class MaxSalary {
    public static void main(String[] args) {
        int[] salary={7,9,10,4,2,30,8};
        int Max=1;
        for(int i=0;i< salary.length;i++){
            if(salary[i]>Max){
                Max=salary[i];


            }

        } System.out.println("Max Salary is ->" +Max);

    }
}
