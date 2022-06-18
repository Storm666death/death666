package lesson66;
public class Human {
        private String name;
        private String post;
        private String email;
        private String phoneNumber;
        private int salary;
        private int age;

        public int getAge() {
            return age;
        }

        public Human(String name, String post, String email, String phoneNumber, int salary, int age) {
            this.name = name;
            this.post = post;
            this.email = email;
            this.phoneNumber = phoneNumber;
            this.salary = salary;
            this.age = age;
        }
        public void print() {
            System.out.println("Имя: " + name + " | " + " Должность: " + post + " | " + " e-mail: " + email + " | " +
                    " Тел.: " + phoneNumber + " | " + " ЗП: " + salary + " | " + " Возраст: " + age);
        }
        public static void main(String[] args) {
            Human[] HumanArray = new Human[5];
            HumanArray[0] = new Human("Ivanov Ivan", "Java Developer", "java1@mail.ru", "89279111", 37000, 45);
            HumanArray[1] = new Human("Petrov Petr", "Teamlead", "teamdlead@mail.ru", "89279222", 39000, 44);
            HumanArray[2] = new Human("Morozov Kirill", "QA-Engineer", "qa1@mail.ru", "89279333", 38000, 35);
            HumanArray[3] = new Human("Danilov Nik", "Java Developer", "java2@mail.ru", "89279344", 38000, 35);
            HumanArray[4] = new Human("Dmitriev Dima", "QA-Engineer", "qa2@mail.ru", "89279555", 38000, 28);
            for (int i = 0; i < HumanArray.length; i++) {
                if (HumanArray[i].getAge() > 40) {
                    HumanArray[i].print();
                }
            }
        }
    }
