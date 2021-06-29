import javax.swing.JFrame;

public class Main
{
  static MainFrame mainFrame;

  public static void main(String[] args)
  {
    DataKeeper dataKeeper = new DataKeeper();
    dataKeeper.hardCode();
    mainFrame = new MainFrame(dataKeeper);
    mainFrame.setSize(350, 200);
    mainFrame.setVisible(true);
    mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}
