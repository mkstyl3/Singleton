package edu.upc.dsa.singleton.controller;

import java.util.HashMap;
import java.util.ResourceBundle;


/**
 * Created by $uperuser on 15/03/2017.
 */
public class I18nManager {
    private static I18nManager instance = null;
    private static HashMap<String, ResourceBundle> rbh;
    private static final String RESOURCES="edu.dsa.singleton.i18n.";

    private I18nManager () {
        rbh = new HashMap<String, ResourceBundle>();
        ResourceBundle messages = ResourceBundle.getBundle(RESOURCES+"message_en");

        rbh.put("en", messages);
        ResourceBundle messages2 = ResourceBundle.getBundle(RESOURCES+"message_es");
        rbh.put("es", messages2);
        ResourceBundle messages3 = ResourceBundle.getBundle(RESOURCES+"message_fr");
        rbh.put("fr", messages3);
    }
    public String getData (String key, String language) {
        return rbh.get(language).getString(key);

    }
    public static I18nManager getInstance() {
        if (instance == null) instance = new I18nManager();
        return instance;
    }

}
