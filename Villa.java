public interface Villa {
    static final String VILLA_TYPE = "VILLA";
    static final String VILLA_DESC = """
        Our villas are the ultimate choice for guests who seek a home away from home. 
        Our villas are standalone units with a private pool, a garden, a terrace, a barbecue area, a fully equipped kitchen, a living room, a dining room, a flat-screen TV, and free Wi-Fi. 
        Our villas can accommodate up to 15 guests.
            """;
    static final int VILLA_PAX = 15;
    static final double VILLA_FEE = 15_000;
    String getRoomTypeDesc();
    String getRoomType();
    int getRoomPax();
}
