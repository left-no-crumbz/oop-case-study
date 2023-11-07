public interface Executive {
    static final String EXECUTIVE_TIER = "EXECUTIVE";
    static final String EXECUTIVE_TIER_DESC = """
        Experience a higher level of luxury and convenience in our executive rooms, which are designed to meet the expectations of discerning travelers. 
        Our executive rooms feature spacious and elegant interiors, premium bedding, and exclusive access to our executive lounge and benefits.
        """;
    static final double EXECUTIVE_FEE = 10_000;
    // SET AMMENTIES
    String getRoomTier();
    String getRoomTierDesc();
}
