import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;

// This class renders a JProgressBar in a table cell.
class ProgressRenderer extends JProgressBar implements TableCellRenderer {

    //Constructor
    public ProgressRenderer(int min,int max) {
        super(min,max);
    }

    /* Returns this JProgressBar as the renderer for the given table cell. */
    public Component getTableCellRendererComponent(JTable table, Object value,boolean isSelected, boolean hasFocus, int row, int column) {
        setValue((int) ((Float) value).floatValue());
        return this;
    }
}