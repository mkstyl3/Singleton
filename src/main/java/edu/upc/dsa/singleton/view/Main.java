package edu.upc.dsa.singleton.view;

import edu.upc.dsa.singleton.controller.I18nManager;

import java.text.DateFormat;
import java.util.Locale;

/**
 * Hello world!
 *
 */
public class Main
{
    public static void main( String[] args )
    {
        System.out.println(I18nManager.getInstance().getData("how_are_you", "en"));
        System.out.println(I18nManager.getInstance().getData("how_are_you", "es"));
        System.out.println(I18nManager.getInstance().getData("how_are_you", "fr"));
    }
}
