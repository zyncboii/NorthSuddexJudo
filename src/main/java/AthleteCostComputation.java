/*
* This class is responsible for the computation of all the costs
*
* Version: 1.0.0
* Author: Kevin Jeff Ouano
* */

public class AthleteCostComputation extends AthleteInformation{
    private static final int WEEKS_IN_MONTH = 4; // There are 4 weeks in a month

    // Computes Training Plan Cost
    public double getTrainingPlanCost(){
        double basePrice = 0;

        switch (getAthleteTrainingPlan()) {
            case "Beginner" -> basePrice = 25.00;
            case "Intermediate" -> basePrice = 30.00;
            case "Elite" -> basePrice = 35.00;
        }
        return basePrice * WEEKS_IN_MONTH;
    }
    // Computes Competition Cost
    public double getCompetitionCost(){
        double basePrice = 22.00;
        return basePrice * getAthleteNumberOfCompetitions();
    }

    // Computes Coaching Cost
    public double getCoachingCost(){
        double basePrice = 9;
        return basePrice * (getAthletePrivateCoachingHours() * WEEKS_IN_MONTH);
    }
}
