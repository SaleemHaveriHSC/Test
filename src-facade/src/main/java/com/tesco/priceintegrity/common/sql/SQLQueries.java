package com.tesco.priceintegrity.common.sql;

/**
 * Created by hb41 on 19/12/2014.
 */
public class SQLQueries {

    //SQL queries for store groups
    public static final String CHECK_CREATE_STORE_GROUP = "SELECT str_grp_name FROM episys.eps_str_grp_hdr WHERE eps_uid = ?";
    public static final String CHECK_UPSERT_STORE_GROUP = "SELECT str_grp_name FROM episys.eps_str_grp_hdr WHERE eps_uid = ?";
    public static final String CHECK_UPDATE_STORE_GROUP = "SELECT str_grp_name FROM episys.eps_str_grp_hdr WHERE eps_uid = ?";
    public static final String CHECK_DELETE_STORE_GROUP = "SELECT action FROM episys.eps_str_grp_hdr WHERE eps_uid = ?";

    //SQL queries for product hierarchy
    public static final String CHECK_CREATE_PRODUCT_HIERARCHY = "SELECT COUNT(*) AS noRows FROM episys.eps_prd_hier WHERE chld_prd_cd = (?)";
    public static final String CHECK_UPDATE_PRODUCT_HIERARCHY = "SELECT action FROM episys.eps_prd_hier WHERE chld_prd_cd IN (?)";
    public static final String CHECK_DELETE_PRODUCT_HIERARCHY = "SELECT action FROM episys.eps_prd_hier WHERE chld_prd_cd IN (?)";
    public static final String CHECK_UPSERT_PRODUCT_HIERARCHY = "SELECT action FROM episys.eps_prd_hier WHERE chld_prd_cd IN (?)";

    //SQL queries for product content
    public static String CHECK_PRODUCT_CONTENT_CODE = "select prd_cd FROM EPISYS.EPS_CONTENT_DATA where prd_cd = ?";
    public static String CHECK_PRODUCT_CONTENT_VALUE = "select new_value FROM EPISYS.EPS_CONTENT_DATA where prd_cd = ?";

    //SQL queries for manage price
    public static final String CHECK_PRODUCT_PRICE = "select fld_val from episys.eps_price_dtl where prc_uid = ?";
    public static final String CHECK_PRICE_COUNT = "select count(*) as count from episys.eps_price_dtl where prc_uid = ?";
}
