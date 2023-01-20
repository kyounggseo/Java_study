package SERVER_SIDE_JAVASCRIPT;

import java.util.Scanner;

public class PlayGame {
    private Character character;
    private int menu;
    private boolean exit;

    public PlayGame(Character character) {
        this.character = character;
    }

    public void printMenu(Scanner sc) {
        System.out.println("1.밥먹이기 2.잠재우기 3.놀아주기 4.운동시키기 5.종료");

        menu = sc.nextInt();
        play();
    }

    public void play() {
        switch(menu) {
            case 1 :
                character.eat();
                break;
            case 2 :
                character.sleep();
                break;
            case 3 :
                character.paly();
                break;
            case 4 :
                character.train();
                break;
            case 5 :
                exit = true;
        }
        character.printInfo();
    }

    public Character getCharacter() {
        return character;
    }

    public void setCharxcter(Character character) {
        this.character = character;
    }

    public int getMenu() {
        return menu;
    }

    public void setMenu(int menu) {
        this.menu = menu;
    }

    public boolean isExit() {
        return exit;
    }

    public void setExit(boolean exit) {
        this.exit = exit;
    }
}