package io.github.stackunderflow111;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface StudentMapper {
  StudentMapper INSTANCE = Mappers.getMapper( StudentMapper.class );
  StudentEvent studentEventFrom(Student student);
}
