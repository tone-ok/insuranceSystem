/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.insurance.dal.ibatis;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.born.insurance.dal.daointerface.MessageTemplateDAO;


// auto generated imports
import com.born.insurance.dal.dataobject.MessageTemplateDO;
import org.springframework.dao.DataAccessException;
import java.util.Date;
import java.util.List;
import java.util.Map;
	import java.util.HashMap;
	
/**
 * An ibatis based implementation of dao interface <tt>com.born.insurance.dal.daointerface.MessageTemplateDAO</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/message_template.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */ 
@SuppressWarnings({ "unchecked", "rawtypes" })

public class IbatisMessageTemplateDAO extends SqlMapClientDaoSupport implements MessageTemplateDAO {
	/**
	 *  Insert one <tt>MessageTemplateDO</tt> object to DB table <tt>message_template</tt>, return primary key
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>insert into message_template(id,notify_name,notify_type,end_day,notify_content,creator_id,creator_name,type,raw_add_time) values (?, ?, ?, ?, ?, ?, ?, ?, ?)</tt>
	 *
	 *	@param messageTemplate
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long insert(MessageTemplateDO messageTemplate) throws DataAccessException {
    	if (messageTemplate == null) {
    		throw new IllegalArgumentException("Can't insert a null data object into db.");
    	}
    	
        getSqlMapClientTemplate().insert("MS-MESSAGE-TEMPLATE-INSERT", messageTemplate);

        return messageTemplate.getId();
    }

	/**
	 *  Update DB table <tt>message_template</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update message_template set notify_name=?, notify_type=?, end_day=?, notify_content=?, creator_id=?, creator_name=?, type=? where (id = ?)</tt>
	 *
	 *	@param messageTemplate
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int update(MessageTemplateDO messageTemplate) throws DataAccessException {
    	if (messageTemplate == null) {
    		throw new IllegalArgumentException("Can't update by a null data object.");
    	}


        return getSqlMapClientTemplate().update("MS-MESSAGE-TEMPLATE-UPDATE", messageTemplate);
    }

	/**
	 *  Query DB table <tt>message_template</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select id, notify_name, notify_type, end_day, notify_content, creator_id, creator_name, type, raw_add_time, raw_update_time from message_template where (id = ?)</tt>
	 *
	 *	@param id
	 *	@return MessageTemplateDO
	 *	@throws DataAccessException
	 */	 
    public MessageTemplateDO findById(long id) throws DataAccessException {
        Long param = new Long(id);

        return (MessageTemplateDO) getSqlMapClientTemplate().queryForObject("MS-MESSAGE-TEMPLATE-FIND-BY-ID", param);

    }

	/**
	 *  Delete records from DB table <tt>message_template</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from message_template where (id = ?)</tt>
	 *
	 *	@param id
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteById(long id) throws DataAccessException {
        Long param = new Long(id);

        return getSqlMapClientTemplate().delete("MS-MESSAGE-TEMPLATE-DELETE-BY-ID", param);
    }

	/**
	 *  Query DB table <tt>message_template</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select id, notify_name, notify_type, end_day, notify_content, creator_id, creator_name, type, raw_add_time, raw_update_time from message_template where (1 = 1)</tt>
	 *
	 *	@param messageTemplate
	 *	@param sortCol
	 *	@param sortOrder
	 *	@param limitStart
	 *	@param pageSize
	 *	@param startTime
	 *	@param endTime
	 *	@return List<MessageTemplateDO>
	 *	@throws DataAccessException
	 */	 
    public List<MessageTemplateDO> findByCondition(MessageTemplateDO messageTemplate, String sortCol, String sortOrder, long limitStart, long pageSize, Date startTime, Date endTime) throws DataAccessException {
    	if (messageTemplate == null) {
    		throw new IllegalArgumentException("Can't select by a null data object.");
    	}

        Map param = new HashMap();

        param.put("messageTemplate", messageTemplate);
        param.put("sortCol", sortCol);
        param.put("sortOrder", sortOrder);
        param.put("limitStart", new Long(limitStart));
        param.put("pageSize", new Long(pageSize));
        param.put("startTime", startTime);
        param.put("endTime", endTime);

        return getSqlMapClientTemplate().queryForList("MS-MESSAGE-TEMPLATE-FIND-BY-CONDITION", param);

    }

	/**
	 *  Query DB table <tt>message_template</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select COUNT(*) from message_template where (1 = 1)</tt>
	 *
	 *	@param messageTemplate
	 *	@param startTime
	 *	@param endTime
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long findByConditionCount(MessageTemplateDO messageTemplate, Date startTime, Date endTime) throws DataAccessException {
    	if (messageTemplate == null) {
    		throw new IllegalArgumentException("Can't select by a null data object.");
    	}

        Map param = new HashMap();

        param.put("messageTemplate", messageTemplate);
        param.put("startTime", startTime);
        param.put("endTime", endTime);

	    Long retObj = (Long) getSqlMapClientTemplate().queryForObject("MS-MESSAGE-TEMPLATE-FIND-BY-CONDITION-COUNT", param);

		if (retObj == null) {
		    return 0;
		} else {
		    return retObj.longValue();
		}

    }

}