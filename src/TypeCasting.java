public class TypeCasting {
    public static void main(String[] args) {
        long bottleCount = 20L;
        int count = (int) bottleCount;

        System.out.println("count: " + count);

        int numberOfItemsSold = 1500;
        long totalItemsSold = numberOfItemsSold;

        System.out.println("totalItemsSold: " + totalItemsSold);

        long yearlyRevenue = 2_500_000_000L;
        int truncatedRevenue = (int) yearlyRevenue;

        System.out.println("yearlyRevenue: "+ yearlyRevenue);
        System.out.println("truncatedRevenue: " + truncatedRevenue);

        char currencySymbol = '$';
        int currencyAscii = currencySymbol;

        System.out.println("currencySymbol: " + currencySymbol);
        System.out.println("currencyAscii: " + currencyAscii);

        int randomAsciiSymbol = 33;
        char randomSymbol = (char) randomAsciiSymbol;

        System.out.println("randomAsciiSymbol: " + randomAsciiSymbol);
        System.out.println("randomSymbol: " + randomSymbol);
    }
}
