package org.bdqn.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.bdqn.entity.Personcard;
import org.bdqn.entity.PersoncardExample;

public interface PersoncardMapper {
    long countByExample(PersoncardExample example);

    int deleteByExample(PersoncardExample example);

    int deleteByPrimaryKey(Integer cardid);

    int insert(Personcard record);

    int insertSelective(Personcard record);

    List<Personcard> selectByExample(PersoncardExample example);

    Personcard selectByPrimaryKey(Integer cardid);

    int updateByExampleSelective(@Param("record") Personcard record, @Param("example") PersoncardExample example);

    int updateByExample(@Param("record") Personcard record, @Param("example") PersoncardExample example);

    int updateByPrimaryKeySelective(Personcard record);

    int updateByPrimaryKey(Personcard record);
}