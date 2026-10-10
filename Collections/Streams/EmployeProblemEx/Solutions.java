package Collections.Streams.EmployeProblemEx;

import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class Solutions {
    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<Employee>();
        DataSetEmployee ds = new DataSetEmployee(employeeList);
        ds.setData();

        /* Exercise */
        // System.out.println("Id : Name : Sex : Department : Age : Salary");
        // for (Employee employee : employeeList) {
        // System.out.println(employee.id +" : "+
        // employee.name+" : "+
        // employee.gender+" : "+
        // employee.department+" : "+" : "+
        // employee.age+" : "+employee.salary);
        // }

        /*
         * Q1:How many male and female employees are there in the organization?
         */
        Map<String, Long> count = employeeList.stream()
                .collect(Collectors.groupingBy(x -> x.getGender(), Collectors.counting()));

        System.out.println("Male Count : " + count.get("Male") + "\nFemale Count : " + count.get("Female"));

        /*
         * Q2: Print the name of all departments in the organization?
         */
        List<String> department = employeeList.stream()
                .map(x -> x.getDepartment())
                .distinct()
                .toList();
        System.out.println("List of unique Department : " + department);

        /*
         * Q3: What is the average age of male and female employees?
         */

        Map<String, Double> avg = employeeList.stream()
                .collect(Collectors.groupingBy(
                        Employee::getGender, Collectors.averagingInt(Employee::getAge)));
        System.out.println(avg);

        /*
         * Q4:Get the details of highest paid employee in the organization?
         */
        Optional<Employee> highestPay = employeeList.stream()
                .max(Comparator.comparing(Employee::getSalary));
        System.out.println(highestPay.get());

        /*
         * Q5: Get the names of all employees who have joined after 2015?
         */
        List<String> emp = employeeList.stream()
                .filter(x -> x.yearOfJoining > 2015)
                .map(Employee::getName)
                .toList();
        System.out.println(emp);

        /*
         * Q6: Count the number of employees in each department?
         */

        Map<String, Long> depEmp = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
        System.out.println("No of Employee in Each Dep : " + depEmp);

        /*
         * Q7: What is the average salary of each department?
         */

        Map<String, Double> avgSalDep = employeeList.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.averagingDouble(Employee::getSalary)));
        System.out.println("Avarage salary in each Dempartment : \n" + avgSalDep);

        /*
         * Q8: Get the details of youngest male employee in the product development
         * department?
         */
        Optional<Employee> yountestMaleEmployee = employeeList.stream()
                .filter(x -> x.getGender() == "Male"
                        && x.getDepartment().equalsIgnoreCase("product development"))
                .min(Comparator.comparing(Employee::getAge));
        System.out.println("Youngest Male Employee : \n" + yountestMaleEmployee.get());

        /*
         * Q9: Who has the most working experience in the organization?
         * Also we can use .sorted() and .findFirst()
         */
        Optional<Employee> mostExp = employeeList.stream()
                .min(Comparator.comparing(Employee::getYearOfJoining));
        System.out.println("Most Experienced Employee : \n" + mostExp.get());

        /*
         * Q10: How many male and female employees are there in the sales and marketing
         * team?
         * This query is same as query 3.1, but here use filter()
         * method to filter sales and marketing employees.
         */
        Map<String, Long> memCountSM = employeeList.stream()
                .filter(x -> x.getDepartment().equalsIgnoreCase("sales and marketing"))
                .collect(Collectors
                        .groupingBy(Employee::getGender, Collectors.counting()));
        System.out.println("Male, Female in Sales and Marketing Department : \n" + memCountSM);

        /*
         * Q11: What is the average salary of male and female employees?
         * 
         */
        Map<String, Double> avgSal = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary)));
                    System.out.println("Average Salary of Male and Female Employee : \n"+avgSal);

        /*
        Q12: List down the names of all employees in each department?
        For this query, we will be using Collectors.groupingBy() 
        method by passing Employee::getDepartment as an argument.
        */
//   Need to Review once more GroupingBy Consepts
        Map<String, String> empDepMap = employeeList
                                        .stream()
                                        .collect(Collectors
                                            .toMap(Employee::getName, Employee::getDepartment));
                        System.out.println("Employee Name with Department : \n"+empDepMap);

        /*
        Q13: What is the average salary and total salary of the whole organization?
        For this query, we use Collectors.summarizingDouble()
         on Employee::getSalary which will return statistics of the 
         employee salary like max, min, average and total.
        */
             
         DoubleSummaryStatistics Summ =  employeeList.stream()
                        .collect(Collectors.summarizingDouble(Employee::getSalary));
                        System.out.println("Average Salary of All Employee : "+Summ.getAverage());
                        System.out.println("Total Salary of All Employee : "+Summ.getSum());
                        
                                                

        /*
        Q14: Separate the employees who are younger or equal to 25 years 
        from those employees who are older than 25 years.
        For this query, we will be using Collectors.partitioningBy()
         method which separates input elements based on supplied Predicate.
        */
        Map <Boolean,List<Employee>> sep = employeeList.stream()
                                                .collect(Collectors.partitioningBy(x->x.getAge()>=25));
                                sep.get(true)
                                .forEach(x->System.out.println("Age > = 25"+x.getName()));
                                sep.get(false)
                                .forEach(x->System.out.println("Age <  25"+x.getName()));


                        
                                                

         /*
         Q15: Who is the oldest employee in the organization? 
         What is his age and which department he belongs to?

         */

         Optional <Employee> oldestEmployee = employeeList.stream()
                                                .max(Comparator.comparing(Employee::getAge));
                        System.out.println(oldestEmployee.get());
    }
}
