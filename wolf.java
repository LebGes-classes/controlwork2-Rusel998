public class wolf extends animal{

    public void printinfo(){
        hf = 20;
        System.out.println("Введите текущее здоровье волка (от 1 до 20 включит.)");
        h = scan.nextInt();
        while(h > hf || h <= 0){
            System.out.println("Введите правильное значение здоровья волка.");
            h = scan.nextInt();
        }
    }
}
