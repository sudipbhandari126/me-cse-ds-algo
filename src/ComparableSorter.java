import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ComparableSorter {

  public static void main(String[] args) {
    Person ram = new Person(10, 100, "ram");
    Person shyam = new Person(20, 50, "shyam");
    Person anil = new Person(15, 200, "anil");
    List<Person> persons = Arrays.asList(ram,shyam,anil);
    Collections.sort(persons);
    System.out.println(persons);
  }
}


class Person implements Comparable<Person>{
  int age;
  int income;
  String name;

  public Person(int age, int income, String name) {
    this.age = age;
    this.income = income;
    this.name = name;
  }

  @Override
  public int compareTo(Person o) {
    return this.name.compareTo(o.name);
//    return this.age-o.age;
//    return this.income-o.income;

  }

  @Override
  public String toString() {
    return "Person{" +
        "age=" + age +
        ", income=" + income +
        ", name='" + name + '\'' +
        '}';
  }
}
