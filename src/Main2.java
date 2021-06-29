import javax.swing.JFrame;

public class Main2
{
  static InputFrame2 inputFrame2;

  public static void main(String[] args)
  {
    inputFrame2 = new InputFrame2();
    inputFrame2.setSize(1250, 300);
    inputFrame2.setVisible(true);
    inputFrame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}
