package cn.xiaocai.demo.redis.web.mapper;

import cn.xiaocai.demo.redis.web.entity.Employee;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface EmployeeMapper {

    @Select("select * from employee where id = #{id}")
    public Employee getEmpById(Integer id);

    @Update("update employee set lastName=#{lastName}, email=#{email}, gender=#{gender}  where id=#{id} ")
    public boolean updateEmp(@Param("employee") Employee employee);

    @Delete("delete from employee where id=#{id}")
    public boolean deleteEmp(Integer id);

    @Insert("insert into employee(lastName,email,gender) values (#{lastName},#{email},#{gender})")
    public boolean insertEmployee(Employee employee);

    @Select("select * from employee ")
    public List<Employee> getEmpList(Employee employee);
}
