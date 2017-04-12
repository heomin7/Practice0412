package service;

import module.Average;
import module.Salary;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by she3547 on 2017-04-12.
 */
public class SalaryService {

    public Salary GetHighestSalaryInfo(List<Salary> list){

        Salary HighestSalaryInfo = new Salary();
        for(Salary e: list){
            if(e.getSalary() > HighestSalaryInfo.getSalary()){
                HighestSalaryInfo = e;
            }
        }
        return HighestSalaryInfo;
    }

    public  Salary GetLowestSalaryInfo(List<Salary> list){

        Salary LowestSalaryInfo = list.get(0);
        for(Salary e: list){
            if(e.getSalary() < LowestSalaryInfo.getSalary()){
                LowestSalaryInfo = e;
            }
        }

        return LowestSalaryInfo;
    }

    public List<Average> GetAverageOfYearSalary(List<Salary> list){
        int sum = 0;
        int count  = 0;

        String oldYear = list.get(0).getYearId();

        List<Average> averageOfYearSalary = new ArrayList<>();
        for (Salary e: list){
            if(!e.getYearId().equals(oldYear)){
                averageOfYearSalary.add(new Average(oldYear, sum/count));
                oldYear = e.getYearId();
                sum = 0; count = 0;
            }
            sum += e.getSalary();
            count++;
        }

        return averageOfYearSalary;
    }
}
