package Commands;

public class CommandController {
    private Command command;
    public static final CommandController commandController = new CommandController();

    private CommandController() {

    }

    public Command getCommand() {
        return command;
    }

    public void setCommand() {
        boolean isCommandInValid = true;
        while (isCommandInValid) {
            String stringCommand = CommandVerifications.inputCommand();
            this.command = CommandVerifications.analiseCommand(stringCommand);
            if (this.command == null) {
                System.out.println("Unknown Command");
                continue;
            }
            isCommandInValid = false;
        }
    }
}
