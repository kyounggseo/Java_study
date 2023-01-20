package SERVER_SIDE_JAVASCRIPT;

public class Picachu extends Character {

    public Picachu() {
        System.out.println("피카추 선택");
        hp = 30;
        energy = 50;
        System.out.println("피카추가 생성되었습니다.");
        printInfo();
    }

    @Override
    public void eat() {
        energy += 10;
        
    }

    @Override
    public void sleep() {
        energy += 5;
    }

    @Override
    public boolean paly() {

        energy -= 20;
        hp += 5;
        levelUp();
        return checkEnergy();
    }

    @Override
    public boolean train() {
        energy -= 15;
        hp += 20;
        levelUp();
        return checkEnergy();
    }

    @Override
    public void levelUp() {
        if(40 <= hp) {
            level++;
            hp -=40;
        }
   
    }
    
}
