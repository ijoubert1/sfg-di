package local.springframework.sfgdi.services;

public class GreetingServiceFactory {

    public GreetingService getGreetingService(String lan){
        switch (lan){
            case "ES": return new I18nSpanishGreetingService();
            case "EN": return new I18nEnglishGreetingService();
            default: return new PrimaryGreetingService();
        }
    }
}
