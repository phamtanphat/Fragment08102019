package com.example.fragment08102019;

public class Person {
    String language;

    public String getLanguage(ListPerson listPerson){
        switch (listPerson){
            case VIETNAM:
                language = new Vietnamese().getLanguageVietNam();
            case AMERICAN:
                language = new American().getLanguageEnglish();
        }
        return  language;
    }

}
