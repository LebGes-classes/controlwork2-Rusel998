public class ship extends animal{
    //расстояние между животными
    public int r;
    //констанста атаки волка
    public final int d = 4;
    ship(){
        hf = 8;
        System.out.println("Введите текущее здоровье овцы (от 1 до 8 включит.)");
        h = scan.nextInt();
        while(h > hf || h <= 0){
            System.out.println("Введите правильное значение здоровья овцы.");
            h = scan.nextInt();
        }
        System.out.println("Введите расстояние от волка до овцы.");
        r = scan.nextInt();
        while(r == 0){
            System.out.println("Расстояние не может быть равно нулю");
            r = scan.nextInt();
        }
    }
    public void attacked(){
        double res = (((double) h / hf) * (d / Math.pow(r, 2)));
        double curhp = h;
        curhp -= res;
        System.out.println("У овцы отнялось " + res + " единиц здоровья.");
        int counter = 1;
        while (curhp > 0) {
            curhp -= res;
            counter++;
        }
        System.out.println("Волк загасит овцу за " + counter + " сек");

    }
}
