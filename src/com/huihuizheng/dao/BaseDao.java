package com.huihuizheng.dao;

import java.util.List;

public interface BaseDao<T> {
	/**
	 * 保存实体
	 * 
	 * @param entity
	 */
	public void save(T entity);
	/**
	 * 更新实体
	 * 
	 * @param entity
	 */
	// public void update(T entity);
	public void update(String hql, Object... args);

	/**
	 * 删除实体
	 * 
	 * @param entity
	 */
	public void delete(T entity);
	/**
	 * 通过属性名和属性值去查询
	 * 
	 * @param PropertyName
	 *            要查询的属性名称
	 * @param value
	 *            该属性的值
	 * @return
	 */
	public T findByPropertyName(String propertyName, Object value);

	/**
	 * 查询该表所有信息
	 * 
	 * @return
	 */
	public List<T> findAllInfor();
}
