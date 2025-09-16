package myImpl;

public class TestClass  {
    private String name;
    private Integer idade;

    public TestClass(String name) {
        this.name = name;
    }

    public TestClass(String name, Integer idade) {
        this.name = name;
        this.idade = idade;
    }

    public String getName() {
        return name;
    }


    @Override
    public String toString() {
        return "TestClass{" +
               "name='" + name + '\'' +
               '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

}
