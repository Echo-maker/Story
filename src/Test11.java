import java.util.Date;                                    //导入包
 public class Test11 {
     public static void main(String [] args){
         CatFather growUp=new CatFather();                //创建对象
                growUp.biger(35);                                //调用方法
         growUp.inLove(35);
          BadDog Fight= new BadDog();
                 Fight.fight();
              Boss fight2 = new Boss();
              fight2.fight1();
     }
 }
abstract class RiverSide{                //抽象父类
     String name;                        //抽象属性
     String style;
     int age;
     String skills;
 }
 class CatFather extends RiverSide{                                    //继承
     String name = "杨康";
     String style = "caption";
     int age = 0;
     String action = "吃饭、睡觉、打豆豆、喝水、玩、学习！";
     String skills = "葵花宝典、九阳神功、乾坤大罗移。";
     long y= new Date().getTime();                                    //新建对象调用方法
      Date time=new Date(y);                                            //建对象

     float weight;
  void biger(int n){                                                //成长阶段
       int i;
                 for(i=0;i<=n;i++){                                            //成长过程中体重的变化
                     {
                         if (n <= 20) {
                             System.out.println("杨康还没长大，正在努力学习技能！");
                             break;
                         }
                         if (n >= 100) {
                             System.out.println("杨康已经死了！");
                             break;
                         }
                         if (i == 0) {
                             weight = 3.8f;
                             System.out.print(time + "年一只黑色的小猫出生了，重" + weight + "kg。" + "取名叫做" + name + "。");
                         } else if (i > 0 && i <= 20) {
                             double j = 2.5;
                             weight += j;
                         } else if (i < 25) {
                             double j = 2;
                             weight += j;
                         }
                     }
                 }System.out.println(20+"年后，"+name+"每天"+action+"长到了"+weight+"kg,学会了"+skills);
  }
     void inLove(int n){                                                //恋爱阶段
               for(int i=0;i<=n;i++)
               {
                   if(n<=30){
                                System.out.println("小猫还没找到女朋友!");
                                break;
                   }
               if(n>=200){
                                System.out.println("小猫已经死了!");
                              break;
               }
                   }System.out.println(name+"和穆连慈恋爱了，并有了孩子，取名叫杨过，杨康把自己的神功都交给了杨过。");
           }

}
 class BadDog extends RiverSide{                                        //继承
     String name = "欧阳锋";
     String style = "Teddy";
     int age = 3;
   String skills = "七伤拳、混元霹雳手、辟邪剑法。";
     void fight(){
         System.out.println("王重阳家还有一个名叫"+name+"的人，他会"+skills);
     System.out.println("有一天他们打起来了，"+name+"使用了"+skills+"杨康使用了葵花宝典、九阳神功、乾坤大罗移。");
     System.out.println("一时间刀光剑影、猫拳狗腿，打碎了玻璃，弄乱了房间.");
     }
 }
 class Boss extends RiverSide{                                        //继承
     String name = "王重阳";
    String style = "全真教";
     int age = 30;
     String skills = "眉来眼去剑、情意绵绵刀";
    void fight1(){
        System.out.println(age+"岁的"+style+" "+name+"看到后很生气，使用"+skills+"把杨康和欧阳锋打成重伤，把欧阳锋终生监禁，并把杨康赶了出去！");
        System.out.println("一年后杨康郁闷至死。\n十年后，杨过和她妈也都饿死了！");
            }
 }

