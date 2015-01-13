package com.tesco.priceintegrity.common.sql;

/**
 * Created by hb41 on 19/12/2014.
 */
public class SQLQueries {

    //SQL queries for store groups
    public static final String CREATE_QUERY_STORE_GROUP = "SELECT str_grp_name FROM episys.eps_str_grp_hdr WHERE eps_uid = ?";
    public static final String UPSERT_QUERY_STORE_GROUP = "SELECT str_grp_name FROM episys.eps_str_grp_hdr WHERE eps_uid = ?";
    public static final String UPDATE_QUERY_STORE_GROUP = "SELECT str_grp_name FROM episys.eps_str_grp_hdr WHERE eps_uid = ?";
    public static final String DELETE_QUERY_STORE_GROUP = "SELECT action FROM episys.eps_str_grp_hdr WHERE eps_uid = ?";

    //SQL queries for product hierarchy
    public static final String CREATE_QUERY_PRODUCT_HIERARCHY = "SELECT COUNT(*) AS noRows FROM episys.eps_prd_hier WHERE chld_prd_cd = (?)";
    public static final String UPDATE_QUERY_PRODUCT_HIERARCHY = "SELECT action FROM episys.eps_prd_hier WHERE chld_prd_cd IN (?)";
    public static final String DELETE_QUERY_PRODUCT_HIERARCHY = "SELECT action FROM episys.eps_prd_hier WHERE chld_prd_cd IN (?)";
    public static final String UPSERT_QUERY_PRODUCT_HIERARCHY = "SELECT action FROM episys.eps_prd_hier WHERE chld_prd_cd IN (?)";

    //SQL queries for product content
    public static String PRODUCT_CONTENT_SELECT_PRD_CD= "select prd_cd FROM EPISYS.EPS_CONTENT_DATA where prd_cd = ?";
    public static String PRODUCT_CONTENT_SELECT_NEW_VALUE= "select new_value FROM EPISYS.EPS_CONTENT_DATA where prd_cd = ?";

    //SQL queries for manage price
    public static final String MANAGE_PRICE_SELECT_PRICE = "select fld_val from episys.eps_price_dtl where prc_uid = ?";
    public static final String MANAGE_PRICE_SELECT_COUNT = "select count(*) as count from episys.eps_price_dtl where prc_uid = ?";
}
