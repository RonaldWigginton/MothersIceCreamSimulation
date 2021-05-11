public class Mother {
    private double demand;// this is the demand for the week
    private double ordered;// this is the amount ordered for toweek
    private double delivered;
    private double bought;//this is the amount bought for toweek
    private double sold;// this is the amount sold for toweek
    private double thrownout; // this is the amount returned for the week
    private double count; // to count our Days of sales for other stats
    private double profit;//
    private int problemCase; // case for the problem 1 = a 2 = b 3 = c
    private double totalGallonsDemanded; // store the total amount of gallons Demanded
    private double totalGallonsDemanded2; // total squared
    private double avgDemand; // avg demand
    private double previousDemand; // Store the demand of the prior week.
    private double totalGallonsSold; // total of how mnay gallons have been sold
    private double psum;//sum of profit for all weeks
    private double psum2;//sum squaared of profit
    private double average;//average profit
    private double stdev;//standard deviation
    private double variance;// variance
    private double stdevDemand; // SD for demand
    private double variancDemand; // variance for demand
    
    // now for the behaviors of the mother
    public Mother() {// this is the constructor for the mother
    // set all values to 0 and start him with 16 gallons
    demand = 0;
    ordered = 50;
    delivered = 50;
    bought = 0;
    sold = 0;
    profit = 0.0;
    thrownout= 0;
    problemCase = 0;
    totalGallonsSold = 0;
    totalGallonsDemanded = 0;
    totalGallonsDemanded2 = 0;
    previousDemand = 0;
    stdevDemand = 0;
    totalGallonsSold = 0;
    profit = psum = psum2 = average = stdev = variance = 0;
    count = 0;
    }//end of Mother constructor
    
    private void behavior() {// this is the behavior of the mother.
    // recieve the gallons ordered last week
    bought = ordered;
    //System.out.println ("nboybehavior bought "+bought+" demand "+demand);
    // calculate the gallons sold
    if (demand >= delivered) sold = delivered;
    else
    sold = demand;
    if (sold < delivered) {
    
    thrownout = delivered - sold;
    }
    // keep track of demand before ordering for tomorrow
    previousDemand = demand;
    // calculate profit
    profit = 17.00 * sold - 7.00 * bought; // Because we payed and ordered sometimes more than what is delivered
    // order for tomorrow
    // ordered = this.motherordersGallons(this);
    // System.out.println(" bought "+bought+" ordered "+ordered+" demand "+demand+" sold "+sold);
    }// this is the end of the behavior of the mother
    public void setdemand(int x) {// we will give the mother a demand and then let him behave as appropriate
    demand = x;
    totalGallonsDemanded += demand;
    totalGallonsDemanded2 += demand * demand;
    
    //given the demand for the week, activate the the behavior of the mother object
    behavior();
    }//end of setdemand
        public void setDelivered(double delivered){
        this.delivered = delivered;
    }
    public void setOrdered(int ordered) {
        this.ordered = ordered;
    }
    public void setprofit(double x) {// this function sets profit and calculates the stats for the week
        profit = x;
        psum += profit;
        psum2 += profit * profit;
        totalGallonsSold += sold;
        count++;
        average = psum / count;
        avgDemand = totalGallonsDemanded / count;
        variancDemand = totalGallonsDemanded2 / count - avgDemand * avgDemand;
        stdevDemand = Math.sqrt(variancDemand);
        variance = psum2 / count - average * average;
        stdev = Math.sqrt(variance);
    return;
    }// end of setprofit
    public void motherordersGallons(int quarter){
    switch (quarter)
        {
                case 1:
                    ordered = 50;
                    return;
                case 2:
                    ordered = 60;
                    return;
                case 3:
                    ordered = 60;
                    return;
                
                case 4:
                    ordered = 50;
            return;
        }
    }
    public void ronnieOrdersGallons(){
        demand = previousDemand;
    }
    public void setProblemCase(int pCase) {
        problemCase = pCase;
    }
    public String getProblemCase() {
        return "Problem: " + problemCase;
    }
    public double getAvgGallonsSoldPerWeek() {
        return totalGallonsSold / count;
    }
    
    //********************************Now Create the Utility functions to Interrograte the Mother Object
    public double getprofit() {
    return profit;
    }
    public double getsold() {
    return sold;
    }
    public double getordered() {
    return ordered;
    }
    public double getaverage() {
    return average;
    }
    public double getvar() {
    return variance;
    }
    public double getstdev() {
    return stdev;
    }
    public double getcount() {
    return count;
    }
    public double getStdevDemand() {
    return stdevDemand;
    }
    
    public double getVariancDemand() {
    return variancDemand;
    }
    public double getAvgDemand() {
    return avgDemand;
    }
    public static int getQuarter(int week) {
    int quarter;
    if (week > 52) {
    week = week % 52; // this is the week of whatever year since start
    }
    if (week <= 13) {
        quarter = 1;
    } else if (week <= 26) {
        quarter = 2;
    } else if (week <= 39) {
        quarter = 3;
    } else quarter = 4;
    return quarter;
    }
} // end of the Mother Class
