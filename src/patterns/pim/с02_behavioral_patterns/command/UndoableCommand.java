package patterns.pim.с02_behavioral_patterns.command;

/**
 * Created by User1 on 08.02.2016.
 */
public interface UndoableCommand extends Command {
    public void undo();
    public void redo();
}
