package cn.xiaocai.demo.redis.web.controller;

import cn.xiaocai.demo.redis.web.entity.Employee;
import cn.xiaocai.demo.redis.web.service.EmployeeService;
import io.swagger.annotations.*;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2021/5/1 15:09
 * @version: v1.0
 */
@RestController
@Slf4j
@AllArgsConstructor
@Api
public class EmployeeController {

    private final EmployeeService employeeService ;

    @ApiOperation("查询某个员工详细")
    @GetMapping("/emp/{id}")
    public Employee getEmployee(@PathVariable("id") Integer id) {
        Employee emp = employeeService.getEmpById(id);
        return emp;
    }

    @ApiOperation("更新员工信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "员工编号", defaultValue = "1", required = true),
            @ApiImplicitParam(name = "lastName", value = "员工名称", defaultValue = "jack", required = true),
            @ApiImplicitParam(name = "email", value = "员工邮箱", defaultValue = "aa@qq.com", required = true),
            @ApiImplicitParam(name = "gender", value = "员工性别", defaultValue = "1", required = true)
    })
    @PostMapping("/emp/update")
    public boolean update(Employee employee) {
        boolean bool = employeeService.updateEmp(employee);
        return bool;
    }


    @ApiOperation("添加员工信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "lastName", value = "员工名称", defaultValue = "jack", required = true),
            @ApiImplicitParam(name = "email", value = "员工邮箱", defaultValue = "aa@qq.com", required = true),
            @ApiImplicitParam(name = "gender", value = "员工性别", defaultValue = "1", required = true)
    })


    @PostMapping("/emp/add")
    public boolean addEmployee(Employee employee) {
        boolean bool = employeeService.addEmployee(employee);
        return bool;
    }

    @ApiOperation("查询员工列表")
    @GetMapping("/emp/list")
    public List<Employee> listEmployee(Employee employee) {
        List<Employee> bool = employeeService.getEmpList(employee);
        return bool;
    }
}
