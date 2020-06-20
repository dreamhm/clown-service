package com.hm.common.utils;

import java.util.Map;

public class PagingUtil {

    public static Integer startIndex(Map<String, Object> map){
        Integer page = Integer.valueOf(map.get("page").toString());
        Integer pageCount = Integer.valueOf(map.get("pageCount").toString());
        return (page - 1) * pageCount;
    }

    public static Integer endIndex(Map<String, Object> map, int size){
        Integer page = Integer.valueOf(map.get("page").toString());
        Integer pageCount = Integer.valueOf(map.get("pageCount").toString());
        Integer endIndex = (page - 1) * pageCount + pageCount;
        return endIndex > size ? size : endIndex;
    }

}
