package abstracts;

//「Javaのカリキュラムだけこなせよ！って決まりごとがある抽象クラス」を継承した研修生クラス
public class Trainee extends JavaCurriculumTrainee {

public Trainee(String name) {
super(name);
}

@Override
public void doJavaCurriculum() {
System.out.println("わたくし、" + super.getName() + "は、Javaカリキュラムをこなします(｀･ω･´)ゞ！");
}

}
