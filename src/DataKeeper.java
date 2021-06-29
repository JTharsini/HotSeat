import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataKeeper
{
  private Map<Integer, String> idNameMap;
  private QuestionBank questionBank;

  public final static String Asela = "Asela";
  public final static String Amila = "Amila";
  public final static String Pramod = "Pramod";
  public final static String Manjula = "Manjula";
  public final static String Ayesha = "Ayesha";
  public final static String Numee = "Numee";
  public final static String Imal = "Imal";
  public final static String Lahiru = "Lahiru";
  public final static String JJ = "JJ";
  public final static String Lasitha = "Lasitha";
  public final static String Jinade = "Jinade";
  public final static String Sajith = "Sajith";
  public final static String Nuwan = "Nuwan";
  public final static String Thamishka = "Thamishka";
  public final static String Dananji = "Dananji";
  public final static String Himas = "Himas";

  static List<String> names = new ArrayList<>(Arrays.asList(Asela,
                                                            Amila,
                                                            Pramod,
                                                            Manjula,
                                                            Ayesha,
                                                            Numee,
                                                            Imal,
                                                            Lahiru,
                                                            JJ,
                                                            Lasitha,
                                                            Jinade,
                                                            Sajith,
                                                            Nuwan,
                                                            Thamishka,
                                                            Dananji,
                                                            Himas));

  DataKeeper()
  {
    this.idNameMap = new HashMap<>();
    questionBank = new QuestionBank();
  }

  public void setIdName(List<Index> idName)
  {
    for (int i = 0; i < idName.size(); i++)
    {
      idNameMap.put(idName.get(i).index, idName.get(i).name);
    }
  }

  public void print()
  {
    for (Map.Entry<Integer, String> entry : idNameMap.entrySet())
    {
      System.out.println(entry.getKey() + "/" + entry.getValue());
    }
  }

  public String getQuestion(int index)
  {
    return questionBank.getQuestion(idNameMap.get(index));
  }

  public void hardCode()
  {
    idNameMap.put(1, Asela);
    idNameMap.put(2, Amila);
    idNameMap.put(3, Pramod);
    idNameMap.put(4, Manjula);
    idNameMap.put(5, Ayesha);
    idNameMap.put(6, Numee);
    idNameMap.put(7, Imal);
    idNameMap.put(8, Lahiru);
    idNameMap.put(9, JJ);
    idNameMap.put(10, Lasitha);
    idNameMap.put(11, Jinade);
    idNameMap.put(12, Sajith);
    idNameMap.put(13, Nuwan);
    idNameMap.put(14, Thamishka);
    idNameMap.put(15, Himas);
    idNameMap.put(16, Dananji);
  }
}
