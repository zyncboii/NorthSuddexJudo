/*
* AthleteInformation
*
* 17.0.1
*
* 10-14-2024
*
* Kevin Jeff Ouano
* */

public abstract class AthleteInformation {
    private String athleteName;
    private String athleteWeightCategory;
    private String athleteTrainingPlan;
    private int categoryWeightLimit;
    private int categoryWeightMinimum;
    private int athleteWeight;
    private int athletePrivateCoachingHours;
    private int athleteNumberOfCompetitions;

    // Setters
    public void setAthleteName(String name){
        this.athleteName = name;
    }

    public void setAthleteTrainingPlan(String trainingPlan){
        this.athleteTrainingPlan = trainingPlan;
    }

    public   void setAthleteWeightCategory(String athleteWeightCategory){
        switch (athleteWeightCategory) {
            case "Flyweight" -> {
                this.categoryWeightMinimum = 66;
                this.categoryWeightLimit = 72;
            }
            case "Lightweight" -> {
                this.categoryWeightMinimum = 73;
                this.categoryWeightLimit = 80;
            }
            case "Light-Middleweight" -> {
                this.categoryWeightMinimum = 81;
                this.categoryWeightLimit = 89;
            }
            case "Middleweight" -> {
                this.categoryWeightMinimum = 90;
                this.categoryWeightLimit = 99;
            }
            case "Light-Heavyweight" -> {
                this.categoryWeightMinimum = 100;
                this.categoryWeightLimit = 100;
            }
            case "Heavyweight" -> {
                this.categoryWeightMinimum = 100;
                this.categoryWeightLimit = Integer.MAX_VALUE;
            }
        }
        this.athleteWeightCategory = athleteWeightCategory;
    }

    public void setAthleteWeight(int weight){
        this.athleteWeight = weight;
        getAthleteCurrentWeightCategory(); // Automatically gets athlete current weight category based on weight input
    }

    public void setAthletePrivateCoachingHours(int privateCoachingHours){
        this.athletePrivateCoachingHours = privateCoachingHours;
    }

    public void setAthleteNumberOfCompetitions(int athleteNumberOfCompetitions){
        this.athleteNumberOfCompetitions = athleteNumberOfCompetitions;
    }

    // Getters
    public String getAthleteName(){
        return athleteName;
    }

    public String getAthleteTrainingPlan(){
        return athleteTrainingPlan;
    }

    public String getAthleteWeightCategory(){
        return athleteWeightCategory;
    }

    public int getAthleteWeight(){
        return athleteWeight;
    }

    public int getAthletePrivateCoachingHours(){
        return athletePrivateCoachingHours;
    }

    public int getAthleteNumberOfCompetitions(){
        return athleteNumberOfCompetitions;
    }
    public int getCategoryWeightLimit(){
        return categoryWeightLimit;
    }

    public int getCategoryWeightMinimum(){
        return categoryWeightMinimum;
    }

    public String getAthleteCurrentWeightCategory() {
        String athleteCurrentWeightCategory;
        if (athleteWeight >= 66 && athleteWeight <= 72) {
            athleteCurrentWeightCategory = "Flyweight";
        } else if (athleteWeight >= 73 && athleteWeight <= 80) {
            athleteCurrentWeightCategory = "Lightweight";
        } else if (athleteWeight >= 81 && athleteWeight <= 89) {
            athleteCurrentWeightCategory = "Light-Middleweight";
        } else if (athleteWeight >= 90 && athleteWeight <= 99) {
            athleteCurrentWeightCategory = "Middleweight";
        } else if (athleteWeight == 100) {
            athleteCurrentWeightCategory = "Light-Heavyweight";
        } else if (athleteWeight > 100) {
            athleteCurrentWeightCategory = "Heavyweight";
        } else {
            athleteCurrentWeightCategory = "Not Categorized";
        }
        return athleteCurrentWeightCategory;
    }

    public void displayWeightCategories(){
        System.out.println("Weight Categories:");
        System.out.println("1. Flyweight (66 - 72)");
        System.out.println("2. Lightweight (73 - 80)");
        System.out.println("3. Light-Middleweight (81 - 89)");
        System.out.println("4. Middleweight (90 - 99)");
        System.out.println("5. Light-Heavyweight (100)");
        System.out.println("6. Heavyweight (100+)");
    }
}
