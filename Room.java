public abstract class Room {
    protected int roomNum;
    protected String roomStatus; // reserved, occupied, available
    protected String roomTierTypeDesc; // deluxe-reg, etc
    protected double basePrice = 5_000.00;
    
    protected Room(int roomNum) {
        this.roomNum = roomNum;
        this.roomStatus = "AVAILABLE";
    }
    // update the room status
    protected int getRoomNum(){return roomNum;}
    protected void setRoomStatus(String roomStatus){this.roomStatus = roomStatus;}
    protected String getRoomStatus(){return roomStatus;}
    protected String getRoomTierTypeDesc(){return roomTierTypeDesc;}
    protected abstract double calculatePrice();
    protected abstract String getRoomTier();
    protected abstract String getRoomTierDesc();
    protected abstract String getRoomTypeDesc();
    protected abstract String getRoomType();
    protected abstract int getRoomPax();
    
}

class DeluxeRegular extends Room implements Deluxe, Regular{
    public DeluxeRegular(int roomNum){
        super(roomNum);
        this.roomTierTypeDesc = """
                Our deluxe-regular rooms offer a cozy and inviting atmosphere, with a king-size bed or two twin beds, a private bathroom, a minibar, a flat-screen TV, and free Wi-Fi. 
                Our deluxe-regular rooms are suitable for up to 6 guests who want to enjoy a comfortable and relaxing stay.""";
    }
    public String getRoomTier(){return DELUXE_TIER;}
    public String getRoomTierDesc(){return DELUXE_TIER_DESC;}
    public String getRoomTypeDesc(){return REGULAR_DESC;}
    public String getRoomType(){return REGULAR_TYPE;}
    public int getRoomPax(){return REGULAR_PAX;}

    @Override
    public double calculatePrice(){
        return basePrice + REGULAR_FEE + DELUXE_FEE;
    }
}
class DeluxeSuite extends Room implements Deluxe, Suite{
    public DeluxeSuite(int roomNum){
        super(roomNum);
        this.roomTierTypeDesc = """
                Our deluxe-suites offer a spacious and elegant environment, with a separate living room and bedroom, a private bathroom with a bathtub, a kitchenette, a dining area, a flat-screen TV, and free Wi-Fi. 
                Our deluxe-suites are ideal for up to 10 guests who want to experience a higher level of luxury and convenience.""";
    }
    public String getRoomTier(){return DELUXE_TIER;}
    public String getRoomTierDesc(){return DELUXE_TIER_DESC;}
    public String getRoomTypeDesc(){return SUITE_DESC;}
    public String getRoomType(){return SUITE_TYPE;}
    public int getRoomPax(){return SUITE_PAX;}
    @Override
    public double calculatePrice(){
        return basePrice + SUITE_FEE + DELUXE_FEE;
    }
}
class DeluxeVilla extends Room implements Deluxe, Villa{
    public DeluxeVilla(int roomNum){
        super(roomNum);
        this.roomTierTypeDesc = """
                Our deluxe-villas offer a luxurious and exclusive setting, with a private pool, a garden, a terrace, a barbecue area, a fully equipped kitchen, a living room, a dining room, a flat-screen TV, and free Wi-Fi. 
                Our deluxe-villas are the perfect choice for up to 15 guests who want to indulge themselves in the ultimate indulgence and sophistication.""";
    }

    public String getRoomTier(){return DELUXE_TIER;}
    public String getRoomTierDesc(){return DELUXE_TIER_DESC;}
    public String getRoomTypeDesc(){return VILLA_DESC;}
    public String getRoomType(){return VILLA_TYPE;}
    public int getRoomPax(){return VILLA_PAX;}

    @Override
    public double calculatePrice(){
        return basePrice + VILLA_FEE + DELUXE_FEE;
    }
}
class ExecutiveRegular extends Room implements Executive, Regular{
    public ExecutiveRegular(int roomNum){
        super(roomNum);
        this.roomTierTypeDesc = """
                Our executive-regular rooms offer a comfortable and stylish atmosphere, with a king-size bed or two twin beds, a private bathroom, a minibar, a flat-screen TV, and free Wi-Fi. 
                Our executive-regular rooms also include exclusive access to our executive lounge and benefits, such as complimentary breakfast, snacks, drinks, and newspapers. 
                Our executive-regular rooms are suitable for up to 6 guests who value comfort and simplicity.""";
    }

    public String getRoomTier(){return EXECUTIVE_TIER;}
    public String getRoomTierDesc(){return EXECUTIVE_TIER_DESC;}
    public String getRoomTypeDesc(){return REGULAR_DESC;}
    public String getRoomType(){return REGULAR_TYPE;}
    public int getRoomPax(){return REGULAR_PAX;}

    @Override
    public double calculatePrice(){
        return basePrice + REGULAR_FEE + EXECUTIVE_FEE;
    }
}
class ExecutiveSuite extends Room implements Executive, Suite{
    public ExecutiveSuite(int roomNum){
        super(roomNum);
        this.roomTierTypeDesc = """
                Our executive-suites offer a spacious and refined environment, with a separate living room and bedroom, a private bathroom with a bathtub, a kitchenette, a dining area, a flat-screen TV, and free Wi-Fi. 
                Our executive-suites also include exclusive access to our executive lounge and benefits, such as complimentary breakfast, snacks, drinks, and newspapers. 
                Our executive-suites are ideal for up to 10 guests who appreciate more space and privacy.""";
    }

    public String getRoomTier(){return EXECUTIVE_TIER;}
    public String getRoomTierDesc(){return EXECUTIVE_TIER_DESC;}
    public String getRoomTypeDesc(){return SUITE_DESC;}
    public String getRoomType(){return SUITE_TYPE;}
    public int getRoomPax(){return SUITE_PAX;}

    @Override
    public double calculatePrice(){
        return basePrice + SUITE_FEE + EXECUTIVE_FEE;
    }
}
class ExecutiveVilla extends Room implements Executive, Villa{
    public ExecutiveVilla(int roomNum){
        super(roomNum);
        this.roomTierTypeDesc = """
                Our executive-villas offer a luxurious and secluded setting, with a private pool, a garden, a terrace, a barbecue area, a fully equipped kitchen, a living room, a dining room, a flat-screen TV, and free Wi-Fi. 
                Our executive-villas also include exclusive access to our executive lounge and benefits, such as complimentary breakfast, snacks, drinks, and newspapers. 
                Our executive-villas are the ultimate choice for up to 15 guests who seek a home away from home.""";
    }

    public String getRoomTier(){return EXECUTIVE_TIER;}
    public String getRoomTierDesc(){return EXECUTIVE_TIER_DESC;}
    public String getRoomTypeDesc(){return VILLA_DESC;}
    public String getRoomType(){return VILLA_TYPE;}
    public int getRoomPax(){return VILLA_PAX;}

    @Override
    public double calculatePrice(){
        return basePrice + VILLA_FEE + EXECUTIVE_FEE;
    }
}
class PresidentialRegular extends Room implements Presidential, Regular{
    public PresidentialRegular(int roomNum){
        super(roomNum);
        this.roomTierTypeDesc = """
                Our presidential-regular rooms offer a cozy and sophisticated atmosphere, with a king-size bed or two twin beds, a private bathroom, a minibar, a flat-screen TV, and free Wi-Fi. 
                Our presidential-regular rooms also feature stunning views, lavish furnishings, and state-of-the-art technology, as well as personalized service and attention from our dedicated staff. 
                Our presidential-regular rooms are suitable for up to 6 guests who value comfort and simplicity.""";
    }

    public String getRoomTier(){return PRESIDENTIAL_TIER;}
    public String getRoomTierDesc(){return PRESIDENTIAL_TIER_DESC;}
    public String getRoomTypeDesc(){return REGULAR_DESC;}
    public String getRoomType(){return REGULAR_TYPE;}
    public int getRoomPax(){return REGULAR_PAX;}

    @Override
    public double calculatePrice(){
        return basePrice + REGULAR_FEE + PRESIDENTIAL_FEE;
    }
}
class PresidentialSuite extends Room implements Presidential, Suite{
    public PresidentialSuite(int roomNum){
        super(roomNum);
        this.roomTierTypeDesc = """
                Our presidential-suites offer a spacious and luxurious environment, with a separate living room and bedroom, a private bathroom with a bathtub, a kitchenette, a dining area, a flat-screen TV, and free Wi-Fi. 
                Our presidential-suites also feature stunning views, lavish furnishings, and state-of-the-art technology, as well as personalized service and attention from our dedicated staff. 
                Our presidential-suites are ideal for up to 10 guests who appreciate more space and privacy.""";
    }

    public String getRoomTier(){return PRESIDENTIAL_TIER;}
    public String getRoomTierDesc(){return PRESIDENTIAL_TIER_DESC;}
    public String getRoomTypeDesc(){return SUITE_DESC;}
    public String getRoomType(){return SUITE_TYPE;}
    public int getRoomPax(){return SUITE_PAX;}

    @Override
    public double calculatePrice(){
        return basePrice + SUITE_FEE + PRESIDENTIAL_FEE;
    }
}
class PresidentialVilla extends Room implements Presidential, Villa{
    public PresidentialVilla(int roomNum){
        super(roomNum);
        this.roomTierTypeDesc = """
                Our presidential-villas offer a luxurious and exclusive setting, with a private pool, a garden, a terrace, a barbecue area, a fully equipped kitchen, a living room, a dining room, a flat-screen TV, and free Wi-Fi. 
                Our presidential-villas also feature stunning views, lavish furnishings, and state-of-the-art technology, as well as personalized service and attention from our dedicated staff. 
                Our presidential-villas are the perfect choice for up to 15 guests who seek the ultimate indulgence and sophistication.""";
    }
    public String getRoomTier(){return PRESIDENTIAL_TIER;}
    public String getRoomTierDesc(){return PRESIDENTIAL_TIER_DESC;}
    public String getRoomTypeDesc(){return VILLA_DESC;}
    public String getRoomType(){return VILLA_TYPE;}
    public int getRoomPax(){return VILLA_PAX;}

    @Override
    public double calculatePrice(){
        return basePrice + VILLA_FEE + PRESIDENTIAL_FEE;
    }
}