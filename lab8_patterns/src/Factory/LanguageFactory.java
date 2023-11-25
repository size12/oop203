package Factory;

import Factory.languages.English;
import Factory.languages.Finnish;
import Factory.languages.Language;
import Factory.languages.Russian;

public class LanguageFactory {
    public static Language getLanguage(Factory.Language lang) throws Exception {
        switch (lang) {
            case English: return new English();
            case Russian: return new Russian();
            case Finnish: return new Finnish();
            default: throw new Exception("don't have such language");
        }
    }
}
