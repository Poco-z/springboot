package com.aixn.springboot.dao;

import com.aixn.springboot.dataobject.ItemStockDo;
import org.apache.ibatis.annotations.Param;

public interface ItemStockDoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item_stock
     *
     * @mbg.generated Thu Dec 13 20:10:11 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item_stock
     *
     * @mbg.generated Thu Dec 13 20:10:11 CST 2018
     */
    int insert(ItemStockDo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item_stock
     *
     * @mbg.generated Thu Dec 13 20:10:11 CST 2018
     */
    int insertSelective(ItemStockDo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item_stock
     *
     * @mbg.generated Thu Dec 13 20:10:11 CST 2018
     */
    ItemStockDo selectByPrimaryKey(Integer id);

    ItemStockDo selectByItemId(Integer itemId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item_stock
     *
     * @mbg.generated Thu Dec 13 20:10:11 CST 2018
     */
    int updateByPrimaryKeySelective(ItemStockDo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item_stock
     *
     * @mbg.generated Thu Dec 13 20:10:11 CST 2018
     */
    int updateByPrimaryKey(ItemStockDo record);


    int decreaseStock(@Param("itemId") Integer itemId, @Param("amount") Integer amount);

}