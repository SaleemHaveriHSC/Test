package com.tesco.priceintegrity.common.sql;

/**
 * Created by hb41 on 19/12/2014.
 */
public class SQLQueries {

    public static final String CREATE_QUERY_STORE_GROUP = "select str_grp_name FROM episys.eps_str_grp_hdr where eps_uid = ?";
    public static final String UPSERT_QUERY_STORE_GROUP = "select str_grp_name FROM episys.eps_str_grp_hdr where eps_uid = ?";
    public static final String UPDATE_QUERY_STORE_GROUP = "select str_grp_name from episys.eps_str_grp_hdr where eps_uid = ?";
    public static final String DELETE_QUERY_STORE_GROUP = "select action from episys.eps_str_grp_hdr where eps_uid = ?";

}
