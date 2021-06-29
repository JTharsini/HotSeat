import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainFrame extends JFrame
{
  private DataKeeper dataKeeper;
  private ConfigureFrame configureFrame = new ConfigureFrame(dataKeeper);
  private InputFrame questionVisibleFrame;

  MainFrame(DataKeeper dataKeeper)
  {
    super();
    this.dataKeeper = dataKeeper;
    questionVisibleFrame = new InputFrame(dataKeeper);
    setResizable(false);
    setLocationRelativeTo(null);
    init();
  }

  private void init()
  {
    JPanel jpanel = new JPanel();
    add(jpanel);

    JButton configure = new JButton("Configure");
    jpanel.add(configure);
    configure.setVisible(false);

    configure.addActionListener(new ActionListener()
    {
      @Override public void actionPerformed(final ActionEvent e)
      {
        questionVisibleFrame.setVisible(false);
        configureFrame.setVisible(true);
      }
    });

    JButton play = new JButton("Play");
    jpanel.add(play);
    play.addActionListener(new ActionListener()
    {
      @Override public void actionPerformed(final ActionEvent e)
      {
        configureFrame.setVisible(false);
        questionVisibleFrame.setVisible(true);
      }
    });
  }

}
