public class Athlete extends AthleteCostComputation{
    public void displayAthleteInfo(){
        String weightCategory = getAthleteWeightCategory();
        String currentWeightCategory = getAthleteCurrentWeightCategory();
        int requiredWeight;

        System.out.println("Name: " + getAthleteName());
        System.out.println("Weight: " + getAthleteWeight());
        System.out.println("Category: " + getAthleteWeightCategory());
        System.out.println("Total Costs: ");
        System.out.printf("    1. Plan - " + getAthleteTrainingPlan() + " @ $%.2f\n",getTrainingPlanCost());
        if (getAthleteTrainingPlan() != "Beginner"){
            System.out.printf("    2. Competition - " + athleteNumberOfCompetitions + " @ $%.2f\n",getCompetitionCost());
            System.out.printf("    3. Private Coaching - " + athletePrivateCoachingHours + "Hours @ $%.2f\n",getCoachingCost());

        }
        else if (athleteTrainingPlan == "Beginner"){
            System.out.printf("    2. Private Coaching - " + athletePrivateCoachingHours + "Hours @ $%.2f\n",getCoachingCost());
        }
        System.out.printf("Total Cost: $%.2f\n",(getTrainingPlanCost() + getCompetitionCost() + getCoachingCost()));

        if (!weightCategory.equals(currentWeightCategory)){
            if (athleteWeight < categoryWeightMinimum){
                requiredWeight = categoryWeightMinimum - athleteWeight;
                System.out.println("Your current weight is " + athleteWeight + " (" + getAthleteCurrentWeightCategory() + ")" + ", the minimum weight for your desired category is " + categoryWeightMinimum + " (" + athleteWeightCategory + "). You need to gain " + requiredWeight + " to compete in this category.");
            } else if (athleteWeight > categoryWeightLimit) {
                requiredWeight = athleteWeight - categoryWeightLimit;
                System.out.println("Your current weight is " + athleteWeight + " (" + getAthleteCurrentWeightCategory() + ")" + ", the maximum weight for your desired category is " + categoryWeightLimit + " (" + athleteWeightCategory + "). You need to lose " + requiredWeight + " to compete in this category.");
            }
        } else {
            System.out.println("Your current weight is " + athleteWeight + " (" + getAthleteCurrentWeightCategory() + ")" + ", which is suitable for your desired category is " + categoryWeightLimit + " (" + athleteWeightCategory + "). You are eligible to compete in this category.");
        }
    }
}
