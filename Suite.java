public interface Suite {
    static final String SUITE_TYPE = "SUITE";
    static final String SUITE_DESC = """
        Our suites are perfect for guests who appreciate more space and privacy. 
        Our suites consist of a separate living room and bedroom, a private bathroom with a bathtub, a kitchenette, a dining area, a flat-screen TV, and free Wi-Fi. 
        Our suites can accommodate up to 10 guests.
            """;
    static final int SUITE_PAX = 10;
    static final double SUITE_FEE = 10_000;
    String getRoomTypeDesc();
    String getRoomType();
    int getRoomPax();

}
