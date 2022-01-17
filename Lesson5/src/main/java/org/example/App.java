package org.example;


public class App
{
    public static void main( String[] args )
    {
      Worker[] workers = new Worker[5];
      workers[0] = new Worker("Ivanov", "Ivan", "Ivanovich", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
      workers[1] = new Worker("Karpov", "Roman", "Vladimirovich", "Java-junior", "rosogisoft@gmail.com", "89990030201", 30000, 22);
      workers[2] = new Worker("Baryshev", "Vitaly", "Antonovich", "Sceme-tec", "VitalyBaaarishev@mail.ru", "89131234511", 30000, 22);
      workers[3] = new Worker("Rukavhuk", "Dmitry", "Alekseevich", "VSC-engeneer", "defoDimaEng@gmail.com", "89154256789", 35000, 42);
      workers[4] = new Worker("Starova", "Elena", "Aleksandrovna", "Director", "starovae@mail.com", "89119990202", 45000, 54);

      for (int i = 0; i < workers.length; i++){
          if (workers[i].getAge() >= 40){
              workers[i].info();
          }
      }

    }
}
