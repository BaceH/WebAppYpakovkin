package com.ypakovkin.dao;

import com.ypakovkin.datasource.DataSource;
import com.ypakovkin.model.MenuList;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

public class MenuDao {
    private DataSource dataSource;

    public static final String SELECT_MENU = "SELECT _IDRRef, _Description,_Fld5391,_Fld5393" +
            " FROM _Reference5390" +
            " where _Marked=0  and _ParentIDRRef=?" +
            "  order by _Code";

    public MenuDao(){
        dataSource = DataSource.getInstance();
    }

    public List<MenuList> getAll(int indexIdMenu, String linkMenuItem) {
        List<MenuList> result = new LinkedList<>();

        try(    Connection connection = dataSource.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(SELECT_MENU)){

            preparedStatement.setInt(1,indexIdMenu);
            ResultSet resultSet = preparedStatement.executeQuery();
            MenuList menuItem = null;
            while (resultSet.next()){
                menuItem = new MenuList();
                menuItem.setId(resultSet.getString("_IDRRef"));
                menuItem.setName(resultSet.getString("_Description"));
                String link = resultSet.getString("_Fld5391");
                menuItem.setLink("/" + link);
                menuItem.setDescription(resultSet.getString("_Fld5393"));
                if (linkMenuItem.equals("/" + link) || linkMenuItem.equals(link)){
                    menuItem.setActiv(true);
                }
                else {
                    menuItem.setActiv(false);
                }

                result.add(menuItem);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return result;
    }

}
