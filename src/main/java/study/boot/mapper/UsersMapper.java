package study.boot.mapper;

import org.apache.ibatis.annotations.Mapper;
import study.boot.vo.UsersVO;

import java.util.List;

@Mapper
public interface UsersMapper {
    List<UsersVO> findAll();
}
