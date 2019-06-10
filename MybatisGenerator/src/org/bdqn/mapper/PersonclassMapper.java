package org.bdqn.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.bdqn.entity.Personclass;
import org.bdqn.entity.PersonclassExample;

public interface PersonclassMapper {
    long countByExample(PersonclassExample example);

    int deleteByExample(PersonclassExample example);

    int deleteByPrimaryKey(Integer classid);

    int insert(Personclass record);

    int insertSelective(Personclass record);

    List<Personclass> selectByExample(PersonclassExample example);

    Personclass selectByPrimaryKey(Integer classid);

    int updateByExampleSelective(@Param("record") Personclass record, @Param("example") PersonclassExample example);

    int updateByExample(@Param("record") Personclass record, @Param("example") PersonclassExample example);

    int updateByPrimaryKeySelective(Personclass record);

    int updateByPrimaryKey(Personclass record);
}