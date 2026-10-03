 class SolarRooftop {

    double calculateTotalEnergy(double morningEnergy, double eveningEnergy) {
         return morningEnergy+eveningEnergy;
    }

    public static void main(String[] args) {

       
        SolarRooftop obj = new SolarRooftop();
        double total = obj.calculateTotalEnergy(6.7,7.6);
        System.out.println(total);

    }
}