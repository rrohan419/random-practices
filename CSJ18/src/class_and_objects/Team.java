package class_and_objects;

public class Team
{
    public static void main(String[] args) {
        Team sachin = new Team("india","sachin",295,45.51,53.90);
        System.out.println(sachin.toString());
    }
    private String Country,name;
    private int no_of_matches;
    private double batting_avg,balling_avg;

    public Team(String country, String name, int no_of_matches, double batting_avg, double balling_avg) {
        Country = country;
        this.name = name;
        this.no_of_matches = no_of_matches;
        this.batting_avg = batting_avg;
        this.balling_avg = balling_avg;
    }

    public String getCountry() {
        return Country;
    }

    public String getName() {
        return name;
    }

    public int getNo_of_matches() {
        return no_of_matches;
    }

    public double getBatting_avg() {
        return batting_avg;
    }

    public double getBalling_avg() {
        return balling_avg;
    }

    @Override
    public String toString() {
        return "Team{" +
                "Country= '" + Country + '\'' +
                ", name= '" + name + '\'' +
                ", no_of_matches= " + no_of_matches +
                ", batting_avg = " + batting_avg +
                ", balling_avg = " + balling_avg +
                '}';
    }
}
