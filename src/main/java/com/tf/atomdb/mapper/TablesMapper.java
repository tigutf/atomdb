package com.tf.atomdb.mapper;

import com.tf.atomdb.domain.Columns;
import com.tf.atomdb.domain.Tables;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface TablesMapper {
    List<Tables> selectTablesBySchema(@Param("schema") String schema);

    List<Columns> selectColumnsByTableName(@Param("tableName") String tableName);
}
