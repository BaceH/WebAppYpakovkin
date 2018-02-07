package com.ypakovkin;

import com.ypakovkin.dao.MenuDao;
import com.ypakovkin.dao.SelectItemMenuDao;
import com.ypakovkin.model.ItemMenu;
import com.ypakovkin.model.MenuItem;

import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
   private static final String URL = "jdbc:sqlserver://192.168.1.99:1433;DatabaseName=1cbase";
    private static final String USER = "sa";
    private static final String PASSWORD = "ghjnjnbg";
/*
    private final static String SQL_READ = "SELECT _IDRRef, _Description,_Fld5391,_Fld5393" +
            " FROM _Reference5390" +
            " where _Marked=0  and _ParentIDRRef=0" +
            "  order by _Code";
*/
    public static void main(String[] args) {
 /*        String requestURI = "/ypakovkin/";
        String [] url = requestURI.split("/");
        url = Arrays.copyOfRange(url, 1, url.length);

        if(url[0].equals("ypakovkin")) {

            url = Arrays.copyOfRange(url, 1, url.length);
        }
        if(url.length > 0){
            System.out.println(url[0]);
        }
        else {
            System.out.println("/");
        }
        SelectItemMenuDao menuDao = new SelectItemMenuDao();
        ItemMenu itemMenu = menuDao.getItemMenu(0, "/");
        itemMenu.forEach(System.out::println);
  */
        String SELECT_MENU_ITEM = "SELECT _IDRRef, _Description,_Fld5391,_Fld5392,_Fld5393,_Fld5394,_Fld5395,_Fld5396,_Fld5397" +
                " FROM _Reference5390" +
                " where _Marked=0  and _Fld5391='allnews'" ;
 ItemMenu itemMenu = new ItemMenu();

        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(SELECT_MENU_ITEM)){


            while (resultSet.next()) {
                itemMenu.setId(resultSet.getString("_IDRRef"));
                itemMenu.setName(resultSet.getString("_Description"));
                itemMenu.setLink("/" + resultSet.getString("_Fld5391"));
                itemMenu.setDescription(resultSet.getString("_Fld5392"));
                itemMenu.setTitle(resultSet.getString("_Fld5393"));
                itemMenu.setKeywords(resultSet.getString("_Fld5394"));
                itemMenu.setPictures(resultSet.getString("_Fld5395"));
                itemMenu.setText(resultSet.getString("_Fld5396"));
                itemMenu.setTime(resultSet.getString("_Fld5397"));
            }
            System.out.println(itemMenu.getName() + "==" + itemMenu.getText());

        } catch (SQLException e) {
            e.printStackTrace();
        }



    }

}
