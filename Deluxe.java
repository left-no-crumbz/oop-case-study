public interface Deluxe {
    static final String DELUXE_TIER = "DELUXE";
    static final String DELUXE_TIER_DESC = """
        Enjoy a comfortable and relaxing stay in our deluxe rooms, which offer a range of amenities and services to suit your needs. 
        Whether you are traveling for business or leisure, you will find everything you need to make your stay memorable.
        """;
    static final double DELUXE_FEE = 5_000;
    // SET AMMENTIES
    String getRoomTier();
    String getRoomTierDesc();
}