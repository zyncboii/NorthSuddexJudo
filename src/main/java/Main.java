/*
 * Main
 *
 * 17.0.1
 *
 * 10-14-2024
 *
 * Kevin Jeff Ouano
 * */

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static Scanner scan = new Scanner(System.in);

    public static boolean stringInputValidate(String textToCheck) {
        if (textToCheck == null) {
            return false;
        }
        return textToCheck.matches("[a-zA-Z ]+");
    }

    public static void main(String[] args) {
        ArrayList<Athlete> athletes = new ArrayList<>();

        // Initiate Variables
        int choice;
        boolean eligibleForCompetition = false;
        boolean validInput = false;
        boolean exitApp = false;

        System.out.println("Welcome to North Suddex Judo Training Program ~");

        // Select what to do
        while (!exitApp) {
            choice = 0;
            System.out.println("What do you want to do?");
            System.out.println("1. Register new athlete.");
            System.out.println("2. Display athletes.");
            System.out.println("3. Exit");


            while (choice <= 0 || choice >= 3) {
                try {
                    System.out.print("Enter Option: ");
                    choice = scan.nextInt();
                    scan.nextLine();
                    if (choice == 1) {
                        boolean continueRegistration = true;


                        Athlete athlete = new Athlete();
                        // Input Athlete Name
                        System.out.print("Enter Athlete Name: ");
                        String name = scan.nextLine();

                        if (stringInputValidate(name)) {
                            athlete.setAthleteName(name);
                        } else {
                            System.out.println("You entered invalid characters. Please try again.");
                            continue;
                        }
                        // Input Athlete Weight
                        do {
                            try {
                                System.out.print("Enter Athlete Weight in Kilograms: ");
                                int weightInKilograms = scan.nextInt();
                                scan.nextLine();

                                if (weightInKilograms > 0) {
                                    athlete.setAthleteWeight(weightInKilograms);
                                    validInput = true;
                                } else {
                                    System.out.println("Invalid weight. Please enter a valid number greater than 0.");
                                }
                            } catch (Exception e) {
                                System.out.println("Enter numbers only !");
                                scan.next();
                            }
                        } while (!validInput);
                        validInput = false;
                        // Input Athlete Weight Category
                        do {
                            try {
                                athlete.displayWeightCategories();
                                System.out.print("Enter Athlete Weight Category: ");
                                int weightCategoryChoice = scan.nextInt();
                                scan.nextLine();

                                if (weightCategoryChoice > 0 && weightCategoryChoice < 7) {
                                    if (weightCategoryChoice == 1) {
                                        athlete.setAthleteWeightCategory("Flyweight");
                                    } else if (weightCategoryChoice == 2) {
                                        athlete.setAthleteWeightCategory("Lightweight");
                                    } else if (weightCategoryChoice == 3) {
                                        athlete.setAthleteWeightCategory("Light-Middleweight");
                                    } else if (weightCategoryChoice == 4) {
                                        athlete.setAthleteWeightCategory("Middleweight");
                                    } else if (weightCategoryChoice == 5) {
                                        athlete.setAthleteWeightCategory("Light-Heavyweight");
                                    } else {
                                        athlete.setAthleteWeightCategory("Heavyweight");
                                    }
                                    validInput = true;
                                } else {
                                    System.out.println("Invalid selection. Please select a number between 1 and 6.");
                                }
                            } catch (Exception e) {
                                System.out.println("Input numbers only from the choices!");
                                scan.next();
                            }
                        } while (!validInput);
                        validInput = false;
                        // Input Athlete Training Plan
                        do {
                            try {
                                System.out.print("Plans:\n1.Beginner\n2.Intermediate\n3.Elite\nChoose Plan: ");
                                int plan = scan.nextInt();

                                if (plan == 1) {
                                    athlete.setAthleteTrainingPlan("Beginner");
                                    validInput = true;
                                } else if (plan == 2 || plan == 3) {
                                    if (plan == 2) {
                                        athlete.setAthleteTrainingPlan("Intermediate");
                                    } else {
                                        athlete.setAthleteTrainingPlan("Elite");
                                    }
                                    eligibleForCompetition = true;
                                    validInput = true;
                                }
                            } catch (Exception e) {
                                System.out.println("Input numbers from the choices only!");
                                scan.next();
                            }
                        } while (!validInput);
                        validInput = false;
                        // Enter number of competitions if intermediate or elite
                        if (eligibleForCompetition) {
                            do {
                                try {
                                    System.out.print("Enter number of competitions (0-1): ");
                                    int competitions;
                                    competitions = scan.nextInt();
                                    scan.nextLine();

                                    if (competitions >= 0 && competitions < 2) {
                                        athlete.setAthleteNumberOfCompetitions(competitions);
                                        validInput = true;
                                    }
                                } catch (Exception e) {
                                    System.out.println("Input numbers only!");
                                    scan.next();
                                }
                            } while (!validInput);
                            validInput = false;
                        }
                        // enter hours of private coaching
                        do {
                            try {
                                System.out.print("Enter hours of private coaching per week (0-5):");
                                int hours = scan.nextInt();
                                if (hours >= 0 && hours <= 5) {
                                    athlete.setAthletePrivateCoachingHours(hours);
                                    validInput = true;
                                }
                            } catch (Exception e) {
                                System.out.println("Input numbers only!");
                                scan.next();
                            }
                        } while (!validInput);
                        validInput = false;
                        // Displays athlete information and stores it in arraylist
                        athlete.displayAthleteInfo();
                        athletes.add(athlete);
                        scan.nextLine();

                    } else if (choice == 2) {
                        if (athletes.isEmpty()) {
                            System.out.println("No athletes registered.");
                        } else {
                            System.out.println("Registered Athletes:");
                            for (Athlete athlete : athletes) {
                                athlete.displayAthleteInfo();
                            }
                        }
                    } else if (choice == 3) {
                        exitApp = true;
                        System.out.println("Exiting the application. Goodbye!");
                        break;
                    }
                } catch (Exception e) {
                    System.out.println("Please enter 1-3 only !");
                    scan.next();
                }
            }
        }
    }


}
