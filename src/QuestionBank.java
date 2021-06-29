import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class QuestionBank
{
  private Map<String, List<String>> questions = new HashMap<>();

  QuestionBank()
  {
    init();
  }

  public String getQuestion(String name)
  {
    final List<String> questionsForName = questions.get(name);
    if (questionsForName == null || questionsForName.isEmpty())
    {
      List<String> generalQuestion = questions.get("General");
      final String next = generalQuestion.iterator().next();
      generalQuestion.remove(next);
      return next;
    }
    else
    {
      final String next = questionsForName.iterator().next();
      questionsForName.remove(next);
      return next;
    }
  }

  private void init()
  {
    questions.put("General", getGeneralQuestions());
    questions.put(DataKeeper.Asela, getQuestionsForAsela());
    questions.put(DataKeeper.Amila, getQuestionsForAmila());
    questions.put(DataKeeper.Pramod, getQuestionsForPramod());
    questions.put(DataKeeper.Manjula, getQuestionsForManjula());
    questions.put(DataKeeper.Ayesha, getQuestionsForAyesha());
    questions.put(DataKeeper.Numee, getQuestionsForNumee());
    questions.put(DataKeeper.Imal, getQuestionsForImal());
    questions.put(DataKeeper.Lahiru, getQuestionsForLahiru());
    questions.put(DataKeeper.JJ, getQuestionsForJJ());
    questions.put(DataKeeper.Lasitha, getQuestionsForLasitha());
    questions.put(DataKeeper.Jinade, getQuestionsForJinadee());
    questions.put(DataKeeper.Sajith, getQuestionsForSajith());
    questions.put(DataKeeper.Nuwan, getQuestionsForNuwan());
    questions.put(DataKeeper.Thamishka, getQuestionsForThamishka());
    questions.put(DataKeeper.Dananji, getQuestionsForDananji());
    questions.put(DataKeeper.Himas, getQuestionsForHimas());
  }

  private List<String> getQuestionsForHimas()
  {
    return new ArrayList<>(Arrays.asList("Love marriage or arrange marriage? What do you prefer? Why?",
                                         "have you ever worried for being not married?"));

  }

  private List<String> getQuestionsForThamishka()
  {
    return new ArrayList<>(Arrays.asList("Love marriage or arrange marriage? What do you prefer? Why?",
                                         "have you ever worried for being not married?"));

  }

  private List<String> getQuestionsForDananji()
  {
    return new ArrayList<>(Arrays.asList("Love marriage or arrange marriage? What do you prefer? Why?",
                                         "have you ever worried for being not married?"));

  }

  private List<String> getQuestionsForNuwan()
  {
    return new ArrayList<>(Arrays.asList("Love marriage or arrange marriage? What do you prefer? Why?",
                                         "have you ever worried for being not married?"));

  }

  private List<String> getQuestionsForJinadee()
  {
    return new ArrayList<>(Arrays.asList("Love marriage or arrange marriage? What do you prefer? Why?",
                                         "have you ever worried for being not married?"));

  }

  private List<String> getQuestionsForLasitha()
  {
    return new ArrayList<>(Arrays.asList("Love marriage or arrange marriage? What do you prefer? Why?",
                                         "have you ever worried for being not married?",
                                         "What animal would you want for a pet in heaven?",
                                         "What are your pet peeves?"));

  }

  private List<String> getQuestionsForJJ()
  {
    return new ArrayList<>(Arrays.asList("Love marriage or arrange marriage? What do you prefer? Why?",
                                         "have you ever worried for being not married?"));

  }

  private List<String> getQuestionsForLahiru()
  {
    return new ArrayList<>(Arrays.asList("Love marriage or arrange marriage? What do you prefer? Why?",
                                         "have you ever worried for being not married?"));

  }

  private List<String> getQuestionsForImal()
  {
    return new ArrayList<>(Arrays.asList("Love marriage or arrange marriage? What do you prefer? Why?",
                                         "have you ever worried for being not married?"));

  }

  private List<String> getGeneralQuestions()
  {
    return new ArrayList<>(Arrays.asList("Who is your celebrity crush?", "Who is your role model?"));
  }

  private List<String> getQuestionsForSajith()
  {
    return new ArrayList<>(Arrays.asList("Love marriage or arrange marriage?",
                                         "Do you want children? If yes, how many? If no, why?",
                                         "have you ever regret to marry?"));
  }

  private List<String> getQuestionsForPramod()
  {
    return new ArrayList<>(Arrays.asList("Love marriage or arrange marriage?", "have you ever regret to marry?"));
  }

  private List<String> getQuestionsForAsela()
  {
    return new ArrayList<>(Arrays.asList("Love marriage or arrange marriage?", "have you ever regret to marry?"));
  }

  private List<String> getQuestionsForAmila()
  {
    return new ArrayList<>(Arrays.asList("Love marriage or arrange marriage?", "have you ever regret to marry?"));
  }

  private List<String> getQuestionsForManjula()
  {
    return new ArrayList<>(Arrays.asList("Love marriage or arrange marriage?", "have you ever regret to marry?"));
  }

  private List<String> getQuestionsForAyesha()
  {
    return new ArrayList<>(Arrays.asList("Love marriage or arrange marriage?", "have you ever regret to marry?"));
  }

  private List<String> getQuestionsForNumee()
  {
    return new ArrayList<>(Arrays.asList("Love marriage or arrange marriage?", "have you ever regret to marry?"));
  }
}
