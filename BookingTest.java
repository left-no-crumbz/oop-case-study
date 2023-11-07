public class BookingTest {
    public static void main(String[] args) {
        Booking booking = new Booking();
        booking.makeReservation();
        String checkInDate = booking.checkIn();
        String checkOutDate = booking.checkOut(checkInDate);
        System.out.println("Check in date: " + checkInDate);
        System.out.println("Check out date: " + checkOutDate);
    }
}
