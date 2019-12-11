public class Banji {

    private String name;
    private String xuehao;
    private int age;
    private int banjihao;
    private double grade;

    public Banji(){}
    public Banji(String name, String xuehao, int age, int banjihao, double grade){
        this.name = name;
        this.xuehao = xuehao;
        this.age = age;
        this.banjihao = banjihao;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getXuehao() {
        return xuehao;
    }

    public void setXuehao(String xuehao) {
        this.xuehao = xuehao;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getBanjihao() {
        return banjihao;
    }

    public void setBanjihao(int banjihao) {
        this.banjihao = banjihao;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Banji{" +
                "name='" + name + '\'' +
                ", xuehao='" + xuehao + '\'' +
                ", age=" + age +
                ", banjihao=" + banjihao +
                ", grade=" + grade +
                '}';
    }
}
