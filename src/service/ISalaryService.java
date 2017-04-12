package service;

import module.Average;
import module.Salary;

import java.util.List;

/**
 * Created by she3547 on 2017-04-12.
 */
public interface ISalaryService {
    Salary GetHighestSalaryInfo(List<Salary> list);
    Salary GetLowestSalaryInfo(List<Salary> list);
    Average GetAverageOfYearSalary(List<Salary> list);

}
