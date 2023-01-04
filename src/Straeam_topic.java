import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Straeam_topic {



    void gg(){

        List<String> gji = Arrays.asList(

                "N40", "n36", "b12", "b6", "g53", "g60","G238","g554");
        ArrayList<String> Gts=new ArrayList<>();


        /*gji.forEach(number -> {
                    if (number.toUpperCase().startsWith("G")) {

                        Gts.add(number);
                        System.out.println(number);
                    }
                }

        );*/

        //Gts.sort((String s1,String s2)->s1.compareTo(s2));
        //Gts.forEach((String sd)->System.out.println(sd));

        gji.stream().map(String::toUpperCase).filter(s->s.startsWith("G")).sorted().forEach(System.out::println);


        Stream<String>io=Stream.of("ds","dsad");
        Stream<String>in=Stream.of("ds","dsaadsd","asd");
        Stream concatr=Stream.concat(io,in);
        System.out.println(concatr.distinct().peek(System.out::println).count());

        Employee john=new Employee("john doe",30);
        Employee jack=new Employee("jack doe",40);
        Employee Mike=new Employee("carl dsam",20);
        Employee carl=new Employee("akaka",20);


        Department hr=new Department("Human resources");
        hr.addEmployee(Mike);
        hr.addEmployee(carl);
        hr.addEmployee(jack);
        Department accounting=new Department("Acoounting");
        accounting.addEmployee(john);


        List<Department> departments=new ArrayList<>();
        departments.add(hr);
        departments.add(accounting);


        //departments.stream().flatMap(department -> department.getEmployees().stream())
                //.forEach(System.out::println);


        Map<Integer,List<Employee>> groupBy=departments.stream().flatMap(department -> department.getEmployees().stream())
                .collect(Collectors.groupingBy(employee -> employee.getAge()));

        departments.stream().flatMap(department -> department.getEmployees().stream())
                .reduce((e1,e2)->e1.getAge()< e2.getAge()?e1:e2)
                .ifPresent(System.out::println);













    }



    class Employee{
        private String name;
        private int age;



        public Employee(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return  name;
        }






    }


    class Department{



        private String name;
        private List<Employee> employees;

        public Department(String name){
            this.name=name;
            employees=new ArrayList<>();
        }



        public void addEmployee(Employee employee)
        {
            employees.add(employee);
        }

        public List<Employee> getEmployees(){
            return employees;
        }



    }



}


