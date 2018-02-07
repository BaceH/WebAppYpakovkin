package com.ypakovkin.service;


import java.util.Arrays;

public class SelectedMenuItem {

    public static String menuItem(String requestURI){
        String [] url = requestURI.split("/");
        url = Arrays.copyOfRange(url, 1, url.length);
       if(url[0].equals("ypakovkin")) {
            url = Arrays.copyOfRange(url, 1, url.length);
        }
     if(url.length > 0 && !url[0].equals("")){
            return url[0];
        }

        return "/";
    }

}
