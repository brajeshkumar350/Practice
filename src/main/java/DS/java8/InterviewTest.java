package DS.java8;

import java.util.*;
import java.util.stream.Collectors;

public class InterviewTest {
    public static void main(String[] args) {


        Address ad=new Address("patna", 400000);

        Address ad1=new Address("ranchi", 600000);
        Address ad2=new Address("ranchi1", 700000);
        Employee em1=new Employee("a", "b", ad);
        Employee em2=new Employee("a1", "b1", ad1);
        Employee em3=new Employee("a3", "b3", ad2);
        List<Employee> list=Arrays.asList(em1,em2,em3);

        List<Address> zip=list.stream().filter(em->em.address.zipoode>500000).sorted(Comparator.comparingInt(e->e.address.zipoode)).map(employye->employye.address).collect(Collectors.toList());
        zip.stream().forEach(System.out::println);
    }
}
class Employee
{
    String firstName;
    String lastName;
    Address address;
    public Employee() {}
    public Employee(String firstName, String lastName, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

}
class Address
{
    String city;
    int zipoode;
    public Address() {
        // TODO Auto-generated constructor stub
    }
    public Address(String city, int zipoode) {
        this.city = city;
        this.zipoode = zipoode;
    }
    @Override
    public String toString() {
        return "Address [city=" + city + ", zipoode=" + zipoode + "]";
    }


}
