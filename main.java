public class main {
    public static void main(String[] args) {
    int demand;
    
    for (int problemcase=0; problemcase <2; problemcase++) {
        Mother mother = new Mother();
        Randproc randomproc = new Randproc();
        mother.setProblemCase(problemcase);
    for (int year = 1; year <= 10; year++) {
        // order ice cream for the first week
        mother.setOrdered(50);
    for (int week = 1; week <= 52; week++) {
    // find out what quarter were in
    int quarter = mother.getQuarter(week);
    //Calculate Demand
    demand = randomproc.proccessGenForDemand(quarter);
    // set the demand for Mother
    mother.setdemand(demand);
    // record the statistics for this week
    mother.setprofit(mother.getprofit());
    // Mother Orders Gallons for next week and receives them
        switch (problemcase) 
        {
        case 0: // Mother's Original ordering scheme
            mother.motherordersGallons(quarter);
        case 1:// Ronnie's Order scheme
            mother.ronnieOrdersGallons();
        }  
         mother.setDelivered(randomproc.processGenForGallonsDelivered(mother.getordered()));
        } // end of weeks loop
    } // end of years loop
    // shows all the statistics for our 10 years
                System.out.println("\nCase: "+ mother.getProblemCase() +"\n");
                System.out.println("sold " + mother.getsold() + " ordered " + mother.getordered());
                System.out.println("profit " + mother.getprofit());
                System.out.println("**************Stats for 10 Years of Sales***************");
                System.out.println("Average profit " + mother.getaverage());
                System.out.println("Average Gallons sold per week " +
                (mother.getAvgGallonsSoldPerWeek()));
                System.out.println("Profit variance " + mother.getvar() + " Profit st dev " +
                mother.getstdev());
                System.out.println("Average Demanded " + mother.getAvgDemand());
                System.out.println("Demand variance " + mother.getVariancDemand() + " Demand st dev "+mother.getStdevDemand());
                System.out.println("count " + mother.getcount());
            } // end of problem cases loop
        } // end of main method
    } // end of main Class
    

