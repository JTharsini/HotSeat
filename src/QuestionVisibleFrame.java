import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class QuestionVisibleFrame extends JFrame
{
  JTextArea jTextArea = new JTextArea(3, 21);

  QuestionVisibleFrame()
  {
    super();
    jTextArea.setLineWrap(true);
    jTextArea.setWrapStyleWord(true);
    jTextArea.setEditable(false);
    jTextArea.setFont(new Font(jTextArea.getFont().getName(), Font.BOLD, 100));
    setLayout(new GridLayout(1, 1));
    setSize(1900, 1000);
    setLocationRelativeTo(null);
    setResizable(false);
    init();
  }

  public void showQuestion(String question)
  {
    jTextArea.setText(question);
  }

  private void init()
  {
    JPanel mainPanel = new JPanel();
    mainPanel.setLayout(new GridBagLayout());
    add(mainPanel);

    JPanel questionPanel = new JPanel();
    questionPanel.setLayout(new FlowLayout());
    questionPanel.add(jTextArea);
    jTextArea.setBackground(Color.lightGray);
    mainPanel.setBackground(Color.pink);

    GridBagConstraints gbcFiller2 = new GridBagConstraints();
    gbcFiller2.weightx = 1.0;
    gbcFiller2.weighty = 1.0;
    gbcFiller2.gridwidth = 1;
    gbcFiller2.gridheight = 1;
    gbcFiller2.gridx = 0;
    gbcFiller2.gridy = 1;
    gbcFiller2.fill = GridBagConstraints.HORIZONTAL;
    gbcFiller2.anchor = GridBagConstraints.CENTER;
    mainPanel.add(questionPanel, gbcFiller2);
  }
}
