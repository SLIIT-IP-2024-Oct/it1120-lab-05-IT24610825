import java.util.Scanner;

public class IT24610825Lab5Q3{

   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int ROOM_CHARGE_PER_DAY = 48000;
        final int DISCOUNT_3_TO_4_DAYS = 10;
        final int DISCOUNT_5_OR_MORE_DAYS = 20;

        
       
        System.out.print("Enter the start date of the reservation (1-31): ");
        int startDate = scanner.nextInt();

        System.out.print("Enter the end date of the reservation (1-31): ");
        int endDate = scanner.nextInt();


        boolean isValid = true;

        // Validate input
        if (startDate < 1 || startDate > 31 || endDate < 1 || endDate > 31) {
            System.out.println("Error: Start date and end date must be between 1 and 31.");
            isValid = false;
        } else if (startDate >= endDate) {
            System.out.println("Error: Start date must be less than the end date.");
            isValid = false;
        }

        if (isValid) {
            
            int numberOfDays = endDate - startDate;
         System.out.println("Number of days reserved: " + numberOfDays);

            int discountRate = 0;
            if (numberOfDays >= 3 && numberOfDays <= 4) {
                discountRate = DISCOUNT_3_TO_4_DAYS;
            } else if (numberOfDays >= 5) {
                discountRate = DISCOUNT_5_OR_MORE_DAYS;
            }


            int totalAmount = numberOfDays * ROOM_CHARGE_PER_DAY;
            int discountAmount = totalAmount * discountRate / 100;
            int finalAmount = totalAmount - discountAmount;


   
            System.out.println("Total amount before discount: Rs " + totalAmount);
            System.out.println("Discount applied: " + discountRate + "%");
            System.out.println("Total amount to be paid: Rs " + finalAmount);
        }

    }
}

