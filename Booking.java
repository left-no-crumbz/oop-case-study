import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Arrays;
public class Booking {
    static Scanner sc = new Scanner(System.in);
    DateTimeFormatter format = DateTimeFormatter.ofPattern("MM-dd-yyyy");
    RoomPopulator populator = new RoomPopulator();
    Room[] hotelRooms = populator.populateRooms();

    public void makeReservation(){
        // TODO:
        // We should help customers to create a decision
        char roomTierChoice;
        char roomTypeChoice;
        String roomTier = "";
        String roomType = "";

        do {
            System.out.println("ROOM TIERS:");
            System.out.println("[D]ELUXE");
            System.out.println("[E]XECUTIVE");
            System.out.println("[P]RESIDENTIAL");
            System.out.print("Enter the room tier you want to check in: ");
            roomTierChoice = sc.nextLine().toUpperCase().charAt(0);
        } while (roomTierChoice != 'D' && roomTierChoice != 'E' && roomTierChoice != 'P');
        
        switch (roomTierChoice) {
            case 'D':
                roomTier = "DELUXE";
                break;
            case 'E':
                roomTier = "EXECUTIVE";
                break;
            case 'P':
                roomTier = "PRESIDENTIAL";
                break;
        }

        do {
            System.out.println("ROOM TYPES:");
            System.out.println("[R]EGULAR");
            System.out.println("[S]UITE");
            System.out.println("[P]RESIDENTIAL");
            System.out.print("Enter the room type you want to check in: ");
            roomTypeChoice = sc.nextLine().toUpperCase().charAt(0);
        } while (roomTypeChoice != 'R' && roomTypeChoice != 'S' && roomTypeChoice != 'P');

        switch (roomTypeChoice) {
            case 'R':
                roomType = "REGULAR";
                break;
            case 'S':
                roomType = "SUITE";
                break;
            case 'P':
                roomType = "VILLA";
                break;
        }

        final String finalRoomTier = roomTier;
        final String finalRoomType = roomType;

        System.out.printf("Showing the rooms that are %s tier and %s type%n", finalRoomTier, finalRoomType);

        Arrays.stream(hotelRooms)
            .filter(room -> room.getRoomTier().equals(finalRoomTier) && room.getRoomType().equals(finalRoomType))
            .forEach(
                room -> {
                    System.out.println("Room number: " + room.getRoomNum());
                    System.out.println(room.getRoomStatus());
                    System.out.println(room.getRoomTier());
                    System.out.println(room.getRoomType());
                }
            );

        System.out.print("Enter the room number you want to check in: ");
        int roomNumber = sc.nextInt(); sc.nextLine();
        //TODO:
        // - check if the room number is occupied/reserved
    }
    
    //TODO:
    // - add room as an argument. makeReservation should return a room.
    public String checkIn(){
        boolean isValidDate;
        char choice;
        LocalDate checkInDate = LocalDate.now();
    

        // Asks the customer if they would like to check in today or make a reservation instead.
        // forces the user to input between Y and N only. 
        do {
            System.out.print("Would you like to check in today?[Y/N]: "); 
            choice = sc.nextLine().toUpperCase().charAt(0);
        } while (choice != 'Y' && choice != 'N');
        
        switch (choice) {
            // customer opts for walk-in
            case 'Y':
                //room.setRoomStatus("OCCUPIED");
                break;
            // customer opts for reservation
            case 'N':
                /* validates the given reservation date if:
                    1. the date is in the correct format
                    2. the date is not in the past */
                do {
                    isValidDate = true;
                    try {
                        System.out.print("\n| Format: MM-dd-yy |\nPlease enter the date when you want to reserve: ");
                        String date = sc.nextLine();
                        
                        // checks the date if its a valid date format
                        checkInDate = LocalDate.parse(date, format);
                        
                        // checks if the date entered is in the past
                        if(checkInDate.isBefore(LocalDate.now())){
                            throw new DateIsInThePastException("ERROR: The date you entered is in the past. Please try again.\n");
                        }
                    } catch (DateTimeParseException e) {
                        System.out.println("ERROR: Invalid date format. Please try again.\n");
                        isValidDate = false;
                    } catch (DateIsInThePastException e){
                        System.out.println(e.getMessage());
                        isValidDate = false;
                    }
                } while (!isValidDate);
                break;
        }
        //room.setRoomStatus("RESERVED");
    return checkInDate.format(format);
    }

    public String checkOut(String strCheckIn){
        boolean isValidLength = true;
        int length = 0;
        
        /* parses the argument from str to LocalDate
        doesn't need a try catch - check-in will always be right 
        since it is validated in the checkIn() function */
        LocalDate checkIn = LocalDate.parse(strCheckIn, format);
        
        // asks how many days will the customer stay at the hotel
        do {
            try {
                isValidLength = true;
                System.out.print("How many days would you like to stay?: ");
                length = sc.nextInt(); sc.nextLine();
                
                if(length < 0)
                    throw new InvalidLengthOfStayException("ERROR: Length of stay cannot be less than 0. Please try again.\n"); 
            } catch (InputMismatchException e) {
                System.out.println("ERROR: Input is not an integer. Please try again.\n");
                isValidLength = false;
            } catch (InvalidLengthOfStayException e){
                System.out.println(e.getMessage());
                isValidLength = false;
            }
        } while (!isValidLength || length < 0);
        
        LocalDate checkOut = checkIn.plusDays(length);

        return checkOut.format(format);
    }
    public void getUserInfo(){
        System.out.print("Enter your first name: ");
        String firstName = sc.nextLine();
        
        System.out.print("Enter your last name: ");
        String lastName = sc.nextLine();
        
        System.out.print("Enter your address: ");
        String address = sc.nextLine();

        
        int choice;
        do {
            System.out.println("Enter your mode of payment: ");
            System.out.println("1. Credit Card");
            System.out.println("2. Cash");
            System.out.println("3. Cheque");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt(); sc.nextLine();
            if(!(choice >= 1 && choice <= 3))
                System.out.println("Input should only be between 1-3. Please try again.");
        } while (!(choice >= 1 && choice <= 3));
        
        String modeOfPayment;
        
        switch (choice) {
            case 1:
                modeOfPayment = "CREDIT CARD";
                break;
            case 2:
                modeOfPayment = "CASH";
                break;
            case 3:
                modeOfPayment = "CHEQUE";
                break;
        }
            
            System.out.print("Enter your email: ");
            String email = sc.nextLine();

            boolean isValidContact = false;
            do {
                System.out.println("Enter your contact number: (+63)");
                String contactNum = sc.nextLine();
                isValidContact = contactNum.matches("^\\d{10}$");
            } while (!isValidContact);
    }
}



class DateIsInThePastException extends Exception{
    public DateIsInThePastException(String message){
        super(message);
    }
}
class InvalidLengthOfStayException extends Exception{
    public InvalidLengthOfStayException(String message){
        super(message);
    }
}