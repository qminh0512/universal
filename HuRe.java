public class HuRe {
    public class Lecturer{
        private String name;
        private String bday;

        public Lecturer(){
            name = "tran manh cuong";
            bday = "idk";
        }

        public Lecturer(name, bday){
            this.name = name;
            this.bday = bday;
        }

        public Lecturer(Lecturer s){
            this.name = s.name;
            this.bday = bday;
        }

        public String getBday() {
            return bday;
        }

        public void setBday(String bday) {
            this.bday = bday;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public class Person{
        private String name;
        private String bday;

        public Person(){
            name = "tran manh cuong";
            bday = "14/10/1999";
        }

        public Person(name, bday){
            this.name = name;
            this.bday = bday;
        }

        public Person(Person s){
            this.name = s.name;
            this.bday = bday;
        }

        public String getBday() {
            return bday;
        }

        public void setBday(String bday) {
            this.bday = bday;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

    }

    public class Student{
        private String name;
        private String bday;
        private String id;

        public Student(){
            name = "tran manh cuong";
            bday = "14/10/1999";
            id = "imstupid";
        }

        public Student(name, bday, id){
            this.name = name;
            this.bday = bday;
            this.id = id;
        }

        public Person(Person s){
            this.name = s.name;
            this.bday = s.bday;
            id = "imstupid";
        }

        public String getBday() {
            return bday;
        }

        public void setBday(String bday) {
            this.bday = bday;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setId(String res){ this.id = res; }

        public String getId() { return id; }
    }
}
