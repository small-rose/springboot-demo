package cn.xiaocai.demo.redis.web.service;

import cn.xiaocai.demo.redis.web.entity.Employee;
import cn.xiaocai.demo.redis.web.mapper.EmployeeMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2021/5/1 15:00
 * @version: v1.0
 */
@Component
@Slf4j
public class EmployeeService {


    @Resource
    private EmployeeMapper employeeMapper;

    /**
     *  缓存
     * @param id
     * @return
     */
    @Cacheable(cacheNames = { "emp" })
    public Employee getEmpById(Integer id){
        Employee employee = employeeMapper.getEmpById(id);
        return employee;
    }

    @CachePut(value="emp",key="#emp.id")
    public boolean updateEmp(Employee employee){
        boolean bool = employeeMapper.updateEmp(employee);
        return bool;
    }

    @CacheEvict(value="emp", key="#id")
    public boolean deleteUser(Integer id){
        // code
        return true;
    }

    public boolean addEmployee(Employee employee) {
        boolean bool = employeeMapper.insertEmployee(employee);
        return bool;
    }
    @Cacheable(cacheNames = { "empList" })
    public List<Employee> getEmpList(Employee employee) {
        return employeeMapper.getEmpList(employee);
    }
}
