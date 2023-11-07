public interface Presidential {
    static final String PRESIDENTIAL_TIER = "PRESIDENTIAL";
    static final String PRESIDENTIAL_TIER_DESC = """
        Indulge yourself in the ultimate indulgence and sophistication in our presidential rooms, which are the epitome of elegance and style. 
        Our presidential rooms boast stunning views, lavish furnishings, and state-of-the-art technology, as well as personalized service and attention from our dedicated staff.
        """;
    static final double PRESIDENTIAL_FEE = 15_000;
    // SET AMMENTIES
    String getRoomTier();
    String getRoomTierDesc();
}
