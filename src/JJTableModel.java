import java.util.ArrayList;
import java.util.List;

import javax.swing.table.DefaultTableModel;

public class JJTableModel extends DefaultTableModel
{
  private ArrayList<Index> indices;

  JJTableModel(String[] column, int row)
  {
    super(column, row);
    indices = new ArrayList<>();
    setColumnIdentifiers(column);
  }

  public void addRows(List<String> paramNames)
  {
    for (int i = 0; i < paramNames.size(); i++)
    {
      Index newIndex = new Index();
      newIndex.name = paramNames.get(i);
      newIndex.index = 0;
      indices.add(newIndex);
    }
  }

  @Override public void setValueAt(final Object aValue, final int rowIndex, final int columnIndex)
  {
    if (rowIndex < 0)
    {
      return;
    }
    if (columnIndex == 1)
    {
      indices.get(rowIndex).index = Integer.parseInt((String) aValue);
    }
  }

  @Override public Object getValueAt(int rowIndex, int columnIndex)
  {
    Index data = indices.get(rowIndex);
    switch (columnIndex)
    {
      case 0:
        return data.name;
      case 1:
        return data.index;
    }
    return "";
  }

  public List<Index> getIndices()
  {
    return indices;
  }
}
