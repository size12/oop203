package Factory;

import Factory.languages.Language;
import Singleton.Server;

public class Main {
    public static void main(String[] args) throws Exception {
        Language lang1 = LanguageFactory.getLanguage(Factory.Language.Russian);
        lang1.speak();

        Language lang2 = LanguageFactory.getLanguage(Factory.Language.English);
        lang2.speak();

        Language lang3 = LanguageFactory.getLanguage(Factory.Language.Finnish);
        lang3.speak();
    }
}
