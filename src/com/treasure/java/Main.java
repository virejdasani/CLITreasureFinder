//A program (game) made by VIREJ DASANI

package com.treasure.java;

import java.util.Scanner;

import static java.lang.System.exit;



public class Main{
    

    public static void main(String[] args) {
        //Instructions to user:
        System.out.println("~\n~\n~\nWelcome to the Command Line Treasure finder! Your goal is to find the hidden treasure of " +
                "atlantis! \n" +
                "Navigate through this realm using R to go RIGHT, D to go DOWN, L to go LEFT.\n" +
                " In this game, unlike many others, " +
                "you can't go UP because, well, Gravity, duh.  \n" +
                "Enter START to begin your adventure! \n");
        //New scanner called start to take input from user to initiate game:
        Scanner scanner = new Scanner(System.in);
        String start = scanner.nextLine().toLowerCase();

        //When game is initiated, user can go 'right' into a forest or 'down' to an ocean
        if (start.equals("start")){
            System.out.println("There is a FOREST to your right and a cliff downward " +
                    "Remember, R to go right and D to go down: \n");
            //This take the input of either R or D
            Scanner scanner1 = new Scanner(System.in);
            String zerord = scanner1.nextLine().toLowerCase();

            //If the user goes R in zerord:
            if (zerord.equals("r")){
                System.out.println("You have entered a bushy rainforest." +
                        " You can go deeper in the unpredictable rainforest by going right or you can go down\n");
                //User can enter R or D in onerd
                Scanner scanner2 = new Scanner(System.in);
                String onerd = scanner2.nextLine().toLowerCase();
                //If user goes R in onerd:
                if (onerd.equals("r")){
                    System.out.println("The forest is getting denser and more dangerous." +
                            "Dont look back, you can now, only go right!\n");

                    //User can go R or D  in twor
                    Scanner scanner3 = new Scanner(System.in);
                    String twor = scanner3.nextLine().toLowerCase();

                    //If user goes R in twor:
                    if (twor.equals("r")){
                        System.out.println("You have been decapitated by a venomous viper. RIP\n" +
                                "Your score: 3");
                        exit(3);
                    }

                }
                //If user inputs d in onerd:
                else if (onerd.equals("d")){
                    System.out.println("There is an open ocean, and you cant swim " +
                            "because my laptop isn't waterproof! However, there is a boat downwards!\n ");
                    //Taking input of D in oned to go to the boat.
                    Scanner scanner4 = new Scanner(System.in);
                    String oned = scanner4.nextLine().toLowerCase();
                    //If input is d in oned
                    if (oned.equals("d")){
                        System.out.println("You have entered the wooden boat " +
                                "and you see two Great White Sharks on the left and right, coming for you!\n" +
                                "You are surrounded, think fast!\n");
                        //input for twol
                        Scanner scanner5 = new Scanner(System.in);
                        String twolrd = scanner5.nextLine().toLowerCase();

                        //if twolrd is r or l, death:
                        if (twolrd.equals("r") || twolrd.equals("l")){
                            System.out.println("You have been deleted by the shark. RIP\n" +
                                    "your score: 4");
                            exit(4);
                        }
                        //if user goes down in twolrd:
                        else if (twolrd.equals("d")){
                            System.out.println("You just lost the sharks, great work! " +
                                    "There's a castle on the right and another forest downward. " +
                                    "Pick a route wisely.\n");

                            //Input for threerd castle and forest(2)
                            Scanner scanner6 = new Scanner(System.in);
                            String threerd = scanner6.nextLine().toLowerCase();

                            //if user goes r:
                            if (threerd.equals("r")){
                                System.out.println("You have entered the castle. " +
                                        "There are two rooms, right and down, " +
                                        "one of which leads to certain death! ");
                                //input for fourud for the 2 rooms in the castle
                                Scanner scanner7 = new Scanner(System.in);
                                String fourud = scanner7.nextLine().toLowerCase();


                                //if user goes right:
                                if (fourud.equals("r")){
                                    System.out.println("Tough luck, you have been demolished by hyenas. RIP\n" +
                                                "Your score: 7");
                                    exit(7);

                                    }
                                else if (fourud.equals("d")){
                                    System.out.println("Lucky you! This is the way out of the castle.\n" +
                                                "There is a desert on the right and the forest on the left");
                                    }
                                //input for fivelr to desert or forest.
                                Scanner scanner8 = new Scanner(System.in);
                                String fivelr = scanner8.nextLine().toLowerCase();
                                //if user goes r , they are in a desert:
                                if (fivelr.equals("r")){
                                    System.out.println("You are in a very dry desert " +
                                            "and a sandstorm is heading towards you from the right but there is  " +
                                            "a trail downwards.");
                                    Scanner scanner9 = new Scanner(System.in);
                                    String sixrd = scanner9.nextLine().toLowerCase();

                                    //if user goes r in sixrd:
                                    if (sixrd.equals("r")){
                                        System.out.println("Death by sandstorm. RIP\n" +
                                                "Your score = 7");
                                        exit(7);
                                    }
                                    //if user goes d in sixrd
                                    else if (sixrd.equals("d")){
                                        System.out.println("You follow the trail and it leads to a tunnel. " +
                                                "The sandstorm has almost caught up to you, QUICK, " +
                                                "go down into the tunnel to be safe!");
                                        Scanner scanner10 = new Scanner(System.in);
                                        String sevend = scanner10.nextLine().toLowerCase();

                                        //if user does go down:
                                        if (sevend.equals("d")){
                                            System.out.println("You are safe in the tunnel, it leads towards" +
                                                    " the left " +
                                                    "so you can only go left here.");
                                            //input for eightl
                                            Scanner scanner11 = new Scanner(System.in);
                                            String eightl = scanner11.nextLine().toLowerCase();
                                            //if user goes left:
                                            if (eightl.equals("l")){
                                                System.out.println("This is a big tunnel, keep going left!");

                                                //input for ninel
                                                Scanner scanner12 = new Scanner(System.in);
                                                String ninel = scanner12.nextLine().toLowerCase();

                                                //if user goes left here in ninel:
                                                if (ninel.equals("l")){
                                                    System.out.println("Congratulations! You found the hidden " +
                                                            "TREASURE OF ATLANTIS!");
                                                    exit(0);
                                                }
                                                //if user goes anywhere but left:
                                                else{
                                                    System.out.println("You died by bumping into the tunnel wall. RIP");
                                                    exit(2);
                                                }
                                            }
                                            //if user goes anywhere but left:
                                            else{
                                                System.out.println("You died by bumping into the tunnel wall. RIP");
                                                exit(2);
                                            }
                                        }
                                        //if user does anything but go down:
                                        else {
                                            System.out.println("You could have lived if you had typed in " +
                                                    "D instead of "+sevend);
                                        }
                                    }
                                    else{
                                        System.out.println("Can't go this way. Try again ;)");
                                        exit(404);
                                    }

                                }
                                //If user goes right, into the forest:
                                else if (fivelr.equals("l")){
                                    System.out.println("You are in a forest and there is a trail" +
                                            " leading downwards. There is a fog on the left and right sides.\n" +
                                            "Proceed with extreme caution");
                                    //input for sixldr
                                    Scanner scanner13 = new Scanner(System.in);
                                    String sixldr = scanner13.nextLine().toLowerCase();

                                    //if user goes left or right in sixldr , death:
                                    if (sixldr.equals("l")||sixldr.equals("r")){
                                        System.out.println("Death by a venomous spider. RIP" +
                                                "Your Score = 12");
                                        exit(12);
                                    }
                                    //If user goes down in sixldr
                                    else if (sixldr.equals("d")){
                                        System.out.println("Congratulations you found the hidden " +
                                                "TREASURE OF ATLANTIS!");
                                        exit(0);
                                    }
                                    else{
                                        System.out.println("Can't go this way. Try again ;)");
                                        exit(404);
                                    }


                                }
                                else{
                                    System.out.println("Can't go this way. Try again ;)");
                                    exit(404);
                                }



                            }
                            //if user goes down into the forest
                            else if (threerd.equals("d")){
                                System.out.println("You are in a forest and there is a trail" +
                                        " leading downwards. There is a fog on the left and right sides.\n" +
                                            "Proceed with extreme caution");

                                //input for eightd
                                Scanner scanner14 = new Scanner(System.in);
                                String eightd = scanner14.nextLine().toLowerCase();

                                //if user goes left or right in sixldr , death:
                                if (eightd.equals("l")||eightd.equals("r")){
                                    System.out.println("Death by a venomous spider. RIP " +
                                            "Your Score = 12");
                                    exit(12);
                                }
                                //If user goes down in sixldr
                                else if (eightd.equals("d")){
                                    System.out.println("Congratulations you found the hidden " +
                                            "TREASURE OF ATLANTIS!");
                                    exit(0);
                                }
                                else{
                                    System.out.println("Can't go this way. Try again ;)");
                                    exit(404);
                                }

                            }
                            else{
                                System.out.println("Died by drowning. RIP  " +
                                        "Your Score = 7");
                                exit(7);
                            }
                        }
                        else{
                            System.out.println("Can't go this way. Try again ;)");
                            exit(404);
                        }

                    }
                    else{
                        System.out.println("Can't go this way. Try again ;)");
                        exit(404);
                    }
                }
                else{
                    System.out.println("Can't go this way. Try again ;)");
                    exit(404);
                }
            }
            //If user selects to go down in zerord:
            else if (zerord.equals("d")){
                System.out.println("Damn, you fell off the cliff. RIP\n" +
                        "Your score: 1");
                exit(1);
            }
            else{
                System.out.println("You can only go right or down. Try again.");
                exit(404);
            }
        }
        //If instead of start, the user enters something else, this will happen:
        else {
            System.out.println("Enter start not " + start);
            exit(404);
        }


    }
}
