package Day6;

import java.util.Random;

public class Teacher {
    private String fio;
    private String subject;

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Teacher(String fio, String subject) {
        this.fio = fio;
        this.subject = subject;
    }

    public void evaluate(Student student) {
        Random random = new Random();
        int randomValue = random.nextInt(4) + 2;
        String evaluation = "";
        switch (randomValue) {
            case 2:
                evaluation = "Неуд";
                break;
            case 3:
                evaluation = "Уд";
            case 4:
                evaluation = "Хор";
            case 5:
                evaluation = "Отл";
        }
        System.out.println("Преподователь " + this.fio + "оценил студента с именем " +student.getFio() + "по предмету" + this.subject + "Имя предметя" + "на оценку" + evaluation) ;
    }
}
