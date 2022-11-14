class UseTrain {
    public static void main(String[] args) {
        Train treno = new Train();
        treno.build(24, 70, 3, 22);
        treno.reserveFirstClassSeats(2);
        treno.reserveSecondClassSeats(10);
        System.out.println(treno.getTotOccupancyRatio());
        System.out.println(treno.getFirstClassOccupancyRatio());
        System.out.println(treno.getSecondClassOccupancyRatio());
        treno.deleteAllreservation();
        treno.reserveFirstClassSeats(16);
        treno.reserveSecondClassSeats(47);
        System.out.println(treno.getTotOccupancyRatio());
        System.out.println(treno.getFirstClassOccupancyRatio());
        System.out.println(treno.getSecondClassOccupancyRatio());
    }
}
