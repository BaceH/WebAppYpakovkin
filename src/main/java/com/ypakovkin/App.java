package com.ypakovkin;

import com.ypakovkin.dao.MenuDao;
import com.ypakovkin.model.MenuItem;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class App {
    private static final String URL = "jdbc:sqlserver://192.168.1.99:1433;DatabaseName=1cbase";
    private static final String USER = "sa";
    private static final String PASSWORD = "ghjnjnbg";

    private final static String SQL_READ = "SELECT _IDRRef, _Description,_Fld5391,_Fld5393" +
            " FROM _Reference5390" +
            " where _Marked=0  and _ParentIDRRef=0" +
            "  order by _Code";

    public static void main(String[] args) {

        MenuDao menuDao = new MenuDao();
        List<MenuItem> menuItemList = menuDao.getAll(0);
        menuItemList.forEach(System.out::println);

/*        List<ItemsMenu> itemsMenuList = new ArrayList<>();
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(SQL_READ)){

            while (resultSet.next()){
                ItemsMenu item = new ItemsMenu();

                item.setId(resultSet.getString("_IDRRef"));
                item.setName(resultSet.getString("_Description"));
                item.setLink(resultSet.getString("_Fld5391"));

                System.out.println(item.getId());

                itemsMenuList.add(item);
            }
            itemsMenuList.forEach(System.out::println);

        } catch (SQLException e) {
            e.printStackTrace();
        }
        */
    }

}
