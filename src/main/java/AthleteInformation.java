/*
* AthleteInformaiton
*
* 17.0.1
*
* */

public abstract class AthleteInformation {
    public String athleteName;
    public String athleteWeightCategory;
    public String athleteTrainingPlan;
    public String athleteCurrentWeightCategory;
    public int categoryWeightLimit;
    public int categoryWeightMinimum;
    public int athleteWeight;
    public int athletePrivateCoachingHours;
    public int athleteNumberOfCompetitions;

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
        getAthleteCurrentWeightCategory();
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

    public String getAthleteCurrentWeightCategory() {
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
    public int getCategoryWeightMinimum(){
        return categoryWeightMinimum;
    }

    public int getCategoryWeightLimit(){
        return categoryWeightLimit;
    }
}
