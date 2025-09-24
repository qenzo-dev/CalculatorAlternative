
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double num1,num2,result;
        int choice;

        do{
            System.out.println(" ==== Main Menu ==== \n");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit the program");

            choice = input.nextInt();

            if (choice == 5){
                System.out.println("Exiting the program, thank you for using it");
                break;
            }

            System.out.println("Enter first number");
            num1 = input.nextInt();
            System.out.println("Enter second number");
            num2 = input.nextInt();

            switch(choice){

                case 1:
                    result = num1 + num2;
                    System.out.println("Result = " +result);
                    break;

                case 2:
                    result = num1 - num2;
                    System.out.println("Result = " +result);
                    break;

                case 3:
                    result = num1 * num2;
                    System.out.println("Result = " +result);
                    break;

                case 4:
                    if(num2 != 0){
                        result = num1/num2;
                        System.out.println("Result = "+ result);
                    }else{
                        System.out.println("Error:Division by Zero");
                    }
                    break;
                default:
                    System.out.println("You made an invalid choice, try again");
            }


        }while(true);



    }
}