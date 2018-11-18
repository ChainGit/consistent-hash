package com.chain.consistenthash.core.base;

/**
 * @Author bangquan.qian
 * @Date 2018/11/9 5:31 PM
 */

public interface SimpleBizOperation<K, V> {

    void insert();

    void batchInsert();

    void delete();

    void batchDelete();

    void queryObject();

    void queryList();

    void update();

    void batchUpdate();
}
