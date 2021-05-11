public class Randproc {
    private int demand;
    private int gallonsDelivered;
    public Randproc()
    {
        demand=0;
        gallonsDelivered=0;
    }
    public int proccessGenForDemand(int quarter) {
    int x = (int) (Math.random() * 100);
    int gallons = 0;
    switch (quarter) {
    case 1:
        if (x <= 30) {
        gallons = 40;
        } else if (x <= 50) {
        gallons = 50;
        } else if (x <= 80) {
        gallons = 60;
        } else if (x < 90) {
        gallons = 70;
        } else gallons = 80;
    case 2:
        if (x <= 15) {
        gallons = 40;
        } else if (x <= 55) {
        gallons = 50;
        } else if (x <= 80) {
        gallons = 60;
        } else if (x < 90) {
        
        gallons = 70;
        } else gallons = 80;
    case 3:
        if (x <= 5) {
        gallons = 40;
        } else if (x <= 15) {
        gallons = 50;
        } else if (x <= 45) {
        gallons = 60;
        } else if (x < 85) {
        gallons = 70;
        } else gallons = 80;
    case 4:
        if (x <= 40) {
        gallons = 40;
        } else if (x <= 80) {
        gallons = 50;
        } else if (x <= 90) {
        gallons = 60;
        } else if (x < 95) {
        gallons = 70;
        } else gallons = 80;
        }
    return gallons;
    } // end of proccess gen for Demand
    public double processGenForGallonsDelivered(double gallonsOrdered) {
        int x = (int) (Math.random() * 100);
        double gallonsDelievered = 0;
        if (x <= 10) {
            gallonsDelievered = gallonsOrdered - 5; // Mother is not gonna like this!
        } else if (x <= 80) {
            gallonsDelievered = gallonsOrdered;
        } else gallonsDelievered = gallonsOrdered + 10;
            return gallonsDelievered;
        }
}
