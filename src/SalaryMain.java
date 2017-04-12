import module.Average;
import module.Salary;
import service.SalaryService;

import javax.swing.plaf.basic.BasicButtonUI;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by she3547 on 2017-04-12.
 */
public class SalaryMain {
    public static void main(String[] args) throws Exception{

        //read file
        BufferedReader br = new BufferedReader(new FileReader("src\\Salaries.csv"));

        String line ="";
        List<Salary> salaries = new ArrayList<>();


        br.readLine();
        while((line = br.readLine()) != null){
            String[] splitted = line.split(",");
            salaries.add(new Salary(splitted[0], splitted[1],
                    splitted[2], splitted[3], Long.parseLong(splitted[4])));
        }


        SalaryService ss = new SalaryService();
        //최대 연봉
        Salary highestSalaryInfo = ss.GetHighestSalaryInfo(salaries);
        System.out.println(highestSalaryInfo);


        //최소 연봉
        Salary lowestSalaryInfo = ss.GetLowestSalaryInfo(salaries);
        System.out.println(lowestSalaryInfo);

        //연도별 평균 연봉
        List<Average> averageOfYearSalary = ss.GetAverageOfYearSalary(salaries);
        System.out.println(averageOfYearSalary);
    }
}
