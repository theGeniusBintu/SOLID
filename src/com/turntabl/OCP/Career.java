package com.turntabl.OCP;

public class Career implements AppleProductUser{
    private String job;
    private Integer salary;


    public Career(String job, Integer salary) {
        this.job = job;
        this.salary = salary;
    }

    public String getJob() {
        return job;
    }

    public Integer getSalary() {
        return salary;
    }


    @Override
    public void haveMoney(boolean rich) {
        if (salary >= 1000)
            System.out.println("I'm sure you use an apple product");
        else
            System.out.println("Hustle oo");
    }
}
