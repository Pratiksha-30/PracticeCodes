package HomeWork;

public class SecondMax {
    public static void main(String[] args) {
        int[] salaries = {7, 10, 4, 13, 25, 18, 9, 8, 17};
        int max=1;
        int secMax=1;

        for(int i=0;i< salaries.length;i++){
            if(salaries[i]>=max){
                secMax=max;
                max=salaries[i];

            }else if(salaries[i]>=secMax){
                secMax=salaries[i];

            }
        }
        System.out.println(secMax);
    }
}
