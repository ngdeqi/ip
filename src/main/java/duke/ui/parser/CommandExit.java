package duke.ui.parser;
import duke.exception.DukeNotIntegerException;

import java.util.ArrayList;

public class CommandExit extends Command {

    private static final int NUM_OF_ARGUMENTS = 0;
    private static final ArrayList<String> FLAGS = new ArrayList<>();

    /**
     * Constructor
     * @param rawArguments Portion of the raw user input that contains the raw arguments
     */
    public CommandExit(String rawArguments) {
        super.rawArguments = rawArguments;
        super.splitArguments = splitArguments(rawArguments);
        super.minArguments = NUM_OF_ARGUMENTS;
        super.maxArguments = NUM_OF_ARGUMENTS;
        super.flags = FLAGS;
        super.commandType = CommandType.EXIT;

    }

    @Override
    public void checkArgumentType() throws DukeNotIntegerException {
    }

    @Override
    protected void parse() {
    }


}



