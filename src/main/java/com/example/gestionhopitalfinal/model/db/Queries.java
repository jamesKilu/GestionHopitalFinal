package com.example.gestionhopitalfinal.model.db;

import java.util.ArrayList;

public class Queries {
    private static String query;

    public static String getAllFrom(String table){
        query = "select * from "+table+"";
        return query;
    }

    public static String getAllFrom(String table, String attributeCompare, String attributeValue){
        query = "select * from "+ table+ " where "+attributeCompare+" = '"+attributeValue+"'";
        return query;
    }

    public static String getAttribute(String attribut, String table){
        query = "select "+attribut+" from "+ table+"";
        return query;
    }

    public static String getAttribute(String attribut, String table, String attributeCompare, String attributeValue){
        query = "select "+attribut+" from "+ table+ " where "+attributeCompare+" = '"+attributeValue+"'";
        return query;
    }

    public static String insertInto(String table, ArrayList<String> attributes, ArrayList<String> values){
        String tempQuery = ("INSERT INTO "+table+" "+ attributes + " VALUES " + values).replace("[", "(");
        query = tempQuery.replace("]", ")");
        return query;
    }

    public static String getSumOf(String attribute, String table){
        query = "SELECT SUM("+attribute+") FROM "+table+"";
        return query;
    }

    //Create query that will take both attribute and classe
}
