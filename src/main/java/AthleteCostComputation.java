/*
 * AthleteCostComputation
 *
 * 17.0.1
 *
 * 10-14-2024
 *
 * Kevin Jeff Ouano
 * */

public class AthleteCostComputation extends AthleteInformation{
    // Computes Training Plan Cost
    public double getTrainingPlanCost(){
        double basePrice;
        double trainingPlanCost = 0;

        switch (getAthleteTrainingPlan()) {
            case "Beginner" -> {
                basePrice = 25.00;
                trainingPlanCost = basePrice * 4;
            }
            case "Intermediate" -> {
                basePrice = 30.00;
                trainingPlanCost = basePrice * 4;
            }
            case "Elite" -> {
                basePrice = 35.00;
                trainingPlanCost = basePrice * 4;
            }
        }
        return trainingPlanCost;
    }
    // Computes Competition Cost
    public double getCompetitionCost(){
        double basePrice = 22.00;
        return basePrice * getAthleteNumberOfCompetitions();
    }

    // Computes Coaching Cost
    public double getCoachingCost(){
        double basePrice = 9;
        return basePrice * (getAthletePrivateCoachingHours() * 4);
    }
}
