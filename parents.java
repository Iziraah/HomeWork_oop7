import java.util.ArrayList;

public class parents {
  public static void main(String[] args) {
    Person varvara = new Person("Varvara", Sex.FEMALE);
    Person vasiliy = new Person("Vasiliy", Sex.MALE);
    Person vladimir = new Person("Vladimir", Sex.MALE);
    Person nadezhda = new Person("Nadezhda", Sex.FEMALE);
    Person ilya = new Person("Ilya", Sex.MALE);
    Person aleksandr = new Person("Aleksandr", Sex.MALE);
    Person kseniya = new Person("Kseniya", Sex.FEMALE);
    Person mariia = new Person("Mariia", Sex.FEMALE);
    Person timofei = new Person("Timofei", Sex.MALE);
    Person aleksandra = new Person("Aleksandra", Sex.FEMALE);
    Person petr = new Person("Petr", Sex.MALE);   
    Person galina = new Person("Galina", Sex.FEMALE);
    Person elena = new Person("Elena", Sex.FEMALE);
    Person sergey = new Person("Sergey", Sex.MALE);

    GeoTree gt = new GeoTree();
    gt.append(varvara, vasiliy);
    gt.append(vasiliy, nadezhda);
    gt.append(galina, nadezhda);
    gt.append(galina, vladimir);
    gt.append(vasiliy, vladimir);
    gt.append(vladimir, ilya);
    gt.append(elena, ilya);
    gt.append(vladimir, aleksandr);
    gt.append(elena, aleksandr);
    gt.append(nadezhda, kseniya);
    gt.append(nadezhda, mariia);
    gt.append(sergey, mariia);
    gt.append(sergey, kseniya);
    gt.append(kseniya, timofei);
    gt.append(kseniya, aleksandra);
    gt.append(kseniya, petr);
    gt.appendSpouse(vasiliy, galina);
    gt.appendSpouse(vladimir, elena);
    gt.appendSpouse(nadezhda, sergey);

    System.out.println(new ResearchParents(gt).spend(ilya, Relationship.CHILDREN));
    System.out.println(new ResearchPapaMama(gt).spend(ilya, Relationship.CHILDREN, Sex.MALE));
    System.out.println(new ResearchBro(gt).spend(timofei));
  }
}


