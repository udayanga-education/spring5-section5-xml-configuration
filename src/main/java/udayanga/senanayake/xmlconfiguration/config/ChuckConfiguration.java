package udayanga.senanayake.xmlconfiguration.config;


import guru.springframework.norris.chuck.ChuckNorrisQuotes;

public class ChuckConfiguration {

    public ChuckNorrisQuotes chuckNorrisQuotes() {
        return new ChuckNorrisQuotes();
    }
}
