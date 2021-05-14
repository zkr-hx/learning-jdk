package he.learning.jdk.demo.java.design.adapter3;

import javax.swing.table.AbstractTableModel;

/**
 * @author 朱科睿
 */
public class RocketTableModel extends AbstractTableModel {

    protected Rocket[] rockets;
    protected String[] columnNames = new String[]{"Name", "Price", "Apogee"};

    @Override
    public int getRowCount() {
        return rockets.length;
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return getValueAt(rockets[rowIndex], columnNames[columnIndex]);
    }

    private Object getValueAt(Rocket rocket, String columnName) {
        switch (columnName) {
            case "Name":
                return rocket.getName();
            case "Price":
                return rocket.getPrice();
            case "Apogee":
                return rocket.getApogee();
            default:
                throw new IllegalStateException("Unexpected value: " + columnName);
        }
    }

}
