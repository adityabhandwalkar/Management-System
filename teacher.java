package school_management;

public class teacher {
    private  int id;
    private  String name;
    private  int salary;
    private  int salaryearned ;
    /**
     * salary for each teacher will be different based on different criterion
     *
     * @param id
     * @param name
     * @param salary
     */
    public teacher(int id, String name,int salary){
        this.id =id;
        this.name= name;
        this.salary= salary;
        this.salaryearned =0;
    }

    /**
     * returning the ids, name , salary for
     * @return
     */
    public int getId() {
        return id;
    }

    public String getName(){
        return  this.name;
    }
    public int getSalary(){
        return  salary;
    }

    /**
     * setting the salary of teacher
     * @param salary
     */
    public void  setSalary(int salary){
        this.salary = salary;
    }
    public  void receivesalary(int salary){
        salaryearned += salary;
        mangementSystem.updateTotalMoneyspent(salary);

    }
    }
