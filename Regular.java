public interface Regular {
    static final String REGULAR_TYPE = "REGULAR";
    static final String REGULAR_DESC = """
        Our regular rooms are ideal for guests who value comfort and simplicity. 
        Our regular rooms are equipped with a king-size bed or two twin beds, a private bathroom, a minibar, a flat-screen TV, and free Wi-Fi. 
        Our regular rooms can accommodate up to 6 guests.
            """;
    static final int REGULAR_PAX = 6;
    static final double REGULAR_FEE = 5_000;
    String getRoomTypeDesc();
    String getRoomType();
    int getRoomPax();

}