import java.util.ArrayList;

public class CommandMark extends Command {

    public static final int NUM_OF_ARGUMENTS = 1;
    public static final String[] FLAGS = new String[]{};

    private String[] splitArguments;
    private Integer taskNum = null;


    public CommandMark(String rawArguments) {
        splitArguments = rawArguments.split(" ");
    }

    @Override
    public void checkArgumentLength() throws MissingArgumentException, ExtraArgumentException {
        if (splitArguments.length > NUM_OF_ARGUMENTS) {
            throw new ExtraArgumentException();
        }

        if (splitArguments.length < NUM_OF_ARGUMENTS) {
            throw new MissingArgumentException();
        }

    }

    @Override
    public void checkFlags() {

    }

    @Override
    public void checkArgument() throws NotIntegerException {
        try {
            taskNum = Integer.parseInt(splitArguments[0]);
        } catch (NumberFormatException e) {
            throw new NotIntegerException();
        }
    }

    public int getTaskNum() {
        return taskNum;
    }
}
