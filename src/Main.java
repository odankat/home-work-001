public class Main {
    public static void main(String[] args) {
        //задача 1
     var dog = 8.0;
     var cat = 3.6;
     var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        // задача 2
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        // задача 3
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog+" новое значение dog");
        System.out.println(cat+" новое значение cat");
        System.out.println(paper+" новое значение paper");
        // задача 4
        var friend = 19;
        System.out.println(friend+" друзья праворукие");
        friend = friend + 2;
        System.out.println(friend+" кол-во всех друзей");
        friend = friend / 7;
        System.out.println(friend+" кол-во друзей лудоманов");
        // задача 5
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        // задача 6
        var boxerPetuhov = 78.2;
        var boxerKonopatkin = 82.7;
        System.out.println(boxerPetuhov+boxerKonopatkin + " кг общая масса боксеров");
        System.out.println(boxerKonopatkin-boxerPetuhov+ " кг разница между массами боксеров");
        // задача 7
        var raznica = boxerKonopatkin % boxerPetuhov;
        System.out.println(raznica +" разница ");
        // задача 8
        var watch = 640;
        var openingHours = 8;
        var rabotyagi = watch / openingHours;
        System.out.println(" Всего работников в компании - " + rabotyagi + " человек");
        rabotyagi = rabotyagi + 94; // работяги множатся
        watch = rabotyagi * openingHours; // умножаем
        System.out.println( "Если в компании работает "+rabotyagi+ " человека, то всего  "+ watch+ " часов работы может быть поделено между сотрудниками ");

    }

}



