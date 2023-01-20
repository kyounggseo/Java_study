package SERVER_SIDE_JAVASCRIPT;

public abstract class Character { //추상클래스
    protected int hp;
    protected int level = 0 ;
    protected int energy;

    public abstract void eat(); //메서드를 구현하지 않고 선언만 하는 것 => 추상메서드 , 하위클래스에서 알아서 알맞게 재정의하여 사용하라는 의미

    public abstract void sleep();

    public abstract boolean paly();

    public abstract boolean train();

    public abstract void levelUp();

    public boolean checkEnergy() {
        if(energy <= 0) {
            return true;
        }else{
            return false;
        }
    }
    
    public void printInfo() { //메서드
    System.out.println("현재 캐릭터의 정보 출력");
    System.out.println("hp = " + hp);
    System.out.println("energy = " + energy);
    System.out.println("level = " + level);
    }
}
