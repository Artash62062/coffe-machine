package Commands;

import Models.Drinks.DrinkTypes;

import java.util.Scanner;

public class CommandVerifications {

    public static String inputCommand() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("input The Command - ");
        return scanner.nextLine();
    }

    public static Command analiseCommand(String commandInOneString) {
        if(commandInOneString.length()>4) {
            return null;
        }
        if(commandInOneString.length() == 4 && commandInOneString.charAt(2)!=':') {
            return null;
        }
        if(commandInOneString.length() == 3 && commandInOneString.charAt(1)!=':') {
            return null;
        }

        String[] command = commandInOneString.split(":");
        DrinkTypes drinkType = getDrinkTypeByCommand(command[0]);
        if(command[1].length()>1 || !(Character.isDigit(command[1].charAt(0)))) {
            return null;
        }
        int sugarCount = Integer.parseInt(command[1]);
        if(drinkType == null) {
            return null;
        } else if(sugarCount < 0 || sugarCount>10) {
            return null;
        } else {
            return new Command(sugarCount,drinkType);
        }
    }

    public static DrinkTypes getDrinkTypeByCommand(String command) {
        switch (command) {
            case "T":
                return DrinkTypes.TEA;
            case "CH":
                return DrinkTypes.CHOCOLATE;
            case "C":
                return DrinkTypes.COFFEE;
            case "E":
                return DrinkTypes.EMPTY;
            default:
                return null;
        }
    }
}
