import com.SpringbootTest;
import com.dao.EmployeeDao;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.model.DataProperties;
import com.model.Employee;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

//支持springboot单元测试，初始化spring
@RunWith(SpringRunner.class)
//因为有两个启动类，所以需要指定一个(SpringbootTest2或者SpringbootTest都可以)
@SpringBootTest(classes = SpringbootTest.class)
public class TestSpringboot {

    //获取了所有的com包下的扫描的对象
    @Autowired
    ApplicationContext ac;

    @Autowired
    EmployeeDao employeeDao;

    @Autowired
    DataProperties data;


    @Test
    public void Test3(){
        //System.out.println(data);
        System.out.println(ac.getBean("myRealm"));
    }

    @Test
    public void Test1(){
        System.out.println("*******test1");
        System.out.println(ac);
    }

    @Test
    public void Test2(){
        PageHelper.startPage(1,5);
        List<Employee> employees = employeeDao.findAll();
        PageInfo<Employee> pageInfo = new PageInfo<>(employees);
        for (Employee e:pageInfo.getList()) {
            System.out.println(e);
        }
    }
}
