public class AthleteCostComputation extends AthleteInformation{
    public double getTrainingPlanCost(){
        double basePrice = 0;
        double trainingPlanCost = 0;

        if (getAthleteTrainingPlan() == "Beginner"){
            basePrice = 25.00;
            trainingPlanCost = basePrice * 4;
        } else if (getAthleteTrainingPlan() == "Intermediate") {
            basePrice = 30.00;
            trainingPlanCost = basePrice * 4;
        } else if (getAthleteTrainingPlan() == "Elite") {
            basePrice = 35.00;
            trainingPlanCost = basePrice * 4;
        }

        return trainingPlanCost;
    }

    public double getCompetitionCost(){
        double basePrice = 22.00;
        return basePrice * getAthleteNumberOfCompetitions();
    }

    public double getCoachingCost(){
        double basePrice = 9;
        return basePrice * (getAthletePrivateCoachingHours() * 4);
    }
}
