import java.util.ArrayList;

public class Cattle {
    private String name;
    protected boolean walk;
    protected boolean swim;
    protected ArrayList<String> abilities = new ArrayList<String>();

    public void setName(String ten) {
        this.name = ten;
    }

    public String getName() {
        return name;
    }

    public void addAlb() {
        if(walk){
            abilities.add("walk");
        }
        else if(swim){
            abilities.add("swim");
        }
    }

    public String getAlb() {
        if(abilities.size() == 1)
            return abilities.get(0);
        else
            return abilities.get(0) + " " + abilities.get(1);
    }
}

class Pig extends Cattle {
    Pig hello() {
        walk = true;
        return this;
    }
}

class Duck extends Cattle {
    Duck annyeonghaseyo() {
        walk = true;
        swim = true;
        return this;
    }
}

class Fish extends Cattle {
    Fish bonjour() {
        swim = true;
        return this;
    }
}
