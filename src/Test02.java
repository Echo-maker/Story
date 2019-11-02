public class Test02 {
        public static void main(String[] args) {

            Player player = new Player();
            String select = "法力角色";
            System.out.println("选择:" + select);
            FightAble f = player.select(select);
            f.specialFight();
            f.commonFight();

            System.out.println("=================");
            select = "武力角色";
            System.out.println("选择:" + select);
            FightAble f2 = player.select(select);
            f2.specialFight();
            f2.commonFight();

        }
    }

    class Player {
        public FightAble select(String str) {

            if ("法力角色".equals(str)) {
                return new FaShi();
            } else if ("武力角色".equals(str)) {
                return new ZhanShi();
            }

            return null;
        }

    }

    class FaShi implements FightAble {
        @Override
        public void specialFight() {

            System.out.println("法术攻击");
        }
    }

    class ZhanShi implements FightAble {
        @Override
        public void specialFight() {
            System.out.println("武器攻击");
        }
    }

    interface FightAble {
        public abstract void specialFight();

        public default void commonFight() {
            System.out.println("普通打击");
        }
    }
