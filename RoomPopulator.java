public class RoomPopulator{
    final Room[] hotelRooms = new Room[45];
    public Room[] populateRooms(){
        for (int i = 0; i < hotelRooms.length; i++) {
            if (i >= 0 && i < 4) {
                hotelRooms[i] = new DeluxeRegular(i+1);
            } else if(i >= 4 && i < 9) {
                hotelRooms[i] = new DeluxeSuite(i+1);
            } else if (i >= 9 && i < 14) {
                hotelRooms[i] = new DeluxeVilla(i+1);
            } else if (i >= 14 && i < 19) {
                hotelRooms[i] = new ExecutiveRegular(i+1);
            } else if (i >= 19 && i < 24) {
                hotelRooms[i] = new ExecutiveSuite(i+1);
            } else if (i >= 24 && i < 29) {
                hotelRooms[i] = new ExecutiveVilla(i+1);
            } else if (i >= 29 && i < 34) {
                hotelRooms[i] = new PresidentialRegular(i+1);
            } else if (i >= 34 && i < 39) {
                hotelRooms[i] = new PresidentialSuite(i+1);
            } else if (i >= 39 && i <= 44) {
                hotelRooms[i] = new PresidentialVilla(i+1);
            }
        }
        return hotelRooms;
    }
    public static void main(String[] args) {
        RoomPopulator populator = new RoomPopulator();
        Room[] hotelRooms = populator.populateRooms();
        for (int i = 0; i < hotelRooms.length; i++) {
            System.out.println("=========================================================================================================");
            System.out.println("Room number: " + hotelRooms[i].getRoomNum());
            System.out.println("Room tier: " + hotelRooms[i].getRoomTier());
            System.out.println("Room tier desc: " + hotelRooms[i].getRoomTierDesc());
            System.out.println("Room type: " + hotelRooms[i].getRoomType());
            System.out.println("Room type desc: " + hotelRooms[i].getRoomTypeDesc());
            System.out.println("Room tier-type desc: " + hotelRooms[i].getRoomTierTypeDesc());
            System.out.println("Room status: " + hotelRooms[i].getRoomStatus());
            System.out.println("=========================================================================================================");
            System.out.println();
            System.out.println();
            System.out.println();
        }
    }
}