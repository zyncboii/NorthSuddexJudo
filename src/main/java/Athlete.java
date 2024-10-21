/*
 * This class is responsible for displaying the proper format
 *
 * Version: 1.0.0
 * Author: Kevin Jeff Ouano
 * */

// This class formats the display
public class Athlete extends AthleteCostComputation{
    public void displayAthleteInfo(){
        String weightCategory = getAthleteWeightCategory();
        String currentWeightCategory = getAthleteCurrentWeightCategory();
        int requiredWeight;
        int athleteWeight = getAthleteWeight();
        int categoryWeightMinimum = getCategoryWeightMinimum();
        int categoryWeightLimit = getCategoryWeightLimit();
        int athleteNumberOfCompetitions = getAthleteNumberOfCompetitions();
        int athletePrivateCoachingHours = getAthletePrivateCoachingHours();

        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Name: " + getAthleteName());
        System.out.println("Weight: " + getAthleteWeight());
        System.out.println("Category: " + getAthleteWeightCategory());
        System.out.println("Total Costs: ");
        System.out.printf("    1. Plan - " + getAthleteTrainingPlan() + " @ $%.2f\n",getTrainingPlanCost());
        if (!getAthleteTrainingPlan().equals("Beginner")){
            System.out.printf("    2. Competition - " + athleteNumberOfCompetitions + " @ $%.2f\n",getCompetitionCost());
            System.out.printf("    3. Private Coaching - " + athletePrivateCoachingHours + "Hours @ $%.2f\n",getCoachingCost());

        }
        else if (getAthleteTrainingPlan().equals("Beginner")){
            System.out.printf("    2. Private Coaching - " + athletePrivateCoachingHours + " Hours per week @ $%.2f\n",getCoachingCost());
        }
        System.out.printf("Total Cost: $%.2f\n",(getTrainingPlanCost() + getCompetitionCost() + getCoachingCost()));

        if (!weightCategory.equals(currentWeightCategory)){
            if (athleteWeight < categoryWeightMinimum){
                requiredWeight = categoryWeightMinimum - athleteWeight;
                System.out.println("Your current weight is " + athleteWeight + " (" + getAthleteCurrentWeightCategory() + ")" + ", the minimum weight for your desired category is " + categoryWeightMinimum + " (" + weightCategory + "). You need to gain " + requiredWeight + " kgs to compete in this category.");
            } else if (athleteWeight > categoryWeightLimit) {
                requiredWeight = athleteWeight - categoryWeightLimit;
                System.out.println("Your current weight is " + athleteWeight + " (" + getAthleteCurrentWeightCategory() + ")" + ", the maximum weight for your desired category is " + categoryWeightLimit + " (" + weightCategory + "). You need to lose " + requiredWeight + " kgs to compete in this category.");
            }
        } else {
            System.out.println("Your current weight is " + athleteWeight + " (" + getAthleteCurrentWeightCategory() + ")" + ", which is suitable for your desired category, " + weightCategory + " (" + categoryWeightMinimum + "-" + categoryWeightLimit + "). You are eligible to compete in this category.");
        }
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------");
    }
}
