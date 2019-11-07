public class story {
        // 泛型方法 printArray
        public static < E > void printArray( E[] inputArray )
            {
                // 输出数组元素
                for (E element : inputArray) {
                    System.out.printf("%s ", element);
                }
                System.out.println();
            }
    public static void main(String[] args) {
        // 创建不同类型数组： Integer, Double 和 Character
        Character[] charArray = {'c', 'a', 't','A','N','D','d', 'o', 'g'};
        System.out.println("然后主人家养了两只宠物:");
        printArray(charArray); // 传递一个字符型数组

        show(new Cat());  // 以 Cat 对象调用 show 方法
        show(new Dog());// 以 Dog 对象调用 show 方法
        show(new Master());// 以 Master 对象调用 show 方法
        Animal a = new Cat();  // 向上转型
        a.eat();               // 调用的是 Cat 的 eat
        Cat c = (Cat)a;        // 向下转型
        c.work();        // 调用的是 Cat 的 work
    }

    public static void show(Animal a)  {
        a.eat();
        // 类型判断
        if (a instanceof Cat)  {  // 猫做的事情
            Cat c = (Cat)a;
            c.work();
        } else if (a instanceof Dog) { // 狗做的事情
            Dog c = (Dog)a;
            c.work();
        }
        else if(a instanceof Master){// 主人做的事情
            Master c =(Master)a;
            c.work();
        }
    }
}

    abstract class Animal {
        abstract void eat();
    }

    class Cat extends Animal {
        public void eat() {
            System.out.println("猫吃鱼");
        }
        public void work() {
            System.out.println("猫抓老鼠");
        }
    }

    class Dog extends Animal {
        public void eat() {
            System.out.println("狗吃骨头");
        }
        public void work() {
            System.out.println("狗看家");
        }
    }
    class Master extends Animal{
        public void eat(){
            System.out.println("主人吃饭");
        }
        public void work(){
            System.out.println("主人去银行上班");
        }
    }//部分借鉴于谷歌，故事不具有完整性，望学长学姐不要嫌弃T T
