import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableCellRenderer;

public class ConfigureFrame extends JFrame
{
  private JTable jjTable = new JTable();
  private JJTableModel tableModel;
  private static int ROW_COUNT;
  private List<JTextField> textFields;

  private String[] columns = new String[] { "name", "id" };
  DataKeeper dataKeeper;

  ConfigureFrame(DataKeeper dataKeeper)
  {
    super();
    this.dataKeeper = dataKeeper;
    ROW_COUNT = dataKeeper.names.size();
    this.textFields = new ArrayList<>(ROW_COUNT);
    setLayout(new GridLayout(1, 1));
    setResizable(false);
    setLocationRelativeTo(null);
    setSize(500, 700);
    initData();
    init();
  }

  private void initData()
  {
    tableModel = new JJTableModel(columns, dataKeeper.names.size());
    jjTable.setModel(tableModel);
    tableModel.addRows(dataKeeper.names);
    jjTable.setDefaultRenderer(Object.class, new JJTableCellRenderer());
  }

  private void init()
  {
    JPanel mainPanel = new JPanel();
    mainPanel.setLayout(new FlowLayout());
    add(mainPanel);

    JPanel tablePanel = new JPanel();
    tablePanel.setLayout(new GridLayout(1, 1));

    JScrollPane sp = new JScrollPane(jjTable);
    jjTable.setBounds(30, 40, 200, 300);
    tablePanel.add(sp);
    mainPanel.add(tablePanel);

    JButton configure = new JButton("Configure values");
    mainPanel.add(configure);

    configure.addActionListener(new ActionListener()
    {
      @Override public void actionPerformed(final ActionEvent e)
      {
        dataKeeper.setIdName(tableModel.getIndices());
        dataKeeper.print();
      }
    });
  }

  class JJTableCellRenderer extends DefaultTableCellRenderer
  {
    JJTableCellRenderer()
    {
      for (int i = 0; i < ROW_COUNT; i++)
      {
        textFields.add(new JTextField());
      }
    }

    public Component getTableCellRendererComponent(JTable table,
                                                   Object value,
                                                   boolean isSelected,
                                                   boolean hasFocus,
                                                   int row,
                                                   int column)
    {
      if (column == 0)
      {
        JLabel jLabel = new JLabel();
        jLabel.setText((String) value);
        return jLabel;
      }
      else
      {
        textFields.get(row).setText(value + "");
        return textFields.get(row);
      }
    }
  }
}
