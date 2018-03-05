package com.ypakovkin.dao;

import com.ypakovkin.datasource.DataSource;
import com.ypakovkin.model.ItemMenu;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

public class SelectItemMenuDao {
    private DataSource dataSource;

    public static final String SELECT_MENU_ITEM = "SELECT _IDRRef, _Description,_Fld5391,_Fld5392,_Fld5393,_Fld5394,_Fld5395,_Fld5396,_Fld5397" +
            " FROM _Reference5390" +
            " where _Marked=0  and _Fld5391=?" ;

    public SelectItemMenuDao(){
        dataSource = DataSource.getInstance();
    }

    public ItemMenu getItemMenu(String itemMenuLink) {
        ItemMenu itemMenu = new ItemMenu();

        try(    Connection connection = dataSource.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(SELECT_MENU_ITEM)){

            preparedStatement.setString(1,itemMenuLink);
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()) {
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
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return itemMenu;
    }

}
