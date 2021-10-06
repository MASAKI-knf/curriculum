package abstracts;

//抽象クラス: Javaのカリキュラムだけしかこなせないクラス
//public abstract class XXXXX {}
public abstract class JavaCurriculumTrainee {

private String name;

/**
* コンストラクタ
* @param name
*/
public JavaCurriculumTrainee(String name) {
this.name = name;
}

/**
* 抽象メソッド: Javaカリキュラムをこなす！
* public abstract void xxxxx();
*/
public abstract void doJavaCurriculum();

/**
* @return name
*/
protected String getName() {
return name;
}

}
