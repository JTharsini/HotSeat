import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class InputFrame2 extends JFrame
{
  JTextField textField = new JTextField(100);
  QuestionVisibleFrame questionVisibleFrame = new QuestionVisibleFrame();

  InputFrame2()
  {
    super();
    setLayout(new GridLayout(1, 1));
    setResizable(false);
    init();
  }

  private void init()
  {
    JPanel mainPanel = new JPanel();
    mainPanel.setLayout(new FlowLayout());
    add(mainPanel);

    JPanel inputPanel = new JPanel();
    inputPanel.setLayout(new FlowLayout());
    inputPanel.add(textField);

    JButton show = new JButton("Show question");
    inputPanel.add(show);

    mainPanel.add(inputPanel);

    show.addActionListener(new ActionListener()
    {
      @Override public void actionPerformed(final ActionEvent e)
      {
        questionVisibleFrame.showQuestion(textField.getText());
        questionVisibleFrame.setVisible(true);
      }
    });
  }
}
