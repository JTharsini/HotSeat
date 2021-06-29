import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class InputFrame extends JFrame
{
  DataKeeper dataKeeper;
  JTextField textField = new JTextField(5);
  QuestionVisibleFrame questionVisibleFrame = new QuestionVisibleFrame();

  InputFrame(DataKeeper dataKeeper)
  {
    super();
    this.dataKeeper = dataKeeper;
    setLayout(new GridLayout(1, 1));
    setSize(300, 300);
    setLocationRelativeTo(null);
    setResizable(false);
    init();
  }

  private void init()
  {
    JPanel mainPanel = new JPanel();
    mainPanel.setLayout(new GridBagLayout());
    add(mainPanel);

    JPanel inputPanel = new JPanel();
    inputPanel.setLayout(new FlowLayout());
    inputPanel.add(textField);

    JButton show = new JButton("Show a question");
    inputPanel.add(show);

    GridBagConstraints gbcFiller = new GridBagConstraints();
    gbcFiller.weightx = 1.0;
    gbcFiller.weighty = 1.0;
    gbcFiller.gridwidth = 1;
    gbcFiller.gridheight = 1;
    gbcFiller.gridx = 0;
    gbcFiller.gridy = 0;
    gbcFiller.fill = GridBagConstraints.HORIZONTAL;
    gbcFiller.anchor = GridBagConstraints.NORTH;
    mainPanel.add(inputPanel, gbcFiller);

    show.addActionListener(new ActionListener()
    {
      @Override public void actionPerformed(final ActionEvent e)
      {
        questionVisibleFrame.showQuestion(dataKeeper.getQuestion(Integer.parseInt(textField.getText())));
        questionVisibleFrame.setVisible(true);
      }
    });
  }
}
